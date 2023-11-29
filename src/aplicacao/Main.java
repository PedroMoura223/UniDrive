package aplicacao;
import java.util.Scanner;

public class Main {
	
	public static void adicionarSaldo(Cliente cliente, Ticket ticket, Scanner scanner) {
		
		System.out.println("\n --------------------- \n\n [Adicionar Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Qual Valor deseja Adicionar?\r\n ");
		
        String valorAdicionar = scanner.nextLine();
        
        ticket.setCreditos(Float.parseFloat(valorAdicionar));
        
        System.out.println("\n --------------------- \n\n [Adicionar Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Saldo Adicionado com Sucesso! \n Saldo Atual: " + ticket.getCreditos());
		System.out.println("\n Aperte Enter para voltar ao Menu Principal");
		
		String resposta = scanner.nextLine();
		
		visaoCliente(cliente,ticket,scanner);
	}
	
	public static void consultarSaldo(Cliente cliente, Ticket ticket, Scanner scanner) {
		System.out.println("\n --------------------- \n\n [Consulta Saldo] " + "Olá " + cliente.getNome());
		System.out.println("\n Saldo Atual: " + ticket.getCreditos());
		System.out.println("\n Aperte Enter para voltar ao Menu Principal");
		
		String resposta = scanner.nextLine();
		
		visaoCliente(cliente,ticket,scanner);
	}
	
	public static void visaoCliente(Cliente cliente, Ticket ticket, Scanner scanner) {
		
		System.out.println("\n --------------------- \n\n [Menu Cliente] " + "Olá " + cliente.getNome());
		System.out.println("\n Qual operação deseja realizar?\r\n 1 - Adicionar Saldo \r\n 2 - Consultar Saldo\r\n 3 - Alugar Veículo\r\n \r\n 4 - Sair");
		
        String operacao = scanner.nextLine();
        
		if("1".equals(operacao)){
		
			adicionarSaldo(cliente,ticket,scanner);
			
		}
		if("2".equals(operacao)){
			
			consultarSaldo(cliente,ticket,scanner);
			
		}
	}
	
	public static void visaoAdministrador(Administrador administrador , Scanner scanner) {
		
		System.out.println("\n --------------------- \n\n [Menu Administrador] " + "Olá " + administrador.nome);
		System.out.println("\n Qual operação deseja realizar?\r\n 1 - Cadastrar Veículo \r\n 2 - Remover Veículo\r\n 3 - Emitir Relatório de Lucros\r\n 4 - Emitir Ticket \r\n 5 - Sair");
		
        String resposta = scanner.nextLine();

	}
	
	public static void Menu() {
		Scanner scanner = new Scanner(System.in);
	       
		System.out.print("\n [Tela Inicial] \n\n Digite seu Tipo de Conta: \n 1 - Cliente \n 2 - Admin \n");
        String tipoConta = scanner.nextLine();
        
        System.out.print(" \n --------------------- \n\n [Fazer Login] \n\n Digite seu Login: ");
        String login = scanner.nextLine();
        
        System.out.print("\n Digite sua Senha: ");
        String senha = scanner.nextLine();
        
        if("1".equals(tipoConta)){
        	
        	Ticket ticket = new Ticket(1 , 0.00f);
        	
        	Cliente cliente = new Cliente(1, "Pedro Moura", "pedromoura@gmail.com", 100.0f, 1); 
        	
        	visaoCliente(cliente, ticket, scanner);
        }
        
        if("2".equals(tipoConta)){
        	
        	Administrador administrador = new Administrador(1, "Gustavo Cassimiro", "gustavocassimiro@gmail.com", 1); //Dados que vem do Banco
        	visaoAdministrador(administrador, scanner);
        }
        
        scanner.close();
	}
	
	public static void main(String[] args) {
		
		Menu();
		
	}
}
