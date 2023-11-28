package aplicacao;

public class EstacaoTicket extends Estacao {

    private String nomeAdmin;

    public EstacaoTicket() {
        this.nomeAdmin = "";
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public void emitirTicket() {
    }
}