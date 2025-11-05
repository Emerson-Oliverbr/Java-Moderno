public class Main {
	public static void main(String[] args) {

		//Obs: apenas com variaves inicializadas  
		var numero = 10; // inferência int
		int numero2 = numero;

		var numero3 = 40.8;
		double numero4 = numero3;

		//var usuario = new Usuario();
		
		System.out.println("O valor de numero é = " + numero);
		System.out.println("O valor de numero é = " + numero2);
		System.out.println("O valor de numero é = " + numero3);
		System.out.println("O valor de numero é = " + numero4);
	}
}		