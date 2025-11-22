import code85.dados.Funcionario;  

import java.util.Locale;

class FolhaDePagamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Funcionario funcionario = new Funcionario("Emerson", 4580.00);	

		System.out.println(funcionario.obterInfo());		
	}
}