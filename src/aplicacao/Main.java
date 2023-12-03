package aplicacao;

import java.util.Scanner;

public class Main {

	public static void visaoCliente(Cliente cliente, Scanner scanner) {

		System.out.println("\n --------------------- \n\n [Menu Cliente] " + "Olá " + cliente.nome);
		System.out.println(
				"\n Qual operação deseja realizar?\r\n 1 - Adicionar Saldo \r\n 2 - Consultar Saldo\r\n 3 - Alugar Veículo\r\n \r\n 4 - Sair");

		String resposta = scanner.nextLine();
	}

	public static void visaoAdministrador(Administrador administrador, Scanner scanner) {

		System.out.println("\n --------------------- \n\n [Menu Administrador] " + "Olá " + administrador.nome);
		System.out.println(
				"\n Qual operação deseja realizar?\r\n 1 - Cadastrar Veículo \r\n 2 - Remover Veículo\r\n 3 - Emitir Relatório de Lucros\r\n 3 - Emitir Ticket \r\n 5 - Sair");

		String resposta = scanner.nextLine();

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\n [Tela Inicial] \n Digite seu Tipo de Conta: \n 1 - Cliente \n 2 - Admin \n");
		String tipoConta = scanner.nextLine();

		System.out.print(" \n --------------------- \n\n [Fazer Login] \n\n Digite seu Login: ");
		String login = scanner.nextLine();

		System.out.print("\n Digite sua Senha: ");
		String senha = scanner.nextLine();

		if ("1".equals(tipoConta)) {

			Cliente cliente = new Cliente(1, "Pedro Moura", "pedromoura@gmail.com", 100.0f); // Dados que vem do Banco
			visaoCliente(cliente, scanner);
		}

		if ("2".equals(tipoConta)) {

			Administrador administrador = new Administrador(1, "Gustavo Cassimiro", "gustavocassimiro@gmail.com", 1); // Dados
																														// que
																														// vem
																														// do
																														// Banco
			visaoAdministrador(administrador, scanner);
		}

		scanner.close();
	}
}
