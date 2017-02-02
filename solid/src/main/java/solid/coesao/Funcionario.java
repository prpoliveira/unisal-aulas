package solid.coesao;

public class Funcionario {
	private Cargo cargo;
	private Double salarioBase;
	
	public Funcionario() {
		super();
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calculaSalario(){
		return getCargo().getRegra().calcula(this);
	}
}
