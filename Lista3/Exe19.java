package Lista3;
import java.util.Scanner;

public class Exe19 {

	static void calculaPrimos(int iPrimos) {
		
		boolean bPrimo = true;
			
			if(iPrimos == 0 || iPrimos == 1) {
				bPrimo = false;
			}
			else{
				for(int i = 2; i <= Math.pow(iPrimos, 0.5); i++) {
					if(iPrimos % i == 0) {
						bPrimo = false;
					}
				}
			}
			if(bPrimo) {				
				System.out.print(iPrimos+" ");
			}
		}
	
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe o intervalo desejado: ");
		
		int iNumeros = oInput.nextInt();
		
		System.out.print("Primos: ");
		
		for(int i = 0; i < iNumeros; i++) {
			Exe19.calculaPrimos(i);			
		}
		
		oInput.close();
	}

}
