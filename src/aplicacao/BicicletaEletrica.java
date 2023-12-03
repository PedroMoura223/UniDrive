package aplicacao;

public class BicicletaEletrica extends Veiculo {

    private Boolean assistenciaEletricaAtiva;

    public BicicletaEletrica(int id, String tipo, String estacao, Boolean assistenciaEletricaAtiva) {
        super(id, tipo, estacao);
        this.assistenciaEletricaAtiva = assistenciaEletricaAtiva;
    }

    public Boolean getAssistenciaEletricaAtiva() {
        return assistenciaEletricaAtiva;
    }

    public void setAssistenciaEletricaAtiva(Boolean assistenciaEletricaAtiva) {
        this.assistenciaEletricaAtiva = assistenciaEletricaAtiva;
    }

    public void ativarAssistenciaEletrica() {
    }
}
