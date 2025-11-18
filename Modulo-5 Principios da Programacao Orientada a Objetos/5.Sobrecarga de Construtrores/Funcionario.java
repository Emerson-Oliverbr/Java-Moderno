public class Funcionario {
	String nome;
	String cargo;
	int idade;

	Funcionario() {
	}

	Funcionario(String nome, int idade) {
		this.nome = nome;		
		this.idade = idade;
	}

	Funcionario(String nome, String cargo, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}	

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();	
		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("Idade: " + funcionario1.idade);	

		Funcionario funcionario2 = new Funcionario("Emerson", "Desenvolvedor", 40);		
		System.out.println("----------------------------");
		System.out.println("Nome: " + funcionario2.nome);
		System.out.println("Cargo: " + funcionario2.cargo);
		System.out.println("Idade: " + funcionario2.idade);

		Funcionario funcionario3 = new Funcionario("Laura", 10);		
		System.out.println("----------------------------");
		System.out.println("Nome: " + funcionario3.nome);		
		System.out.println("Idade: " + funcionario3.idade);
	}
}