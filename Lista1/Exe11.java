package Lista1;
import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe sua altura em metros:");
		
	    double fMetros = oInput.nextDouble();
		
		double fPesoIdeal = ((72.7*fMetros)-58);
		
		System.out.println("Seu peso ideal: "+fPesoIdeal);
		
		oInput.close();
	}

}
