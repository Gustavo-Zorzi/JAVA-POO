package arquivos.funcoes;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		
		long num = entrada.nextLong();
		
		String resultado = funcoes.Reverte(num);
		
		System.out.print("Reverso do N�mero: " + resultado);
        
        entrada.close();
		
	}
		
}
		
		


