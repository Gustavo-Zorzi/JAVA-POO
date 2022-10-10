package Teste;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		ArrayList<Float> aTabuada = new ArrayList<Float>();
		
		System.out.print("Entre com um numero: ");
		
		float fNumero = oInput.nextFloat();
		
		System.out.print("Entre com o valor final da tabuada: ");
		
		
		float fNumeroFinal = oInput.nextFloat();
		
		
		for (int iContador = 0; iContador <= fNumeroFinal; iContador++) {			
			aTabuada.add(iContador*fNumero);
		}
		
		System.out.println("Deseja ver a tabuda em qual ordem:");
		System.out.println("[1] ASC");
		System.out.println("[2] DESC");
		System.out.println("Sua escolha: ");
		
		int iEscolha = oInput.nextInt();
		
		if(iEscolha == 1) {
			System.out.println(aTabuada);			
		}
		else if(iEscolha == 2) {
			Collections.reverse(aTabuada);			
			System.out.println(aTabuada);
		}
		else {
			System.out.println("Entre com um valor valido");
		}
		
		oInput.close();
	}

}
