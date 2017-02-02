package solid.encapsulamento;

import java.util.Collections;
import java.util.List;

public class Fatura {
	private String cliente;
	private double valorMensal;
	private boolean pago;
	private List<Pagamento> pagamentos;

	public Fatura() {
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(pagamentos);
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	/**
	 * Adiciona um pagamento relacionado coma Fatura
	 * @param pagamento
	 */
	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if (valorTotalDosPagamentos() > this.valorMensal) {
			this.setPago(true);
		}
	}
	
	/**
	 * Retorna o valor total dos pagamentos
	 * @return
	 */
	private double valorTotalDosPagamentos() {
		double total = 0;
		for (Pagamento pagamento : pagamentos) {
			total += pagamento.getValor();
		}
		return total;
	}
}
