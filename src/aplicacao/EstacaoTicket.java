package aplicacao;

public class EstacaoTicket extends Estacao {

    private String nomeAdmin;

    public EstacaoTicket(String nomeADmin, String nomeEstacao) {
        this.nomeAdmin = "";
        this.id = 0;
        this.nomeEstacao = "";
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public void emitirTicket(Cliente cliente) {
    	cliente.ticket = new Ticket(0.0f);
    }
}