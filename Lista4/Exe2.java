package Lista4;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		final int TAM = 10;
		
		float[] aVetor = new float[10];
		
		for(int i = 0; i< TAM; i++) {
			aVetor[i] = oInput.nextFloat();
		}
		for(int i = TAM; i >= 0; i--) {
			System.out.println(aVetor[i]);
		} 
		
		oInput.close();

	}

}
