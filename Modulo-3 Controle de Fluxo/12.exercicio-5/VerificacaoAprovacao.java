public class VerificacaoAprovacao {

    public static void main(String[] args) {
        
        int nota1;
        int nota2;
        int frequencia;
        nota1 = 8;
        nota2 = 7;
        frequencia = 80;

        
        double media = (nota1 + nota2) / 2.0;
        boolean aprovado; 
       
        aprovado = (media >= 7.0) && (frequencia >= 75);
        
        System.out.println("--- Dados do Aluno ---");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Frequência: " + frequencia + "%");
        System.out.println("----------------------");     

        if (aprovado) {
            System.out.println("Status: APROVADO! Parabéns, sua média e frequência atendem aos requisitos.");
        } else {
            System.out.println("Status: REPROVADO. É necessário ter média 7.0 ou mais E frequência 75% ou mais.");
        }
    }
}