package aplicacao;

public class Administrador extends Usuario {

    private int credencial;

    public Administrador() {

        this.credencial = 0;
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