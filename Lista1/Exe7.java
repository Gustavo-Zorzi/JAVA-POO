package Lista1;
import java.lang.Math;
import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Insira um valor para um lado do quadrado: ");
		
		float fLado = oInput.nextFloat();
		
		double fArea = Math.pow(fLado, 2);
		
		System.out.println("A area do quadrado e: "+fArea);
		
		oInput.close();
	}
}