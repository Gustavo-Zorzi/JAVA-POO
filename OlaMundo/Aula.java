package OlaMundo;
import java.util.Scanner;

public class Aula {	
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.print("Entre com seu Nome: ");
		String sNome = input.nextLine();
		System.out.println("------------------");
		System.out.print("Informe o ano do seu Nascimento: ");
		int iAnoNascimento = input.nextInt();
		int iIdade = 2022 - iAnoNascimento;
		System.out.println("Seu Nome: " + sNome);
		System.out.println("Sua Idade: " + iIdade);
		input.close();
	}
}
