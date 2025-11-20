package code85.dados;

public class Funcionario {
	private String nome;
	double salario;

	private Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		System.out.println("Nome = " + nome);
		System.out.printf("Salario = %.2f%n" , salario);
	}
	
	protected Funcionario() {
		Funcionario func = new Funcionario("Tangero", 3850.00);
	}
}