package Lista1;
import java.lang.Math;
import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Insira um valor para o raio: ");
		
		float fRaio = oInput.nextFloat();
		
		double fArea = Math.PI * Math.pow(fRaio, 2);
		
		System.out.println("A area do circulo e: "+fArea);
		
		oInput.close();
	}
}