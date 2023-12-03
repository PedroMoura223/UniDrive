package aplicacao;
import java.io.Serializable;
import java.util.Scanner;

public class Cliente extends Usuario implements Serializable {

    private float saldo;

    public Cliente(int matricula, String nome, String email, float saldo) {
        super(matricula, nome, email);
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void alugarVeiculo() {
      
    }

    public void devolverVeiculo() {
      
    }

    public double consultarSaldo() {
        return saldo;
    }
    
    public boolean fazerLogin() {
    	return super.fazerLogin();
    	
    }
    
    @Override
    public String toString() {
        return "Cliente [matricula=" + getMatricula() + ", nome=" + getNome() + ", email=" + getEmail() + ", saldo=" + saldo + "]";
    }

}
