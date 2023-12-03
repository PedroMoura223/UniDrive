package aplicacao;
import java.util.Scanner;
public class programaAdm {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Administrador administrador = new Administrador(1, "Admin", "admin@example.com", 123);

        int opcao;
        do {
            exibirMenu();
            System.out.println("Escolha uma opção (ou 0 para sair):");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    administrador.cadastrarVeiculo();
                    break;
                case 2:
                    administrador.cadastrarCliente();
                    break;
                case 3:
                    administrador.emitirRelatorio();
                    break;
                case 4:
                    administrador.emitirRelatorioClientes();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("---- Menu ----");
        System.out.println("1. Cadastrar Veículo");
        System.out.println("2. Cadastrar Usuário");
        System.out.println("3. Emitir Relatório dos veiculos");
        System.out.println("4. Emitir Relatório dos clientes");
        System.out.println("0. Sair");
        System.out.println("--------------");
    }
}
