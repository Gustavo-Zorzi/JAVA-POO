package Lista1;
import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		float fSoma = 0;
		for (int iContador = 1; iContador <= 4 ; iContador++) {
			System.out.print("Informe a "+iContador+" Nota: ");
			float fNota = oInput.nextFloat();
			fSoma = fSoma + fNota;
		}
		float fMedia = fSoma/4;
		System.out.println("A média do aluno(a) é: "+ fMedia);
		oInput.close();
	}

}
