package solid.heranca_liskov;

public class ContaComum {
	
	private ManipuladorDeSaldo manipulador;
	
    public ContaComum() {
    	this.manipulador = new ManipuladorDeSaldo();
    }
   
    public void rende(double taxa) {
        this.manipulador.rende(taxa);
    }
    
    public void saca(double valor)  {
        manipulador.saca(valor);
    }
    
    public void deposita(double valor)  {
        manipulador.deposita(valor);
    }
    
    public double getSaldo()  {
        return manipulador.getSaldo();
    }
}
