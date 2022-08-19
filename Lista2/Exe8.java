package Lista2;
import java.util.*;

public class Exe8 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota:");
		
		double dNota1 = oInput.nextDouble();
		
		System.out.print("Entre com a segunda nota:");
		
		double dNota2 = oInput.nextDouble();
		
		double dMedia = (dNota1+dNota2)/2;
		
		if(dMedia >= 7) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
		}
		
		oInput.close();
	}

}
