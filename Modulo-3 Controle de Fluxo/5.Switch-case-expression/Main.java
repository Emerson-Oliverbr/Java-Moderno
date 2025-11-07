public class Main {
	public static void main(String[] args) {

		int dia = 3;
		switch(dia) {
			case 1 -> System.out.println("Domingo");
			case 2 -> System.out.println("Segunda");
			case 3 -> System.out.println("Terça");
			case 4 -> System.out.println("Quarta");
			case 5 -> System.out.println("Quinta");
			case 6 -> System.out.println("Sexta");
			case 7 -> System.out.println("Sabado");

			default -> System.out.println("Desconhecido");
		}
	}
}