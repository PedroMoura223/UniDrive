package aplicacao;

import java.io.Serializable;
import Controllers.ControllerUsuario;

import java.util.List;
import java.util.Scanner;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private int matricula;
	private String nome;
	private String email;

	public Usuario(int matricula, String nome, String email) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean fazerLogin() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite a matrícula do usuário:");
	    int inputMatricula = scanner.nextInt();

	    List<Usuario> usuarios = ControllerUsuario.carregarUsuariosDoArquivo();
	    for (Usuario usuario : usuarios) {
	        if (usuario.getMatricula() == inputMatricula) {
	            System.out.println("Login realizado com sucesso!");
	            return true;
	        }
	    }
	    System.out.println("Usuário com matrícula " + inputMatricula + " não encontrado.");
	    return false;
	}

	public void fazerLogout() {
		System.out.println("Usuário " + nome + " fez logout.");
	}

	@Override
	public String toString() {
		return "Usuario [matricula=" + matricula + ", nome=" + nome + ", email=" + email + "]";
	}
}