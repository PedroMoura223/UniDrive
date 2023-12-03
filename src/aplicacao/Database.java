package aplicacao;
import Controllers.ControllerUsuario;

public class Database {
	private String nomeArquivo;

	public Database(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public static void main(String[] args) {

		
		
		Administrador admin = new Administrador(1, "Admin", "admin@example.com", 123);
        admin.cadastrarVeiculo();

        admin.emitirRelatorio();

	}
}
