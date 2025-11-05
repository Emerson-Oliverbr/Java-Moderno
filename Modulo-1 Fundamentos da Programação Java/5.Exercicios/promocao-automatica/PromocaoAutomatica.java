public class PromocaoAutomatica {
    public static void main(String[] args) {
        
        byte a = 10;
        short b = 20;
        char c = 'E';
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5;
        
        int somaInt = a + b; 
        int somaCharInt = c + d; 
        long somaLong = d + e; 
        float somaFloat = e + f; 
        double somaDouble = f + g; 
        
        System.out.println("Resultado da soma (byte + short): " + somaInt);
        System.out.println("Resultado da soma (char + int): " + somaCharInt);
        System.out.println("Resultado da soma (int + long): " + somaLong);
        System.out.println("Resultado da soma (long + float): " + somaFloat);
        System.out.println("Resultado da soma (float + double): " + somaDouble);

        System.out.println("Valor do char: " + c);
        System.out.println("Código Unicode do char: " + (int)c);
    }
}
