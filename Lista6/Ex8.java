package arquivos.funcoes;

import java.util.Scanner;

public class Ex8 {

		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int x = entrada.nextInt();
		
		String resultado = funcoes.contaDigitos(x);
		
		System.out.println("O n�mero informado possui " + resultado.length() + " d�gitos.");
		
		entrada.close();

	}

}

