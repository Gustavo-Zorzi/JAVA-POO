package Lista4;
import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		final int TAM = 5;
		
		int[] aVetor = new int[5];
		
		for(int i = 0; i< TAM; i++) {
			aVetor[i] = oInput.nextInt();
		}
		for(int i = 0; i< TAM; i++) {
			System.out.println(aVetor[i]);
		} 
		
		oInput.close();
	}

}
