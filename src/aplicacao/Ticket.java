package aplicacao;

public class Ticket {
	
	  private float creditos;

	  public Ticket(int id, float creditos) {
	    this.creditos = creditos;
	  }

	  public float getCreditos() {
	    return creditos;
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