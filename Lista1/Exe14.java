package Lista1;
import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);

		System.out.print("Valor da hora em R$ ");
		
		double dSalario = oInput.nextDouble();
		
		System.out.println("Horas Trabalhadas: ");
		
		double dHoras = oInput.nextDouble();
		
		double dSalarioBruto = dHoras*dSalario;
		
		System.out.println("Salario Bruto: "+dSalarioBruto);
		double dIR = dSalarioBruto*0.11;
		System.out.println("IR: "+dIR);
		double dINSS = dSalarioBruto*0.08;
		System.out.println("INSS: "+dINSS);
		double dSindicato = dSalarioBruto*0.05;
		System.out.println("Sindicato: "+dSindicato);
		double dSalarioLiquido = dSalarioBruto-dIR-dINSS-dSindicato;
		System.out.println("Salario Liquido: "+dSalarioLiquido);
		
		oInput.close();
	}

}
