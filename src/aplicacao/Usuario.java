package aplicacao;

public class Usuario {
	
public static int contadorUsuarios;

  public int id;

  public String nome;

  public String email;

  public void fazerLogin() {}

  public void fazerLogout() {}

  public Usuario() {
	  Usuario.contadorUsuarios += 1; 
	  
	  this.id = Usuario.contadorUsuarios;
  }
  
  public int getId() {
      return id;
  }

	public String getNome() {
      return nome;
  }
  

  public String getEmail() {
      return email;
  }
  

 
  
}