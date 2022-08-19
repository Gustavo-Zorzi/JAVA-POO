package Lista1;
import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe sua altura em metros:");
		
	    double fMetros = oInput.nextDouble();
		
		double fPesoIdealMasc = ((72.7*fMetros)-58);
		double fPesoIdealFemi = ((62.1*fMetros)-44.7);
		
		System.out.println("Seu peso ideal Masculino: "+fPesoIdealMasc);
		System.out.println("Seu peso ideal Feminino: "+fPesoIdealFemi);
		
		oInput.close();
	}

}
