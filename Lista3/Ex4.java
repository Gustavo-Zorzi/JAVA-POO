import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean sair = false;
		float populacaoA = 0;
		float populacaoB = 1;
		float taxaA = 0;
		float taxaFinalA = 0;
		float taxaB = 0;
		float taxaFinalB = 0;
		int anos = 0;
		
		while (!sair) {
     	    System.out.print("Informe a popula��o atual do pa�s A: ");
	     	populacaoA = entrada.nextInt();
		    System.out.print("Informe a taxa de crescimento do pa�s A (em %): ");
			taxaA = entrada.nextFloat();
			do {
		    	System.out.print("Informe a popula��o atual do pa�s B: ");
				populacaoB = entrada.nextInt();
				if (populacaoB < populacaoA) {
			     	System.out.println("A popula��o do pa�s B deve ser maior que a do pa�s A!");
				}
			} while (populacaoB < populacaoA);
				
			do {
			   System.out.print("Informe a taxa de crescimento do pa�s B (em %): ");
			   taxaB = entrada.nextFloat();
		       if (taxaB > taxaA){
			       System.out.println("A taxa de crescimento do pa�s B deve ser menor que a do pa�s A!");
				}
			} while (taxaB > taxaA);
				
			while (populacaoA < populacaoB) {
				
				taxaFinalA = ((taxaA / 100) + 1);
				taxaFinalB = ((taxaB / 100) + 1);

				populacaoA = populacaoA * taxaFinalA;
				populacaoB = populacaoB * taxaFinalB;
				
				anos++;
			}
			System.out.println("Ser�o necess�rios " + (Math.round(anos)) + " anos para que a popula��o do pa�s A iguale ou ultrapasse a popula��o do pa�s B");
			System.out.println("Deseja rodar o programa novamente: ");
			System.out.println("1-Sim");
			System.out.println("2-N�o");
			int opcao = entrada.nextInt();
			switch (opcao) {
			    case 1:
			    	System.out.println("");
			    	break;
			    case 2:
			    	sair = true;
			    	break;
			}
		}
				
		entrada.close();
		
	}		

}
				
