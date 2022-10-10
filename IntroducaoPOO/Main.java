package IntroducaoPOO;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner oInput = new Scanner(System.in);

		String sMenu = "[1] Exercicio 1 \n[2] Exercicio 2\n[3] Exercicio 3\n[4] Exercicio 4\n";
		
		System.out.print(sMenu);
		
		System.out.print("Informe sua escolha: ");
		
		int iEscolha = oInput.nextInt();
		
		Estrutura.renderizaExercicio(iEscolha);
		
		oInput.close();
	}
	
	public static void exercicio1e7() {
		
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Entre com seu Nome: ");
		
		String sNome = oInput.nextLine();
		
		System.out.print("Entre com seu Sobrenome: ");
		
		String sSobrenonome = oInput.nextLine();
		
		Pessoa oPessoa = new Pessoa(sNome, sSobrenonome, 1.70, 75.8, 24);
		
		System.out.println(oPessoa);
		
		oInput.close();
	}
	
	public static void exercicio2() {
	}
	
	public static void exercicio3() {
		Scanner oInput = new Scanner(System.in);

		System.out.print("Entre com um número");
		
		double dNumero1 = oInput.nextDouble();
		
		System.out.print("Entre com outro número");
		
		double dNumero2 = oInput.nextDouble();
		
		UtilsMatematica.geraOperacoesBasicas(dNumero1, dNumero2);
		
		oInput.close();
	}
	
	public static void exercicio4() {
		
	}
	
	public static void exercicio5() {
		
	}
	
	public static void exercicio6() {
		
	}
	
	public static void exercicio8() {
		
	}
	
	public static void exercicio9() {
		
	}
	
	public static void exercicio10() {
		
		Televisao oTV = new Televisao("Samsung", 10, 40);
		
		System.out.println(oTV);
		
	}
	
	public static void exercicio11() {
		
	}
}
