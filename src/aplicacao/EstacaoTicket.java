package aplicacao;

public class EstacaoTicket extends Estacao {

    private String nomeAdmin;

    public EstacaoTicket(String nomeADmin, String nomeEstacao) {
        this.nomeAdmin = nomeADmin;
        this.nomeEstacao = nomeEstacao;
    }

    public String getNomeAdmin() {
        return this.nomeAdmin;
    }
    
    public String getNomeEstacao() {
    	return this.nomeEstacao;
    }
    
    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public void emitirTicket(Cliente cliente, EstacaoTicket estacaoTicket, EstacaoVeiculo estacaoVeiculo) {
    	cliente.ticket = new Ticket(0.0f, estacaoTicket, estacaoVeiculo);
    }
}