package solid.ocp_dip;

public class ExecutaCalculoDePrecos {

	public static void main(String[] args) {
		TabelaDePreco tabelaDePreco = new TabelaDePrecoPadrao();
		ServicoDeEntrega servicoDeEntrega = new FreteCorreios();
		new CalculadoraDePrecos(tabelaDePreco, servicoDeEntrega);
	}

}
