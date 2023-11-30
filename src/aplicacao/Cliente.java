package aplicacao;

import java.util.Optional;

public class Cliente extends Usuario {

    public Ticket ticket;
    private Veiculo veiculo;
    
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }



	public String getNome() {
        return nome;
    }
    

    public String getEmail() {
        return email;
    }
    

    public int getId() {
        return id;
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
