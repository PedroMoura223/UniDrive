package aplicacao;
import Controllers.ControllerUsuario;
import Controllers.ControllerVeiculo;

import java.util.List;
import java.util.Scanner;

public class Administrador extends Usuario {

    private int credencial;

    public Administrador(int id, String nome, String email, int credencial) {
        super(id, nome, email);
        this.credencial = credencial;
    }

    public int getCredencial() {
        return credencial;
    }

    public void setCredencial(int credencial) {
        this.credencial = credencial;
    }

    public void cadastrarVeiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de veículo a ser cadastrado (Monociclo/Skate/Bicicleta):");
        String tipoVeiculo = scanner.nextLine().toLowerCase();

        System.out.println("Digite o ID do veículo:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a estação do veículo:");
        String estacao = scanner.nextLine();

        Veiculo veiculo;

        switch (tipoVeiculo) {
            case "monociclo":
                veiculo = criarMonocicloEletrico(id, tipoVeiculo, estacao);
                break;
            case "skate":
                veiculo = criarSkateEletrico(id, tipoVeiculo, estacao);
                break;
            case "bicicleta":
                veiculo = criarBicicletaEletrica(id, tipoVeiculo, estacao);
                break;
            default:
                System.out.println("Tipo de veículo não reconhecido. Cadastro cancelado.");
                return;
        }

        ControllerVeiculo.cadastrarVeiculo(veiculo);
    }

    private MonocicloEletrico criarMonocicloEletrico(int id, String tipo, String estacao) {
        
        return new MonocicloEletrico(id, tipo, estacao, obterValorSensorInclinacao());
    }

    private SkateEletrico criarSkateEletrico(int id, String tipo, String estacao) {
        
        return new SkateEletrico(id, tipo, estacao, obterControleRemoto());
    }

    private BicicletaEletrica criarBicicletaEletrica(int id, String tipo, String estacao) {
        
        return new BicicletaEletrica(id, tipo, estacao, obterAssistenciaEletricaAtiva());
    }
    
    private double obterValorSensorInclinacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do sensor de inclinação:");
        return scanner.nextDouble();
    }

    private Boolean obterControleRemoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O SkateEletrico possui controle remoto? (true/false):");
        return scanner.nextBoolean();
    }

    private Boolean obterAssistenciaEletricaAtiva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A BicicletaEletrica possui assistência elétrica ativa? (true/false):");
        return scanner.nextBoolean();
    }
    
    public void criarCliente() {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja criar um novo cliente? (sim/não):");
        String resposta = scanner.nextLine().toLowerCase();

        if ("sim".equals(resposta)) {
            System.out.println("Digite a matrícula do cliente:");
            int clienteMatricula = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome do cliente:");
            String clienteNome = scanner.nextLine();

            System.out.println("Digite o email do cliente:");
            String clienteEmail = scanner.nextLine();

            System.out.println("Digite o saldo inicial do cliente:");
            float clienteSaldo = scanner.nextFloat();

            Cliente cliente = new Cliente(clienteMatricula, clienteNome, clienteEmail, clienteSaldo);
            ControllerUsuario.criarUsuario(cliente);
            System.out.println("Cliente criado com sucesso!");
        } else {
            System.out.println("Operação cancelada. Nenhum cliente foi criado.");
        }
    }

    public void removerVeiculo() {
    	
    }

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a matricula do cliente:");
        int id = scanner.nextInt();

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.next();

        System.out.println("Digite o email do cliente:");
        String email = scanner.next();

        System.out.println("Digite o saldo do cliente:");
        float saldo = scanner.nextFloat();

        Cliente cliente = new Cliente(id, nome, email, saldo);

        ControllerUsuario.criarUsuario(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    public void emitirRelatorio() {
        System.out.println("Relatório de Veículos Cadastrados:"); 
        for (Veiculo veiculo : ControllerVeiculo.carregarVeiculosDoArquivo()) {
            System.out.println(veiculo);
        }
    }
    
    public void emitirRelatorioClientes() {
        List<Usuario> usuarios = ControllerUsuario.listarUsuarios();

        if (usuarios.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {	
            System.out.println("Relatório de Clientes Cadastrados:");
            for (Usuario usuario : usuarios) {
                if (usuario instanceof Cliente) {
                    System.out.println(usuario);
                }
            }
        }
    }

}
