package aplicacao;

public class Administrador extends Usuario {

    private int credencial;

    
    public Administrador(int id, String nome, String email, int credencial) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.credencial = credencial;
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
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getCredencial() {
        return credencial;
    }

    public void setCredencial(int credencial) {
        this.credencial = credencial;
    }

    public void cadastrarVeiculo() {
    }

    public void removerVeiculo() {
    }

    public void emitirRelatorio() {
    }
}