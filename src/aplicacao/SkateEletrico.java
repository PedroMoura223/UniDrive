package aplicacao;

public class SkateEletrico extends Veiculo {

    private Boolean controleRemoto;

    public SkateEletrico(int id, String tipo, String estacao, Boolean controleRemoto) {
        super(id, tipo, estacao);
        this.controleRemoto = controleRemoto;
    }

    public Boolean getControleRemoto() {
        return controleRemoto;
    }

    public void setControleRemoto(Boolean controleRemoto) {
        this.controleRemoto = controleRemoto;
    }

    public void fazerManobra() {
    }
}
