package solid.ocp_dip;

public class ClassesComProblemas {
	public double calcula(Compra produto) {
        TabelaDePrecoPadraoComProblema tabela = new TabelaDePrecoPadraoComProblema();
        Frete correios = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
	
	public class TabelaDePrecoPadraoComProblema {
	    public double descontoPara(double valor) {
	        if(valor>5000) return 0.03;
	        if(valor>1000) return 0.05;
	        return 0;
	    }
	}

	public class Frete {
	    public double para(String cidade) {
	        if("SAO PAULO".equals(cidade.toUpperCase())) {
	            return 15;
	        }
	        return 30;
	    }
	}
}


