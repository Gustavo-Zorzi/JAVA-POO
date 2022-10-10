package Teste;
import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da cadeia: ");
		
		int iCadeiaTamanho = oInput.nextInt();
		
		String[] aVetorOriginal = new String[iCadeiaTamanho];	
		
		String[] sAcidosValidos = {"A", "T", "G", "C"};
		
		String[]aVetorTranscricao = new String[iCadeiaTamanho];
		
		for(int iLinha = 0; iLinha < iCadeiaTamanho; iLinha++) {
			
			System.out.print("Informe o"+iLinha+"º valor: ");
			
			String sAcido = oInput.next().toUpperCase();
			
			aVetorOriginal[iLinha] = sAcido;
			
			for(int iCont = 0; iCont < iCadeiaTamanho; iCont++) {
				if(aVetorOriginal[iCont].intern() == "A") {
					aVetorTranscricao[iCont] = "U";
				}
				else if(aVetorOriginal[iCont].intern() == "T") {
					aVetorTranscricao[iCont] = "A";
				}
				else if(aVetorOriginal[iCont].intern() == "G") {
					aVetorTranscricao[iCont] = "C";
				}
				else {
					aVetorTranscricao[iCont] = "G";
				}
			}
		}
		
		for(String sAcido : aVetorTranscricao) {
			System.out.println(sAcido);
		}
		oInput.close();
	}
	
}
