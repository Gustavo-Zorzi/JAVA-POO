import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE POTENCIAÇÃO");
		float base;
		float resposta = 1;
		do {
			System.out.println("Informe o valor da base da Potenciação: ");
		    base = entrada.nextFloat();
		    if (base == 0) {
		    	System.out.println("A base precisa ser diferente de zero!");
		    }
		} while (base == 0);
			
		System.out.println("Informe o valor do expoente: ");
		float exp = entrada.nextFloat();
		
		for (int i = 0; i < exp; i++) {
				resposta = resposta * base;
		
		}
				
		System.out.println("Resposta: " + resposta);
		
		entrada.close();
	}

}


