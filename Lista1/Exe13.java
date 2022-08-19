package Lista1;
import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe o peso do peixe: ");
		
		double dPesoPeixe = oInput.nextDouble();
		
		int iMulta = 0;
		
		if (dPesoPeixe > 50) {
			iMulta += ((dPesoPeixe-50)*4);
		}
		if(iMulta > 0){
			System.out.println("O peso excedeu, você devera pagar "+iMulta);			
		}
		else {
			System.out.println("O peso está nos conformes.");
		}
		
		oInput.close();
	}

}
