package solid.acoplamento;

public class GeradorDeNotaFiscalComProblemaAcoplamento {
	private final EnviadorDeEmail email;
	private final NotaFiscalDAO dao;

	public GeradorDeNotaFiscalComProblemaAcoplamento(EnviadorDeEmail email, NotaFiscalDAO dao) {
        this.email = email;
        this.dao = dao;
    }

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		email.enviaEmail(nf);
		dao.persiste(nf);

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
