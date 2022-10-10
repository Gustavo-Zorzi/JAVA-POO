package ExercicioPOODNA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe o Tamanho da cadeia de Dna: ");
		
		int iCadeiaTamanho = oInput.nextInt();
		
		Dna oDna = new Dna(iCadeiaTamanho);
		
		String[] aFitaDna = oDna.getFitaDna();
		
		for(String sBase : aFitaDna) {
			System.out.print(sBase);
		}
		
		oInput.close();
	}

}
