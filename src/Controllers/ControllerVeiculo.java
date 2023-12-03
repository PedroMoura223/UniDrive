package Controllers;

import aplicacao.Veiculo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerVeiculo {

    private static final String FILE_PATH = "src\\Database\\veiculos.txt";

    public static void cadastrarVeiculo(Veiculo veiculo) {
        List<Veiculo> veiculos = carregarVeiculosDoArquivo();
        veiculos.add(veiculo);
        salvarVeiculosNoArquivo(veiculos);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    public static List<Veiculo> listarVeiculos() {
        return carregarVeiculosDoArquivo();
    }

    public static Veiculo obterVeiculoPorId(int id) {
        List<Veiculo> veiculos = carregarVeiculosDoArquivo();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == id) {
                System.out.println("Veículo encontrado: " + veiculo);
                return veiculo;
            }
        }
        System.out.println("Veículo com o ID " + id + " não encontrado.");
        return null;
    }

    public static void excluirVeiculo(int id) {
        List<Veiculo> veiculos = carregarVeiculosDoArquivo();
        veiculos.removeIf(veiculo -> veiculo.getId() == id);
        salvarVeiculosNoArquivo(veiculos);
        System.out.println("Veículo excluído com sucesso!");
    }

    public static void excluirTodosVeiculos() {
        salvarVeiculosNoArquivo(new ArrayList<>());
        System.out.println("Todos os veículos excluídos com sucesso!");
    }

    public static void exibirVeiculos() {
        List<Veiculo> veiculos = carregarVeiculosDoArquivo();
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    private static void salvarVeiculosNoArquivo(List<Veiculo> veiculos) {
        try (ObjectOutputStream escritorObjeto = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            escritorObjeto.writeObject(veiculos);
        } catch (IOException e) {
            System.err.println("Erro ao salvar veículos no arquivo: " + e.getMessage());
        }
    }

    public static List<Veiculo> carregarVeiculosDoArquivo() {
        try (ObjectInputStream leitorObjeto = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            @SuppressWarnings("unchecked")
            List<Veiculo> veiculos = (List<Veiculo>) leitorObjeto.readObject();
            System.out.println("Veículos carregados com sucesso do arquivo!");
            return veiculos;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar veículos do arquivo: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
