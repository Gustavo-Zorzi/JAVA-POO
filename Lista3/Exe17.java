package Lista3;
import java.util.Scanner;

public class Exe17 {
	
	public static boolean isPrimo(int iNumero) {
		
		boolean bPrimo = true;
		
		if(iNumero == 0 || iNumero == 1) {
			bPrimo = false;
		}
		else{
			for(int i = 2; i <= Math.pow(iNumero, 0.5); i++) {
				if(iNumero % i == 0) {
					bPrimo = false;
				}
			}
		}
		
		return bPrimo;
	}
	
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		
		int iNumero = oInput.nextInt();
		
		System.out.println("Primo: "+isPrimo(iNumero));
		
		oInput.close();
	}

}
