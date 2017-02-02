package solid.coesao;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario) {
		/**
		 * Além de tornar o código coeso, trabalhamos aqui com encapsulamento também, 
		 * ou seja, a classe funcionário sabe como tratar o cálculo do sálario e não precisamos
		 * ver esse cálculo, apenas perguntar e temos a resposta do salário calculado.
		 */
		return funcionario.calculaSalario();        
    }
}
