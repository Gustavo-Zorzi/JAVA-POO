package Lista2;
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		String[] aVogais = {"a", "e", "i", "o", "u"};
		
		System.out.print("Entre com uma letra: ");
		
		String sLetra = oInput.next().toLowerCase().strip();
		
		boolean bVogal = false;
		
		int iContador = 0;
		
		while(!bVogal && iContador < 5) {
			if(sLetra.intern() == aVogais[iContador]) {
				bVogal = true;
			}
			else {
			}
			iContador++;
		}
		
		System.out.println("Vogal: "+bVogal);
		
		oInput.close();
	}

}
