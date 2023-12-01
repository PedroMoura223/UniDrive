package aplicacao;

public class Administrador extends Usuario {

    private String credencial;
    
    private String estacao;

    
    public Administrador(String nome, String email, String credencial) {

        this.nome = nome;
        this.email = email;
        this.credencial = credencial;
        
        if(credencial == "1234") {
        	this.estacao = "Ticket - Campus do Benfica";
        }else if (credencial == "4321") {
        	this.estacao = "Ticket - Campus do Pici";
        }
    }


 

    public String getCredencial() {
        return credencial;
    }
    
    public String getEstacao() {
    	return estacao;
    }

    public void cadastrarVeiculo() {
    }

    public void removerVeiculo() {
    }

    public void emitirRelatorio() {
    }
}