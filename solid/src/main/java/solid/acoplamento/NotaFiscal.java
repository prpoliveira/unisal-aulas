package solid.acoplamento;

public class NotaFiscal {
	
	private double valor;

	public NotaFiscal(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calculaImpostoSimplesSobreValor() {
		return this.getValor() * 0.06;
	}
}
