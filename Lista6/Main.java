package Lista6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		exe12();
	}
	
	public static void exe7() {
		
		double dValorPrestacao = 1;
		
		Scanner oInput = new Scanner(System.in);
		
		while(dValorPrestacao > 0) {
			
			System.out.print("Informe o valor da prestacao: ");
			
			dValorPrestacao = oInput.nextDouble();
			
			System.out.print("Informe os dias em atraso: ");
			
			double dDiasAtrasados = oInput.nextInt();
				
			double dValorPagamento = valorPagamento(dValorPrestacao, dDiasAtrasados);
			
			System.out.println("Valor a pagar: "+dValorPagamento);	
		}
		
		oInput.close();	
	}
	
	public static void exe8() {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		
		int iNumero = oInput.nextInt();
		
		int iDigitos = contarDigitos(iNumero);
		
		System.out.println("Digitos: "+iDigitos);
		
		oInput.close();
	}
	
	public static void exe9() {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		
		int iNumero = oInput.nextInt();
		
		int iNumeroInvertido = inverterNumero(iNumero);
		
		System.out.print("Numero Invertido: "+iNumeroInvertido);
		
		oInput.close();
	}
	
	public static void exe12() {
		Scanner oInput = new Scanner(System.in);
			
		System.out.print("Digite algo que voce gosta: ");
		
		String sPalavra = oInput.next();
		
		String sPalavraEmbaralhada = embaralhaPalavra(sPalavra);
		
		System.out.println("Palavra Embaralhada: "+sPalavraEmbaralhada);
		
		oInput.close();
	}
	
	static String embaralhaPalavra(String sPalavra) {
		
		String sPalavraTratada = sPalavra.toUpperCase();
		
		List<String> aLetras = Arrays.asList(sPalavraTratada.split(""));
		
		Collections.shuffle(aLetras);
		
		StringBuilder sPalavraEmbaralhada = new StringBuilder(sPalavraTratada.length());
		
		for(String sPalavraAleatoria : aLetras) {
			sPalavraEmbaralhada.append(sPalavraAleatoria);
		}
		
		return sPalavraEmbaralhada.toString();
	}
	
	public static void exe11() {
		Scanner oInput = new Scanner(System.in);
		
		System.out.print("Informe uma data dd/mm/aaaa: ");
		
		String sData = oInput.next().trim();
		
		String sDataTratada = dataTratada(sData);
		
		System.out.println(sDataTratada);
		
		oInput.close();
	}
	
	
	/**
	 * Exercicio 11
	 * @param sData
	 * @return String sDataTratada
	 */
	static String dataTratada(String sData) {
		
		String sDataTratada = null;
		
		if(sData.contains("/")) {
			
			String[] aMeses = {
					"Janeiro","Fevereiro","Marco",
					"Abril","Maio","Junho",
					"Julho","Agosto","Setembro",
					"Outubro","Novembro","Dezembro"};
			
			String[] aDataTratada = sData.split("/");
			
			String sDia = aDataTratada[0];
			
			int iMes = Integer.parseInt(aDataTratada[1]);
			
			if(iMes < 12 || iMes > 0) {
				String sMes = aMeses[iMes-1];
				
				String sAno = aDataTratada[2];
				
				sDataTratada = String.format("%s de %s do ano %s", sDia,sMes,sAno);
			}
		}
		
		return sDataTratada;
		
	}
	
	/**
	 * Exercicio 9
	 * @param iNumero
	 * @return int iNumeroInvertido
	 */
	static int inverterNumero(int iNumero) {
		String sNumero = String.valueOf(iNumero);
		
		String sNumeroInvertido = new StringBuilder(sNumero).reverse().toString();
		
		return Integer.parseInt(sNumeroInvertido);
	}
	
	/**
	 * Exercicio 8
	 * @param iNumero
	 * @return int sNumero
	 */
	static int contarDigitos(int iNumero) {
		String sNumero = String.valueOf(iNumero);
		return sNumero.length();
	}
	
	
	/**
	 * Exercicio 7
	 * @param dValorPrestacao
	 * @param dDiasAtrasados
	 * @return double dPorcetagemAtraso
	 */
	static double valorPagamento(double dValorPrestacao, double dDiasAtrasados) {
		
		if(dValorPrestacao == 0) {
			return dValorPrestacao;
		}
		
		double dPorcentagemAtraso = dValorPrestacao+(dValorPrestacao*0.33)+(dDiasAtrasados*(dValorPrestacao*0.001));
		
		return dPorcentagemAtraso;
	}
	
}


