public class Funcionario {
	String nome;
	String cargo;
	int idade;

	Funcionario(String nome, String cargo, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Emerson", "Desenvolvedor", 40);

		//funcionario1.nome = "Emerson";
		//funcionario1.cargo = "Desenvolvedor";
		//funcionario1.idade = 40;

		Funcionario funcionario2 = new Funcionario("Daniela", "Desenvolvedora", 36);

		//funcionario2.nome = "Daniela";
		//funcionario2.cargo = "Desenvolvedora";
		//funcionario2.idade = 36;

		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("Idade: " + funcionario1.idade);
		System.out.println("----------------------------");
		System.out.println("Nome: " + funcionario2.nome);
		System.out.println("Cargo: " + funcionario2.cargo);
		System.out.println("Idade: " + funcionario2.idade);
	}
}