package aplicacao;

import java.util.Optional;

public class Cliente extends Usuario {

    private Ticket ticket;
    private Veiculo veiculo;
    
    public Cliente(String nome, String email,  int idTicket) {
        this.nome = nome;
        this.email = email;
        

        this.ticket.setCreditos(0);
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
    

    public void alugarVeiculo(Veiculo veiculo) {
       this.veiculo = veiculo;
    }

    public void devolverVeiculo() {
    	this.veiculo = null;
    }

    public float consultarSaldo() {
        return this.ticket.getCreditos();
    }
}
