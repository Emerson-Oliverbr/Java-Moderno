package code85.dados;

public class Funcionario {
	public String nome;
	double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;

		System.out.println("Nome = " + nome);
		System.out.printf("Salario = %.2f%n" , salario);
	}
}