package aplicacao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    private String nomeArquivo;

    public Database(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void salvarDados(List<String> dados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            for (String linha : dados) {
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> carregarDados() {
        List<String> dados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                dados.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dados;
    }

    public void excluirDados(String dado) {
        List<String> dadosExistentes = carregarDados();
        dadosExistentes.remove(dado);
        salvarDados(dadosExistentes);
    }

    public static void main(String[] args) {
        Database meuBancoDeDados = new Database("dados.txt");
        Scanner scanner = new Scanner(System.in);

        // Exemplo de leitura de uma string
        System.out.print("Digite seu nome: ");
        String dadoInputado = scanner.nextLine();

        // Salvar dados
        List<String> dadosParaSalvar = new ArrayList<>();
        dadosParaSalvar.add(dadoInputado);
        meuBancoDeDados.salvarDados(dadosParaSalvar);

        // Carregar dados
        List<String> dadosCarregados = meuBancoDeDados.carregarDados();

        // Exibir dados
        System.out.println("Dados carregados:");
        for (String dado : dadosCarregados) {
            System.out.println(dado);
        }
    }
}
