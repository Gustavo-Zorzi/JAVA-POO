import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int vetor[] = new int[10];
		int i;
		int par = 0;
		int impar = 0;
		
		System.out.println("Ser�o solicitados 10 n�meros inteiros");
		for (i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero: ");
			vetor[i] = entrada.nextInt();
			if (vetor[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
	    System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de �mpares: " + impar);		
		
		entrada.close();
		
	}

}
