import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("**PROGRAMA TABUADA**");
		System.out.println("A tabuada de qual número (inteiro) deseja gerar?: ");
		int num = entrada.nextInt();
		for (int x = 1; x < 11; x++) {
			if (x==1) {
				System.out.println("Tabuada de " + num + ": ");
			}
			System.out.println(num + " * " + x + " = " + (num * x));
		}
		entrada.close();
	}

}
