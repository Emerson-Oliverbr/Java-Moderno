public class VerificadorDeMes {

    public static void main(String[] args) {
        
        int mes = 5;
        
        String nomeDoMes;

        switch (mes) {
            case 1:
                nomeDoMes = "Janeiro";
                break;
            case 2:
                nomeDoMes = "Fevereiro";
                break;
            case 3:
                nomeDoMes = "Março";
                break;
            case 4:
                nomeDoMes = "Abril";
                break;
            case 5:
                nomeDoMes = "Maio";
                break;
            case 6:
                nomeDoMes = "Junho";
                break;
            case 7:
                nomeDoMes = "Julho";
                break;
            case 8:
                nomeDoMes = "Agosto";
                break;
            case 9:
                nomeDoMes = "Setembro";
                break;
            case 10:
                nomeDoMes = "Outubro";
                break;
            case 11:
                nomeDoMes = "Novembro";
                break;
            case 12:
                nomeDoMes = "Dezembro";
                break;
            default:
                nomeDoMes = "Mês inválido! Por favor, insira um número de 1 a 12.";
                break;
        }
        
        System.out.println("O número do mês é: " + mes);
        System.out.println("O mês correspondente é: " + nomeDoMes);
    }
}