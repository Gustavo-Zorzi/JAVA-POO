package Lista2;
import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Entre com numero: ");
		
		int iNumero = oInput.nextInt();
		
		if(iNumero % 2 == 0) {
			iNumero = 2 * iNumero + 1;
		}
		else {
			iNumero = 2 * (iNumero + iNumero);
		}
		
		System.out.println(iNumero);
		
		oInput.close();
	}

}
