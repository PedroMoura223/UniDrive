package aplicacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Veiculo implements Serializable{
    private int id;
    private String tipo;
    private String estacao;

    public Veiculo(int id, String tipo, String estacao) {
        this.id = id;
        this.tipo = tipo;
        this.estacao = estacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
       
    @Override
    public String toString() {
        return "Veiculo [id=" + id + ", tipo=" + tipo + ", estacao=" + estacao + "]";
    }
}