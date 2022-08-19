package Lista2;
import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);

		System.out.println("Informe seu Salario Atual: ");
		
		double dSalarioAtual = oInput.nextDouble();
		
		double dSalarioReajuste = dSalarioAtual;
		
		double dReajuste = 0;
		
		if(dSalarioAtual <= 280) {
			dReajuste = 1.2;
			dSalarioReajuste = (dSalarioAtual) * dReajuste;
		}
		else if(dSalarioAtual <= 700){
			dReajuste = 1.15;
			dSalarioReajuste = (dSalarioAtual) * dReajuste;
		}
		else if(dSalarioAtual <= 1500) {
			dReajuste = 1.10;
			dSalarioReajuste = (dSalarioAtual) * dReajuste; 
		}
		else if(dSalarioAtual > 1500) {			
			dReajuste = 1.05;
			dSalarioReajuste = (dSalarioAtual) * dReajuste; 
		}
		
		double dAumento = dSalarioReajuste - dSalarioAtual;
		
		System.out.println("Salario Atual: "+dSalarioAtual);
		System.out.println("Salario Reajuste: "+dSalarioReajuste);
		System.out.println("Reajuste: "+dReajuste);
		System.out.println("Aumento: "+dAumento);
		
		oInput.close();
	}

}
