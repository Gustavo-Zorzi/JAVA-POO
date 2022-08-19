package Lista2;
import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
			
		System.out.println("Qual seu turno de trabalho?");
		System.out.println("[M] Matutino");
		System.out.println("[V] Vespertino");
		System.out.println("[N] Noturno");
		
		System.out.print("Sua escolha: ");
		
		String sEscolhaTurno = oInput.nextLine().toUpperCase();
		
		if(sEscolhaTurno.equals("M")) {
			System.out.println("Bom dia!");
		}
		else if(sEscolhaTurno.equals("V")) {
			System.out.println("Bom Tarde!");
		}
		else if(sEscolhaTurno.equals("N")) {
			System.out.println("Bom Noite!");
		}
		
		oInput.close();
	}

}
