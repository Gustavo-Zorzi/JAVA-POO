package Lista1;
import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int iNumero1 = oInput.nextInt();
		System.out.print("Informe outro número: ");
		int iNumero2 = oInput.nextInt();
		int iNumero3 = iNumero1 + iNumero2;
		oInput.close();
		System.out.println("A soma é: " + iNumero3);
	}

}
