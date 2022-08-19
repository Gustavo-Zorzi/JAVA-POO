package Lista1;
import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		int   iNum1 = oInput.nextInt();
		System.out.print("Informe o segundo numero: ");
		int   iNum2 = oInput.nextInt();
		System.out.print("Informe o terceiro numero: ");
		float fNum3 = oInput.nextFloat();
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: "+((iNum1*2)/(iNum2/2f)));
		
		System.out.println("A soma do triplo do primeiro com o terceiro "+((3*iNum1)+(3*fNum3)));
		
		System.out.println("O terceiro elevado ao cubo "+(Math.pow(fNum3, 3)));
		
		oInput.close();
	}
}
