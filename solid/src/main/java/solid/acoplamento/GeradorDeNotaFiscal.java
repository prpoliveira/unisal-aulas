package solid.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {
	private List<AcaoAposGerarNota> acoes;
	
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
    	this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor);
        
        for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executa(nf);
		}
        
        return nf;
    }
}
