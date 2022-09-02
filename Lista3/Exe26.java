package Lista3;
import java.util.Scanner;

public class Exe26 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);

		System.out.print("Informe o preço do pao: ");
		
		double iPreco = oInput.nextDouble();		
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços: ");
		
		Exe25.tabelaPrecos(iPreco);
		
		oInput.close();
	}

}
