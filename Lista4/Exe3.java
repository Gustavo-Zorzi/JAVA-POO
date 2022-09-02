package Lista4;
import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		final int TAM = 4;
		
		double dMedia = 0;
		
		double dSoma = 0;
		
		double[] aVetor = new double[5];
		
		for(int i = 0; i< TAM; i++) {
			aVetor[i] = oInput.nextDouble();
			dSoma += aVetor[i];
		}
		
		dMedia = (dSoma/TAM);
		
		System.out.println("Media: "+dMedia);
		
		oInput.close();
	}

}
