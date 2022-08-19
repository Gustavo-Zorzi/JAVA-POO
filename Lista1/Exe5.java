package Lista1;
import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		System.out.println("Informe a medida em (m): ");
		float fMedida = oInput.nextFloat();
		System.out.println("A medidia: "+fMedida+"m em centimetros é igual a: "+fMedida*100+"cm");
		oInput.close();
	}
}
