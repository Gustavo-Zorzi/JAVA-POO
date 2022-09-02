package Lista3;
import java.util.Scanner;

public class Exe20 {
	
	public static double mediaAritmetica(int iNumero, String sIdentificador) {
		Scanner oInput = new Scanner(System.in);
		
		double dNumeroEntrada;
		
		double dSomaNumeros = 0;
		
		for(int i = 0; i < iNumero; i++) {
			System.out.print("Digite "+sIdentificador+" "+(i+1)+": ");
			dNumeroEntrada = oInput.nextDouble();
			dSomaNumeros = dSomaNumeros + dNumeroEntrada;
		}
		
		double dMediaAritmetica = (dSomaNumeros)/iNumero;
		
		oInput.close();
		
		return dMediaAritmetica;
	}
	
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Quantas notas serao computadas? ");
		
		int iNotas = oInput.nextInt();
		
		String sIdentificador = "Nota";
		
		System.out.print("Media Aritmetica: "+mediaAritmetica(iNotas, sIdentificador));
		
		oInput.close();
	}

}
