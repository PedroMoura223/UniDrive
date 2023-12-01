package aplicacao;

public class MonocicloEletrico extends Veiculo {
	public static float preco = 25.00f;
 
	public String tipo = "Monocilo Elétrico";

    private double valorSensorInclinacao;

    public MonocicloEletrico() {
        this.valorSensorInclinacao = 0.0;
        this.preco = 25.00f;
    }

    public double getValorSensorInclinacao() {
        return valorSensorInclinacao;
    }

    public void setValorSensorInclinacao(double valorSensorInclinacao) {
        this.valorSensorInclinacao = valorSensorInclinacao;
    }

    public void retrairGuidao() {
    	System.out.println("Pronto pra ser guardado!");
    }
    
    public String getTipo() {
    	return tipo;
    }
}
