import java.util.Random;
import java.util.Scanner;

/*
 * Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador
lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você
tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira
jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez
um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os
dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes
de tirar este Ponto novamente.
 */


public class Exe10 {
	public static void main10(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nInforme qualquer coisa para jogar seus dados    ");
		
		scan.next();
		
		boolean end = false;
		
		int dado1 = geraNum();
		int dado2 = geraNum();
		System.out.print("\nPrimeiro dado: " + dado1);
		System.out.print("\nPrimeiro dado: " + dado2);
		
		int somaDados = dado1+dado2;
		int primeiraSoma = somaDados;
		
		int primJogada = validaPrimeiraJogada(somaDados);
		
		
		System.out.println("\nPrimeira jogada: " + primeiraSoma);
		
		if (primJogada == 0) {
			
			do {
				
				dado1 = geraNum();
				dado2 = geraNum();
				System.out.print("\nPrimeiro dado: " + dado1);
				System.out.print("\nSegundo dado: " + dado2);
				somaDados = dado1+dado2;
				
				if (somaDados == 7) {
					System.out.print("\n7, Você perdeu :(");
					end = true;
				}
				if (somaDados == primeiraSoma) {
					System.out.print("\nParabéns, você venceu :D");	
					end = true;
				}
				
			} while (!end);
			
		}else if (primJogada == 1) {
			System.out.print("\nNatural, você venceu :D");
		}else {
			System.out.print("\nCraps, você perdeu :(");
		}
		
	}
	
	public static boolean valida7(int num) {
		
		if (num == 7) {
			
			return true;
			
		}
		
		return false;
	}
	
	public static int validaPrimeiraJogada(int diceRolls){
		
		int result = 0;
		
		switch (diceRolls) {
		case (11):
			result = 1;
			
			break;
		case (7):
			result = 1;
			
			break;
		case (2):
			result = 2;
			break;
			
		case (3):
			result = 2;
			break;
		case (12):
			result = 2;
			break;
		default:
			result = 0;
			break;
		}
		
		return result;
	}
	
	public static boolean valida(int num) {
		
		boolean isValid = true;
		
		
		return isValid;
	}
	
	public static int geraNum() {
		int maxDado = 6;
		int minDado = 1;
		Random random = new Random();
		
		return (int)(((Math.random() * (maxDado - minDado)) + minDado)+0.5);
	}
	
}
