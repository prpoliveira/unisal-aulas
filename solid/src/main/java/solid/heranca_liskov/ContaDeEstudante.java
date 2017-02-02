package solid.heranca_liskov;

public class ContaDeEstudante extends ContaComum{
	private int milhas;
	private ManipuladorDeSaldo manipulador;
	
    public ContaDeEstudante() {
    	this.manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
        manipulador.deposita(valor);
        this.milhas += (int)valor;
    }
	
	public double getSaldo()  {
        return manipulador.getSaldo();
    }

    public int getMilhas() {
        return milhas;
    }
}
