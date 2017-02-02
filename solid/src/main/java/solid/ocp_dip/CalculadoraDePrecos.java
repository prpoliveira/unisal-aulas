package solid.ocp_dip;

public class CalculadoraDePrecos {
	private TabelaDePreco tabelaDePreco;
	private ServicoDeEntrega servicoDeEntrega;
	
	public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, ServicoDeEntrega servicoDeEntrega) {
		this.tabelaDePreco = tabelaDePreco;
		this.servicoDeEntrega = servicoDeEntrega;
	}

	public double calcula(Compra produto) {
		
        double desconto = getTabelaDePreco().descontoPara(produto.getValor());
        double frete = getServicoDeEntrega().para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }

	public TabelaDePreco getTabelaDePreco() {
		return tabelaDePreco;
	}

	public ServicoDeEntrega getServicoDeEntrega() {
		return servicoDeEntrega;
	}

}
