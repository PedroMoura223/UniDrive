package aplicacao;

public class Ticket {

	  private int id;
	  private float creditos;

	  public Ticket(int id, float creditos) {
	    this.id = id;
	    this.creditos = creditos;
	  }

	  public int getId() {
	    return id;
	  }

	  public float getCreditos() {
	    return creditos;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public void setCreditos(float creditos) {
	    this.creditos = creditos;
	  }

	  public void adicionarSaldo() {
	  }

	  public void realizarPagamento() {
	  }
}