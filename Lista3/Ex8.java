import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		System.out.println("Digite um n�mero inteiro: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
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
			System.out.println("Voc� digitou dois n�mero iguais!");
		}
		for (int x = seq1; x < (seq2 + 1); x++) {
			System.out.print(x + " ");
			soma = soma + x;
			if (x % 10 == 0) {
				System.out.println("");
			}
		}
		
		System.out.println("A soma dos n�meros do intervalo � igual a: " + soma);
		
		
		entrada.close();
	}
}
