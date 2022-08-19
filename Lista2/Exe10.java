package Lista2;
import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		boolean bPrimeiro = true;
		double dMaior = 0;
		double dMenor = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Insira um valor: ");
			double dNumero = oInput.nextDouble();
			if(bPrimeiro) {
				dMaior = dNumero;
				dMenor = dNumero;
				bPrimeiro = false;
			}
			else {
				if(dMaior < dNumero) {
					dMaior = dNumero;
				}
				if(dMenor > dNumero) {
					dMenor = dNumero;
				}
			}
		}
		
		System.out.println("Maior:"+dMaior);
		System.out.println("Menor:"+dMenor);
		
		oInput.close();
	}

}
