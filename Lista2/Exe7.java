package Lista2;
import java.util.*;

public class Exe7 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		ArrayList<Integer> aNumeros = new ArrayList<Integer>();
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Informe um numero: ");
			int iNumero  = oInput.nextInt();
			aNumeros.add(iNumero);
		}
		
		Collections.reverse(aNumeros);
		
		System.out.println(aNumeros);
		
		oInput.close();
	}

}
