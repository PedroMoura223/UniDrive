package aplicacao;

public class EstacaoTicket extends Estacao {

    private String nomeAdmin;

    public EstacaoTicket(String nomeADmin, String nomeEstacao) {
        this.nomeAdmin = nomeADmin;
        this.nomeEstacao = nomeEstacao;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public void emitirTicket(Cliente cliente, String nomeEstacao) {
    	cliente.ticket = new Ticket(0.0f, nomeEstacao);
    }
}