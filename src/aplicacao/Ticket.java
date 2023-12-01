package aplicacao;

public class Ticket {
	
	  private float creditos;
	  
	  private EstacaoTicket estacaoTicket;
	  
	  private EstacaoVeiculo estacaoVeiculo;

	  public Ticket(float creditos, EstacaoTicket estacaoTicket, EstacaoVeiculo estacaoVeiculo) {
	    this.creditos = creditos;
	    this.estacaoTicket = estacaoTicket;
	    this.estacaoVeiculo = estacaoVeiculo;
	  }  

	  public float getCreditos() {
	    return creditos;
	  }
	  
	  public EstacaoTicket getEstacaoEmissao() {
		  return estacaoTicket;
	  }
	  
	  public EstacaoVeiculo getEstacaoVeiculo() {
		  return estacaoVeiculo;
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