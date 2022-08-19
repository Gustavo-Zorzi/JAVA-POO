package Lista1;
import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
			
		System.out.print("Area a ser pintada: ");
		
		double dArea = oInput.nextDouble();
		
		double dLitrosTinta = dArea/6;
		
		int iGaloes = 0; 
		
		double dLitrosGalao = 0; 
		
		while(dLitrosGalao < dLitrosTinta) {
			iGaloes += 1;
			dLitrosGalao += 3.6;
		}
		
		double dPrecoGaloes = iGaloes*25;
		
		int iLatas = 0;
		float dLitrosLatas = 0;
		
		while (dLitrosLatas<dLitrosTinta) {
			iLatas += 1;
			dLitrosLatas += 18;
		}
		
		double dPrecoLatas = iLatas*80;
		
		System.out.println("Total Litros Necessarios: "+dLitrosTinta);
		System.out.println("Preço da tinta em Galões R$ "+dPrecoGaloes);
		System.out.println("Galões| Litros Tinta:"+dLitrosGalao);
		System.out.println("Preço da Tinta em Latas: R$ "+dPrecoLatas);
		System.out.println("Latas| Litros Tinta:"+dLitrosLatas);
		
		oInput.close();
	}

}
