package aplicacao;

public class Ticket {
	
	  private float creditos;
	  
	  private String estacao;

	  public Ticket(float creditos, String nomeEstacao) {
	    this.creditos = creditos;
	    this.estacao = nomeEstacao;
	  }

	  public float getCreditos() {
	    return creditos;
	  }
	  
	  public String getEstacaoEmissao() {
		  return estacao;
	  }
	  
	  
	  protected void setCreditos(float creditos) {
	    this.creditos = creditos;
	  }

	  public void adicionarSaldo(float creditos) {
		  this.setCreditos(creditos);
	  }

	  public void realizarPagamento(float pagamento) {
		  if(pagamento >= this.creditos){
			  System.out.println("--------------------------------");
			  System.out.println("Valor insuficiente!");
			  System.out.println("--------------------------------");
			  return;
		  }
		  
		  this.creditos -= pagamento;
	  }
}