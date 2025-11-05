import java.util.Locale;
import java.util.Scanner;

public class Main {
	static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] valores = new double[n];

		for(int i=0; i<n; i++) {
			valores[i] = sc.nextDouble();
		}

		sc.close();	
	}
}