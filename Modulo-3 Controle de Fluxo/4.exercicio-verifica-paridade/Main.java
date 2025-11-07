public class Main {

    public static void main(String[] args) {
        
        int numero = 10;

        System.out.println("O número fixo a ser verificado é: " + numero);
        
        if (numero % 2 == 0) {
            
            System.out.println("Resultado: O número " + numero + " é **par**.");
        } else {
            
            System.out.println("Resultado: O número " + numero + " é **ímpar**.");
        }
    }
}