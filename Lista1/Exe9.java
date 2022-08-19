package Lista1;
import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
			
		System.out.print("Temperatura em Farenheit: ");
		
		float fFarenheit = oInput.nextFloat();
		
		double fCelsius = ((fFarenheit - 32)/1.8);
		
		System.out.println("Temperatura em Celsius: "+fCelsius);
		
		oInput.close();	
	}

}
