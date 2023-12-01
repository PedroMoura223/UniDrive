package aplicacao;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	static EstacaoVeiculo veiculoPici = new EstacaoVeiculo("Veiculo - Campus do Pici");
	static EstacaoVeiculo veiculoBenfica = new EstacaoVeiculo("Veiculos - Campus do Pici");

	static EstacaoTicket ticketPici = new EstacaoTicket("Igor Neves", "Ticket - Campus do Pici");
	static EstacaoTicket ticketBenfica = new EstacaoTicket("Gustavo Cassimiro", "Ticket - Campus do Benfica");

	public static void adicionarSaldo(Cliente cliente) {

		System.out.println("--------------------- \n\n [Adicionar Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Qual Valor deseja Adicionar?\r\n ");

		String valorAdicionar = scanner.nextLine();

		cliente.ticket.setCreditos(Float.parseFloat(valorAdicionar));

		System.out.println("--------------------- \n\n [Adicionar Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Saldo Adicionado com Sucesso! \n Saldo Atual: " + cliente.ticket.getCreditos());
		System.out.println("\n Aperte Enter para voltar ao Menu Principal");

		String resposta = scanner.nextLine();

		visaoCliente(cliente);
	}

	public static void consultarSaldo(Cliente cliente) {
		System.out.println("--------------------- \n\n [Consulta Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Saldo Atual: " + cliente.ticket.getCreditos());
		System.out.println("\n Aperte Enter para voltar ao Menu Principal");

		String resposta = scanner.nextLine();

		visaoCliente(cliente);
	}

	public static void visaoEstacaoTicket(Cliente cliente) {
		System.out.println("--------------------- \n\n [Emitir Ticket]");
		System.out.println(
				"\n Em qual estação deseja emitir o Ticket?\r\n 1 - Campus Pici \r\n 2 - Campus Benfica\r\n \r\n 0 - Sair\r\n");

		String resposta = scanner.nextLine();

		switch (resposta) {
		case "1":
			ticketPici.emitirTicket(cliente, ticketPici, veiculoPici);
			System.out.println("Ticket emitido em: " + cliente.ticket.getEstacaoEmissao());
			break;

		case "2":
			ticketBenfica.emitirTicket(cliente, ticketBenfica, veiculoBenfica);
			System.out.println("Ticket emitido em: " + cliente.ticket.getEstacaoEmissao());
			break;

		case "0":
			visaoCliente(cliente);
			break;

		default:
			System.err.println("---------------------------");
			System.err.println(" [ALERTA] Valor Inválido");
			System.err.println("---------------------------");
			visaoEstacaoTicket(cliente);
			break;
		}

		visaoCliente(cliente);
	}

	public static void visaoEstacaoVeiculo(Cliente cliente) {
		System.out.println(
				"--------------------- \n\n [Estação " + cliente.ticket.getEstacaoEmissao().getNomeEstacao() + "]");
		System.out.println(
				"\n Qual operação deseja realizar?\r\n 1 - Alugar Veículo \r\n 2 - Devolver Veículo\r\n \r\n 0 - Sair\r\n");

		if(cliente.getVeiculo() != null) {
			
			System.out.println("[MESSAGEM] Você já está com um veículo alugado \n");
		}
		
		String resposta = scanner.nextLine();

		switch (resposta) {
		case "1":
			System.out.println("\n Qual veículo deseja alugar?");
			System.out.println(" Seu saldo é: R$ " + cliente.ticket.getCreditos());
			System.out.println(" 1 - Skate Elétrico > R$ " + SkateEletrico.preco);
			System.out.println(" 2 - Monociclo Elétrico > R$ " + MonocicloEletrico.preco);
			System.out.println("\n 0 - Sair");

			String tipoVeiculo = scanner.nextLine();

			EstacaoVeiculo estacaoVeiculo = cliente.ticket.getEstacaoVeiculo();

			switch (tipoVeiculo) {
			case "1":
			case "2":
				estacaoVeiculo.alugarVeiculo(cliente, tipoVeiculo);
				visaoEstacaoVeiculo(cliente);
				break;

			case "0":
				visaoCliente(cliente);
				break;

			default:
				System.err.println("---------------------------");
				System.err.println(" [ALERTA] Valor Inválido");
				System.err.println("---------------------------");
				visaoEstacaoVeiculo(cliente);
				break;
			}

			break;

		case "2":
			if (cliente.getVeiculo() == null) {
				System.err.println("---------------------------");
				System.err.println(" [ALERTA] Veículo Não Encontrado");
				System.err.println("---------------------------");
				visaoEstacaoVeiculo(cliente);
			}
			
			Veiculo veiculo = cliente.getVeiculo();
			System.out.println("------------------------------------");
			System.out.println("Deseja mesmo devolver o veículo?");
			System.out.println("------------------------------------");
			if(veiculo instanceof MonocicloEletrico) {
				System.out.println(" Veículo Alugado: " + ((MonocicloEletrico) veiculo).tipo);
			}
			if(veiculo instanceof SkateEletrico) {
				System.out.println(" Veículo Alugado: " + ((SkateEletrico) veiculo).tipo);
			}

			System.out.println("\n 1 - Confirmar");
			System.out.println(" 0 - Sair");
			
			String confirmacao = scanner.nextLine();
			
			switch(confirmacao) {
			case "1":
				cliente.devolverVeiculo();
				System.out.println("\n [MESSAGEM] Veículo Devolvido");
				visaoEstacaoVeiculo(cliente);
				break;
			
			case "0":
				visaoEstacaoVeiculo(cliente);
				break;
				
			default:
				System.err.println("---------------------------");
				System.err.println(" [ALERTA] Valor Inválido");
				System.err.println("---------------------------");
				visaoEstacaoVeiculo(cliente);
				break;
			}
			break;
			
		case "0":
			visaoCliente(cliente);
			break;

		default:
			System.err.println("---------------------------");
			System.err.println(" [ALERTA] Valor Inválido");
			System.err.println("---------------------------");
			visaoEstacaoVeiculo(cliente);
			break;
		}
	}

	public static void visaoCliente(Cliente cliente) {

		System.out.println("--------------------- \n [Menu Cliente] " + "Olá " + cliente.getNome());
		System.out.println(
				"\n Qual operação deseja realizar?\r\n 1 - Adicionar Saldo \r\n 2 - Consultar Saldo\r\n \r\n 3 - Emitir Ticket\r\n 4 - Alugar Veículo\r\n \r\n 0 - Sair");

		String operacao = scanner.nextLine();

		switch (operacao) {
		case "1":
			if (cliente.ticket == null) {
				System.err.println("----------------------------------");
				System.err.println("[ALERTA] Ticket não encontrado.");
				System.err.println("----------------------------------");
				visaoCliente(cliente);
				break;
			}

			adicionarSaldo(cliente);
			break;

		case "2":
			if (cliente.ticket == null) {
				System.err.println("----------------------------------");
				System.err.println("[ALERTA] Ticket não encontrado.");
				System.err.println("----------------------------------");
				visaoCliente(cliente);
				break;
			}
			consultarSaldo(cliente);
			break;

		case "3":
			visaoEstacaoTicket(cliente);
			break;

		case "4":
			if (cliente.ticket == null) {
				System.err.println("----------------------------------");
				System.err.println("[ALERTA] Necessário Ticket");
				System.err.println("----------------------------------");
				visaoCliente(cliente);
				break;
			}
			visaoEstacaoVeiculo(cliente);
			break;

		case "0":
			cliente = null;
			Menu();
			break;

		default:
			System.err.println("----------------------------------");
			System.err.println("[ALERTA] Valor Inválido");
			System.err.println("----------------------------------");
			visaoCliente(cliente);
			break;
		}
	}

	public static void visaoAdministrador(Administrador administrador) {

		System.out.println("--------------------- \n\n [Menu Administrador] " + "Olá " + administrador.nome);
		System.out.println("[" + administrador.getEstacao() + "]");
		System.out.println(
				"\n Qual operação deseja realizar?\r\n 1 - Cadastrar Veículo \r\n 2 - Remover Veículo\r\n 3 - Emitir Relatório de Lucros\r\n 4 - Emitir Ticket \r\n 0 - Sair");

		String resposta = scanner.nextLine();

	}

	public static void Menu() {

		System.out.print("[Tela Inicial] \n\n Digite seu Tipo de Conta: \n 1 - Cliente \n 2 - Admin \n");
		String tipoConta = scanner.nextLine();

		switch (tipoConta) {
		case "1":
			System.out.print("--------------------- \n\n [Fazer Login] \n\n Digite seu Nome: ");
			String nome = scanner.nextLine();

			System.out.print(" Digite seu Email: ");
			String email = scanner.nextLine();

			Cliente cliente = new Cliente(nome, email);
			visaoCliente(cliente);
			break;

		case "2":
			System.out.print("--------------------- \n\n [Fazer Login] \n\n Digite sua credencial: ");
			String credencial = scanner.nextLine();
			System.out.println(credencial);

			if (credencial == "1234") {
				Administrador administrador = new Administrador("Gustavo Cassimiro", "gustavo@gmail.com", credencial);
				visaoAdministrador(administrador);
			} else if (credencial == "4321") {
				Administrador administrador = new Administrador("Igor Neves", "igor@gmail.com", credencial);
				visaoAdministrador(administrador);
			} else {
				System.err.println("---------------------------");
				System.err.println(" [ALERTA] Não autorizado");
				System.err.println("---------------------------");
				Menu();
			}
			break;

		default:
			System.err.println("---------------------------");
			System.err.println(" [ALERTA] Valor Inválido");
			System.err.println("---------------------------");
			Menu();
			break;
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Menu();
	}
}
