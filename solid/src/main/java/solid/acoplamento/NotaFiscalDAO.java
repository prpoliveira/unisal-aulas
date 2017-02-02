package solid.acoplamento;

public class NotaFiscalDAO implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("Salvando a NF.");
	}

}
