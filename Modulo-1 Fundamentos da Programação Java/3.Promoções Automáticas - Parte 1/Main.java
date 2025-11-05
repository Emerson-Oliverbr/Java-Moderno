public class Main {
	public static void main(String[] args) {

		byte v1 = 10;
		int v2 = v1 + 5; // A é promovido para int antes do cálculo
		System.out.println(v2);

		int v3 = 10; 
		float v4 = 1.5f; 
		float v5 = v3 * v4; // a é promovido para float antes do cálculo
		System.out.println(v5);

		int a = 10;
		double b = 1.5; 
		double c = a * b; // a é promovido para double antes do cálculo
		System.out.println(c);	

	}
}