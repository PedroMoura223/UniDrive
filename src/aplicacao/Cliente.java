package aplicacao;

public class Cliente extends Usuario {

    private double saldo;
    private int idVeiculo;

    public Cliente() {
        this.saldo = 0.0;
        this.idVeiculo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public void alugarVeiculo() {
    }

    public void devolverVeiculo() {
    }

    public double consultarSaldo() {
        return 0.0;
    }
}
