package Lista3;
import java.util.Scanner;
public class Exe23 {
	
	private static double mediaAlunos(int iTurmas, int iAlunos) {
				
		double dSomaNumeros = 0;
		
		for(int i = 0; i < iTurmas; i++) {
			dSomaNumeros = dSomaNumeros + iAlunos;
		}
		
		double dMediaAritmetica = (dSomaNumeros)/iTurmas;
		
		return dMediaAritmetica;
	}
	
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		boolean bIniciaPrograma = true;
		
		while(bIniciaPrograma) {
		
			System.out.print("Quantidade Turmas: ");
			
			int iTurmas = oInput.nextInt();
						
			System.out.print("Quantidade Alunos: ");
			
			int iAlunos = oInput.nextInt();
			
			oInput.close();
			
			if(iAlunos > 40) {
				System.out.println("Não é possivel informar mais que 40 alunos");
				LimpaConsole.limpa();
			}
			else {
				System.out.println(Exe23.mediaAlunos(iTurmas, iAlunos));
			}
		}
	}

}
