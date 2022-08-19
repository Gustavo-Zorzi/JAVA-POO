package Lista2;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
		Scanner oInput = new Scanner(System.in);
		
		System.out.println("Informe um Ano com 4 digitos: ");
		
		int iAno = oInput.nextInt();
		
		int iTamanho = String.valueOf(iAno).length();
		
		if(iTamanho < 4) {
			System.out.println("Por favor informe um ano com 4 digitos.");
		}
		else {
			if(iAno % 400 == 0) {
				System.out.println("Bissexto");
			}
			else if((iAno % 4 == 0) && (iAno % 100 != 0)) {
				System.out.println("Bissexto");
			}
			else {
				System.out.println("Não é Bissexto");
			}
		}
		
		oInput.close();
	}

}
