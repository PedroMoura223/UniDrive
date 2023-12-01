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
		switch (tipo) {
		case "1":
			if (cliente.ticket.getCreditos() <= SkateEletrico.preco) {
				System.err.println("------------------------------------");
				System.err.println("Valor insuficiente para o aluguel.");
				System.err.println("------------------------------------");
				return;
			}
			cliente.ticket.realizarPagamento(SkateEletrico.preco);
			System.out.println("-------------------------------");
			System.out.println("[MESSAGEM] Veículo Alugado");

			cliente.setVeiculo(new SkateEletrico());
			break;

		case "2":
			if (cliente.ticket.getCreditos() <= MonocicloEletrico.preco) {
				System.err.println("-----------------------------------");
				System.err.println("Valor insuficiente para o aluguel.");
				System.err.println("-----------------------------------");
				return;
			}
			cliente.ticket.realizarPagamento(SkateEletrico.preco);
			System.out.println("-------------------------------");
			System.out.println("[MESSAGEM] Veículo Alugado");
			cliente.setVeiculo(new MonocicloEletrico());
			break;
		}
	}
}