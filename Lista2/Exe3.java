package Lista2;
import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Entre com uma letra: ");
		
		String sLetra = oInput.next();
		
		sLetra = sLetra.toUpperCase();
		
		if(sLetra.startsWith("F")) {
			System.out.println("Feminino");
		}
		else if(sLetra.startsWith("M")) {
			System.out.println("Masculino");
		}
		
		oInput.close();
	}

}
