import java.util.Iterator;
import java.util.Scanner;

/*
8. Faça uma função que informe a quantidade de dígitos de um determinado número
inteiro informado.
 */


public class Exe08 {

	public static void main8() {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Informe o número inicial");
		int num = scan.nextInt();
		
		System.out.println();
		
	}
	
	public static int inverteNum(int num) {
				
		String chars = String.valueOf(num);
		StringBuilder reverse = new StringBuilder();
		
		//for (int i = 0; i < (chars.length()); i++) {
			
			reverse.append(chars.substring(chars.length()-1, 0));
			
		//}
		
		return num;
	}
		
}
