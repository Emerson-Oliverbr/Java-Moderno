public class DiasNoMes {
	public static void main(String[] args) {

		String mes = "Abril"; 

		switch(mes) {

		case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro"  -> System.out.println("31 Dias");
		case "Abril", "Junho", "Setembro", "Novembro" -> System.out.println("30 Dias"); 
		case "Fevereiro" -> System.out.println("28 dias");

		default -> System.out.println("Mes Desconhecido");

		}
	}
}
