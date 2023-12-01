package aplicacao;


public class Cliente extends Usuario {

    public Ticket ticket;
    private Veiculo veiculo;
    
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
  
    public Veiculo getVeiculo() {
    	return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
    	this.veiculo = veiculo;
    }

    public void devolverVeiculo() {
    	this.veiculo = null;
    }

    public float consultarSaldo() {
    	if(this.ticket == null) {
    		System.out.println("Ticket não encontrado.");

    	}
        return this.ticket.getCreditos();
    }
}
