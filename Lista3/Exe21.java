package Lista3;
import java.util.Scanner;

public class Exe21 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Digite quantas idades serao computadas: ");
		
		int iIdade = oInput.nextInt();
		
		String sIdentificador = "Idade";
		
		double dMediaIdade = Exe20.mediaAritmetica(iIdade, sIdentificador);
		
		if(dMediaIdade <= 25) {
			System.out.println("Jovem");
		}
		else if(dMediaIdade <= 60) {
			System.out.println("Adulta");			
		}
		else {
			System.out.println("Idosa");						
		}
		
		oInput.close();
	}

}
