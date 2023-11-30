package aplicacao;
import java.util.ArrayList;

public class EstacaoVeiculo extends Estacao {
    private ArrayList<Veiculo> listaVeiculos;

    public EstacaoVeiculo(String nomeEstacao) {
    	this.nomeEstacao = nomeEstacao;
        this.listaVeiculos = new ArrayList<>();
    }

    public ArrayList<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void destravarVeiculo() {
    }
    
    public void alugarVeiculo(Cliente cliente, String tipo) {
    	switch(tipo) {
    	case "1":
    		if(cliente.ticket.getCreditos() <= SkateEletrico.preco) {
    			System.out.println("Valor insuficiente para o aluguel.");
    			return;
    		}
    		
    		cliente.setVeiculo(new SkateEletrico());
    		break;
    		
    	case "2":
    		if(cliente.ticket.getCreditos() <= MonocicloEletrico.preco) {
    			System.out.println("Valor insuficiente para o aluguel.");
    			return;
    		}
    		
    		cliente.setVeiculo(new MonocicloEletrico());
    	}
     }
}