package Lista2;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		
		int iNumero = oInput.nextInt();
		
		if(iNumero > 0) {
			System.out.println("Positivo");
		}
		else if(iNumero == 0) {
			System.out.println("Nulo");
		}
		else {
			System.out.println("Negativo");
		}
		
		oInput.close();
	}

}
