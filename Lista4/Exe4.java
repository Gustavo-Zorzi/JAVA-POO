package Lista4;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		final int TAM = 10;
		
		char[] aVogais = {'a','e','i','o','u'};
		
		char[] aVetor = new char[10];
		
		int iConsoantes = 0;
		
		for(int i = 0; i< TAM; i++) {
			aVetor[i] = oInput.nextLine().charAt(0);
		}
		
		
		for(int i = 0; i< TAM; i++) {
			System.out.println(aVetor[i]);
			for(int o = 0; o < aVogais.length; o++) {
				if(aVogais[o] != aVetor[i]) {
					iConsoantes++;
				}
			}
		} 
		
		System.out.println("Total de consoantes: "+iConsoantes);
		
		
		oInput.close();
	}

}
