package Lista1;
import java.util.Scanner;

public class Exe15 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Area a ser pintada: ");
		
		double dArea = oInput.nextDouble();
		
		double dLitrosTinta = dArea/3;
		
		int iLatas = 0;
		double dLatasLitros = 0;
		
		while(dLatasLitros < dLitrosTinta) {
			iLatas += 1;
			dLatasLitros += 18;
		}
		
		System.out.println("Litros de tinta necessario: "+dLitrosTinta);
		double dPrecoLatas = iLatas*80;
		System.out.println("Preço latas: "+dPrecoLatas);
		System.out.println("Litros Tinta: "+dLitrosTinta);
		oInput.close();

	}

}
