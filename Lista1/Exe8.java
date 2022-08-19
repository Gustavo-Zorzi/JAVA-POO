package Lista1;
import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe seu salário hora R$ ");
		
		float fSalario = oInput.nextFloat();
		
		System.out.print("Informa as horas trabalhadas: ");
		
		float fHoras = oInput.nextFloat();
		
		System.out.println("Salário total R$: "+fHoras*fSalario);
		
		oInput.close();
	}
}
