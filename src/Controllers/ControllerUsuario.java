package Controllers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import aplicacao.Usuario;

public class ControllerUsuario {

    private static final String FILE_PATH = "src\\Database\\usuarios.txt";

    public static void criarUsuario(Usuario novoUsuario) {
        List<Usuario> usuarios = carregarUsuariosDoArquivo();

        if (usuarioComMatriculaExistente(novoUsuario.getMatricula(), usuarios)) {
            System.out.println("Erro: Já existe um cliente com a matrícula " + novoUsuario.getMatricula());
            return;
        }

        usuarios.add(novoUsuario);
        salvarUsuariosNoArquivo(usuarios);
        System.out.println("Cliente criado com sucesso!");
    }

    public static List<Usuario> listarUsuarios() {
        return carregarUsuariosDoArquivo();
    }

    public static void removerUsuario(int matricula) {
        List<Usuario> usuarios = carregarUsuariosDoArquivo();
        usuarios.removeIf(usuario -> usuario.getMatricula() == matricula);
        salvarUsuariosNoArquivo(usuarios);
        System.out.println("Usuário removido com sucesso!");
    }

    public static List<Usuario> carregarUsuariosDoArquivo() {
        try (ObjectInputStream leitorObjeto = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            @SuppressWarnings("unchecked")
            List<Usuario> usuarios = (List<Usuario>) leitorObjeto.readObject();
            System.out.println("Usuários carregados com sucesso do arquivo!");
            return usuarios;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar usuários do arquivo: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private static void salvarUsuariosNoArquivo(List<Usuario> usuarios) {
        try (ObjectOutputStream escritorObjeto = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            escritorObjeto.writeObject(usuarios);
        } catch (IOException e) {
            System.err.println("Erro ao salvar usuários no arquivo: " + e.getMessage());
        }
    }

    private static boolean usuarioComMatriculaExistente(int matricula, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario.getMatricula() == matricula) {
                return true;
            }
        }
        return false;
    }
}
