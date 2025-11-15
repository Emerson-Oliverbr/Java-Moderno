public class Bolo {
	
	int quantidadeDeAcucar = 100;   

	public static void main(String[] args) {
		Bolo boloDeChocolate = new Bolo();

		boloDeChocolate.quantidadeDeAcucar = 200;

		Bolo boloDeBaunilha = new Bolo();

		//boloDeBaunilha.quantidadeDeAcucar = 150;

		System.out.println("Quantidade de Açucar do bolo de Chocolate: " + boloDeChocolate.quantidadeDeAcucar);
		System.out.println("Quantidade de Açucar do bolo de Baunilha: " + boloDeBaunilha.quantidadeDeAcucar);
	}
}