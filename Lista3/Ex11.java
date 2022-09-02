import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int vetor[] = new int[10];
		int i;
		int par = 0;
		int impar = 0;
		
		System.out.println("Serão solicitados 10 números inteiros");
		for (i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetor[i] = entrada.nextInt();
			if (vetor[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
	    System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + impar);		
		
		entrada.close();
		
	}

}
