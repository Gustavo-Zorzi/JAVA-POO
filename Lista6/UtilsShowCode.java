
public class UtilsShowCode {

	public static String mostraMenu() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("-=#####     MENU     #####=-");
		sb.append("\nInforme o exercício a ser exibido");
		sb.append("\n7 - Valor de Prestação da conta");
		sb.append("\n8 - Conta Dígitos");
		sb.append("\n9 - Reverso do Número");
		sb.append("\n10 - Jogo de Craps");
		sb.append("\n-----------------------------");
		sb.append("\nDigite 0 para encerrar");
		sb.append("\n-----------------------------");
		
		return sb.toString();
		
	}
	
}
