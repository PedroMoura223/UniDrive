package aplicacao;
import java.util.ArrayList;

public class EstacaoVeiculo extends Estacao {

    private ArrayList<Veiculo> listaVeiculos;

    public EstacaoVeiculo() {
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
}