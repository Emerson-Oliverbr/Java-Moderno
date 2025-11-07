public class ClassificacaoAluno {

    public static void main(String[] args) {
        
        int nota1 = 8; 
        int nota2 = 7;

        
        double media = (double) (nota1 + nota2) / 2;

        int statusAluno;        
        
        if (media >= 6) {
            statusAluno = 1;
        } 
        else {
            statusAluno = 0;
        }

        System.out.println("Média Calculada: " + media);
        System.out.print("Resultado: ");
        
        switch (statusAluno) {
            case 1:
                System.out.println("🎉 APROVADO! Excelente trabalho.");               
                break;                 
            case 0:
                System.out.println("❌ REPROVADO. É necessário estudar mais para a próxima vez.");
                break;
                
            default:                
                System.out.println("Status desconhecido."); 
        }
    }
}