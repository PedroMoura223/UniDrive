package aplicacao;
public class SkateEletrico extends Veiculo {

  public Boolean controleRemoto;
  
  public SkateEletrico() {
	  this.preco = 10.00f;
  }

  public void fazerManobra() {
	  System.out.println("Chorão passa mal nessa!");
  }

}