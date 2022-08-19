package Lista2;
import java.util.Scanner;

public class Exe27e26e25 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);

		double dNumero1;
		double dNumero2;
		boolean isPar = false;
		boolean isPositivo = false;;
		boolean isDecimal= false;
		
		System.out.println("Escolha uma das operações abaixo");
		System.out.println("[1] Soma");
		System.out.println("[2] Subtração");
		System.out.println("[3] Multiplicação");
		System.out.println("[4] Divisão");
		System.out.print("Sua Escolha: ");
		
		int iEscolha = oInput.nextInt();
		
		System.out.print("Entre com um Numero: ");
		dNumero1 = oInput.nextDouble();
		System.out.println("Entre com outro Numero:");
		dNumero2 = oInput.nextDouble();
		
		if(dNumero1 % 2 == 0) {
			isPar = true;
		}
		
		if(dNumero1 > 0) {
			isPositivo = true;
		}
		
		if((dNumero1*10) % 10 > 0) {
			isDecimal = true;
		}
		
		if(iEscolha == 1) {
			System.out.println("R:"+(dNumero1+dNumero2));
		}
		else if(iEscolha == 2) {
			System.out.println("R:"+(dNumero1-dNumero2));
		}
		else if(iEscolha == 3) {
			System.out.println("R:"+(dNumero1*dNumero2));			
		}
		else if(iEscolha == 4) {
			System.out.println("R:"+(dNumero1/dNumero2));						
		}
		else {
			System.out.println("Entre com um valor valido");
		}
		
		System.out.println("Par:"+isPar);
		System.out.println("Positivo:"+isPositivo);
		System.out.println("Decimal:"+isDecimal);
		
		
		oInput.close();
	}

}
