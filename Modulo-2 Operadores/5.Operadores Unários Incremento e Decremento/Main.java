public class Main {
	public static void main(String[] args) {
		
		int a = 10;
		a++; // Equivale a fazer a = (10 + 1) Saída 11;

		System.out.println(a);

		a--;

		System.out.println(a);

		a+= 2; // Equivale a fazer a = (10 + 2) Saída 12;

		System.out.println(a);

		a-= 5; // Equivale a fazer a = (10 + 2) Saída 7;

		System.out.println(a);
		System.out.println("****************************");

		int b = a--;

		System.out.println(a);
	}
}