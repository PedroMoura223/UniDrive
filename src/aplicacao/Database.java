package aplicacao;
import java.io.*;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controllers.ControllerVeiculo;

public class Database {
    private String nomeArquivo;

    public Database(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    public static void main(String[] args) {
    	Veiculo bike1 = new Veiculo(1, "bike", "estacao1");
        Veiculo bike2 = new Veiculo(2, "bike2", "estacao2");
        
        ControllerVeiculo.salvarVeiculoNoArquivo(bike1);
        ControllerVeiculo.salvarVeiculoNoArquivo(bike2);
        
        ControllerVeiculo.obterVeiculoPorId(2);
        
        
    }
}
