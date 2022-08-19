package Lista2;
import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {
		
		double dPesoIdeal = 0;
		boolean bAcimaDoPeso = false;
		
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Altura: ");
		
		double dAltura = oInput.nextDouble();
		
		System.out.print("Peso: ");
		
		double dPeso = oInput.nextDouble();
		
		System.out.println("[1] Masculino");
		System.out.println("[2] Feminino");
		System.out.println("Sexo: ");
		
		int iSexo = oInput.nextInt();
		
		if(iSexo == 1) {
			dPesoIdeal = (72.7*dAltura) - 58;
		}
		else if(iSexo == 2){
			dPesoIdeal = (62.1*dAltura) - 44.7;			
		}
		else {
			System.out.println("Entre com valor valido.");
		}
		
		if(dPeso > dPesoIdeal) {
			bAcimaDoPeso = true;
		}
		
		System.out.println("Acima do Peso: "+bAcimaDoPeso);
		
		oInput.close();
	}

}
