package Lista3;
import java.util.Scanner;

public class Exe18 {

	public static void divisiveisPrimos(int iNumero) {
		
		boolean bPrimo = true;
			
		if(iNumero == 0 || iNumero == 1) {
			bPrimo = false;
		}
		else{
			for(int i = 2; i <= Math.pow(iNumero, 0.5); i++) {
				System.out.println("Numeros divisiveis de "+iNumero+": "+i);
				if(iNumero % i == 0) {
					bPrimo = false;
				}
			}
		}
		
		System.out.println("Primo: "+bPrimo);
	}
	
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		
		int iNumero = oInput.nextInt();
		
		Exe18.divisiveisPrimos(iNumero);
		
		oInput.close();
	}

}
