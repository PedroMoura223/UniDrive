package aplicacao;

public class MonocicloEletrico extends Veiculo {

    private double valorSensorInclinacao;

    public MonocicloEletrico(int id, String tipo, String estacao, double valorSensorInclinacao) {
        super(id, tipo, estacao);
        this.valorSensorInclinacao = valorSensorInclinacao;
    }

    public double getValorSensorInclinacao() {
        return valorSensorInclinacao;
    }

    public void setValorSensorInclinacao(double valorSensorInclinacao) {
        this.valorSensorInclinacao = valorSensorInclinacao;
    }

    public void retrairGuidao() {
    }
}
