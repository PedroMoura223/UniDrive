package aplicacao;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	static EstacaoVeiculo veiculoPici = new EstacaoVeiculo("Veiculo - Campus do Pici");
	static EstacaoVeiculo veiculoBenfica = new EstacaoVeiculo("Veiculos - Campus do Pici");
	
	static EstacaoTicket ticketPici = new EstacaoTicket("Igor Neves", "Ticket - Campus do Pici");
	static EstacaoTicket ticketBenfica = new EstacaoTicket("Gustavo Cassimiro", "Ticket - Campus do Benfica");
	
	public static void adicionarSaldo(Cliente cliente) {
		
		System.out.println("\n --------------------- \n\n [Adicionar Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Qual Valor deseja Adicionar?\r\n ");
		
        String valorAdicionar = scanner.nextLine();
        
        cliente.ticket.setCreditos(Float.parseFloat(valorAdicionar));
        
        System.out.println("\n --------------------- \n\n [Adicionar Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Saldo Adicionado com Sucesso! \n Saldo Atual: " + cliente.ticket.getCreditos());
		System.out.println("\n Aperte Enter para voltar ao Menu Principal");
		
		String resposta = scanner.nextLine();
		
		visaoCliente(cliente);
	}
	
	public static void consultarSaldo(Cliente cliente) {
		System.out.println("\n --------------------- \n\n [Consulta Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Saldo Atual: " + cliente.ticket.getCreditos());
		System.out.println("\n Aperte Enter para voltar ao Menu Principal");
		
		String resposta = scanner.nextLine();
		
		visaoCliente(cliente);
	}
	
	public static void visaoEstacao(Cliente cliente) {
		System.out.println("\n --------------------- \n\n [Emitir Ticket]");
		System.out.println("\n Em qual estação deseja emitir o Ticket?\r\n 1 - Campus Pici \r\n 2 - Campus Benfica\r\n");
	
		String resposta = scanner.nextLine();
		
		switch(resposta) {
		case "1":
			ticketPici.emitirTicket(cliente, ticketPici.nomeEstacao);
			System.out.println("Ticket emitido em: " + cliente.ticket.getEstacaoEmissao());
			break;
		
		case "2":
			ticketBenfica.emitirTicket(cliente, ticketBenfica.nomeEstacao);
			System.out.println("Ticket emitido em: " + cliente.ticket.getEstacaoEmissao());
			break;
		}
		
		visaoCliente(cliente);
	}
	
	public static void visaoCliente(Cliente cliente) {
		
		System.out.println("\n --------------------- \n [Menu Cliente] " + "Olá " + cliente.getNome());
		System.out.println("\n Qual operação deseja realizar?\r\n 1 - Adicionar Saldo \r\n 2 - Consultar Saldo\r\n \r\n 3 - Emitir Ticket\r\n 4 - Alugar Veículo\r\n \r\n 0 - Sair");
		
        String operacao = scanner.nextLine();
        
		switch(operacao) {
		case "1":
			if(cliente.ticket == null) {
				System.out.println("[ALERTA] Ticket não encontrado.");
				visaoCliente(cliente);
				break;
			} 
			
			adicionarSaldo(cliente);
			break;
			
		case "2":
			if(cliente.ticket == null) {
				System.out.println("[ALERTA] Ticket não encontrado.");
				visaoCliente(cliente);
				break;
			} 
			consultarSaldo(cliente);
			break;
			
		case "3":
			visaoEstacao(cliente);
			break;
		}
	}
	
	public static void visaoAdministrador(Administrador administrador) {
		
		System.out.println("\n --------------------- \n\n [Menu Administrador] " + "Olá " + administrador.nome);
		System.out.println("\n Qual operação deseja realizar?\r\n 1 - Cadastrar Veículo \r\n 2 - Remover Veículo\r\n 3 - Emitir Relatório de Lucros\r\n 4 - Emitir Ticket \r\n 5 - Sair");
		
        String resposta = scanner.nextLine();

	}
	
	public static void Menu() {

	       
		System.out.print("\n [Tela Inicial] \n\n Digite seu Tipo de Conta: \n 1 - Cliente \n 2 - Admin \n");
        String tipoConta = scanner.nextLine();
        
        System.out.print(" \n --------------------- \n\n [Fazer Login] \n\n Digite seu Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print(" Digite seu Email: ");
        String email = scanner.nextLine();
        

        if("1".equals(tipoConta)){
        	

        	Cliente cliente = new Cliente(nome, email); 
        	
        	visaoCliente(cliente);
        }
        
        if("2".equals(tipoConta)){
        	
        	Administrador administrador = new Administrador(1, "Gustavo Cassimiro", "gustavocassimiro@gmail.com", 1); //Dados que vem do Banco
        	visaoAdministrador(administrador);
        }
        
        scanner.close();
	}
	
	public static void main(String[] args) {
		
		
		
		
		Menu();
		
	}
}
