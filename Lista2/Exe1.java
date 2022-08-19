package Lista2;
import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		
		int iNum1 = oInput.nextInt();
		
		System.out.print("Entre com outro numero: ");
		int iNum2 = oInput.nextInt();
		
		if(iNum1 > iNum2) {
			System.out.println("O primeiro é maior");
		}
		else if(iNum1 == iNum2) {
			System.out.println("Os dois são iguais");
		}
		else {
			System.out.println("O segundo é maior");
		}
		
		oInput.close();
	}

}
