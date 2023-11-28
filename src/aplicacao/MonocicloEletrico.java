package aplicacao;

public class MonocicloEletrico extends Veiculo {

    private double valorSensorInclinacao;

    public MonocicloEletrico() {

        this.valorSensorInclinacao = 0.0;
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
