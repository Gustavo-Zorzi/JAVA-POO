package Teste;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		boolean bIniciaPrograma = true;
		
		while(bIniciaPrograma){
			Scanner oInput = new Scanner(System.in);
			
			System.out.println("Fechar programa (S/N)");
			
			String sEscolha = oInput.next().toUpperCase();
			
			if(sEscolha.startsWith("S")){
				bIniciaPrograma = false;
			}
			
			oInput.close();
		}
		
	}

}
