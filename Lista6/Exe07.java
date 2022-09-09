import java.util.Scanner;

//Pagamento de parcela

/*Faça um programa que use a função valorPagamento para determinar o valor a ser
pago por uma prestação de uma conta. O programa deverá solicitar ao usuário o
valor da prestação e o número de dias em atraso e passar estes valores para a função
valorPagamento, que calculará o valor a ser pago e devolverá este valor ao
programa que a chamou. O programa deverá então exibir o valor a ser pago na tela.
Após a execução o programa deverá voltar a pedir outro valor de prestação e assim
continuar até que seja informado um valor igual a zero para a prestação. Neste
momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá

a quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser
pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da
prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia
de atraso. 
 */


public class Exe07 {

	//Entrada do usuário e chamada do restante de métodos
	public static void main7() {
		Scanner scan = new Scanner(System.in);
		
		float valIni = 0;
		int diaAtraso = 0;		
		
		do {
			
			System.out.println("Informe o valor inicial da parcela");
			valIni = scan.nextFloat();
			
			if (valIni != 0) {
				System.out.println("Informe o número de dias de atraso");
				diaAtraso = scan.nextInt();
				
				System.out.println(valorPagamento(valIni, diaAtraso)); 
				
			}
			
		} while(valIni != 0);
		
		scan.close();		
		
	}
	
	//Cálculo de cada parcela única
	public static float valorPagamento(float v, int dA) {
		
		if (dA > 0) {
			v += (v * 0.03)+(v * dA/1000);
		}
		
		return v;
	}
	
}
