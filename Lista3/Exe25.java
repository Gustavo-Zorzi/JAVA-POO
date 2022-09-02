package Lista3;
import java.text.DecimalFormat;

public class Exe25 {
	
	
	public static void tabelaPrecos(double iPreco) {
		
		DecimalFormat oResultado = new DecimalFormat();
		oResultado.setMaximumFractionDigits(3);
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(i+"- R$ "+oResultado.format(i*iPreco));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Lojas Quase Dois - Tabela de preços: ");
		Exe25.tabelaPrecos(1.99);
		
	}

}
