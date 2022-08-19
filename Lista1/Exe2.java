package Lista1;
import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int iNumero = oInput.nextInt();
		System.out.println("O número informado foi " + iNumero);
		oInput.close();
	}
}
