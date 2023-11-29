package aplicacao;

public class Cliente extends Usuario {

    private float saldo;
    private int idTicket;
    private int idVeiculo;
    
    public Cliente(int id, String nome, String email, float saldo, int idTicket) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
        this.idTicket = 0;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
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


    public void alugarVeiculo() {
       
    }

    public void devolverVeiculo() {
    }

    public double consultarSaldo() {
        return 0.0;
    }
}
