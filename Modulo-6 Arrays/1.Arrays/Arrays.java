public class Arrays {
	public static void main(String[] args) {

		int[] meuArray; //Declaração de Arrays 

		meuArray = new int[3]; //Criação do Array

		meuArray[0] = 5;
		meuArray[1] = 8;
		meuArray[2] = 2;

		System.out.println("Primeiro array: ");
		System.out.println("Posição 0: " + meuArray[0]);
		System.out.println("Posição 1: " + meuArray[1]);
		System.out.println("Posição 2: " + meuArray[2]);

		int[] meuArray2 = new int[] {2, 8, 5}; // Cria e preenche o array com os valores

		System.out.println("Segundo array: ");
		System.out.println("Posição 0: " + meuArray2[0]);
		System.out.println("Posição 1: " + meuArray2[1]);
		System.out.println("Posição 2: " + meuArray2[2]);	

		meuArray[0] = 1; // Reescrevendo as informações do arraya
		meuArray[1] = 2;
		meuArray[2] = 3;

		System.out.println("Primeiro array Atualizado: ");
		System.out.println("Posição 0: " + meuArray[0]);
		System.out.println("Posição 1: " + meuArray[1]);
		System.out.println("Posição 2: " + meuArray[2]);

		System.out.println();

		for (int i=0; i < meuArray.length; i++) {			
			System.out.print(meuArray[i] + " "); 
		}
	}
}