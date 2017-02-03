package solid.encapsulamento;

import java.util.List;

public class ProcessadorDeBoletosComProblema {
	public void processa(List<Boleto> boletos, Fatura fatura) {

        double total = 0;
        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.getPagamentos().add(pagamento);

            total += boleto.getValor();
        }

        if(total >= fatura.getValorMensal()) {
            fatura.setPago(true);
        }
    }
}
