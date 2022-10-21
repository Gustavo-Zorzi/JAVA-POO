package ExerciosFormasGeometricas;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner oInput = new Scanner(System.in);
		
		System.out.print(geraMenu());
		
		int iEscolha = oInput.nextInt();
		
		renderizaExercicio(iEscolha);
		
		oInput.close();	
	}
	
	private static String geraMenu() {
		return "[1] CUBO\n[2] PIRAMIDE\n[3] CONE\nDigite sua Escolha: ";
	}
	
	private static void renderizaExercicio(int iEscolha) {
		switch (iEscolha) {
			case 1:
				pintaCubo();
				break;
			case 2: 
				pintaPiramide();
				break;
			case 3:
				pintaCone();
				break;
		default:
			throw new IllegalArgumentException("Exercicio não encontrado");
		}
	}
	
	private static void pintaCubo() {
		
		Cubo oCubo = new Cubo(4, 2, Cubo.TIPO_1);
		
		System.out.println(oCubo);
	}
	
	private static void pintaPiramide() {
		
	}
	
	private static void pintaCone() {
		
	}
}
