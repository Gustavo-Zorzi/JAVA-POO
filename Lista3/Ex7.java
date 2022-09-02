import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite um número inteiro: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int num2 = entrada.nextInt();
		int seq1 = 0;
		int seq2 = 0;
		if (num1 < num2) {
			seq1 = num1;
			seq2 = num2;
		} else if (num1 >  num2) {
			seq1 = num2;
			seq2 = num1;
		} else {
			System.out.println("Você digitou dois número iguais!");
		}
		for (int x = seq1; x < (seq2 + 1); x++) {
			System.out.print(x + " ");
			if (x % 10 == 0) {
				System.out.println(" ");
			}
		}
		
		
		entrada.close();
	}
}
