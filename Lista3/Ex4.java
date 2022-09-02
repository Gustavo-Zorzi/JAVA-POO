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
     	    System.out.print("Informe a população atual do país A: ");
	     	populacaoA = entrada.nextInt();
		    System.out.print("Informe a taxa de crescimento do país A (em %): ");
			taxaA = entrada.nextFloat();
			do {
		    	System.out.print("Informe a população atual do país B: ");
				populacaoB = entrada.nextInt();
				if (populacaoB < populacaoA) {
			     	System.out.println("A população do país B deve ser maior que a do país A!");
				}
			} while (populacaoB < populacaoA);
				
			do {
			   System.out.print("Informe a taxa de crescimento do país B (em %): ");
			   taxaB = entrada.nextFloat();
		       if (taxaB > taxaA){
			       System.out.println("A taxa de crescimento do país B deve ser menor que a do país A!");
				}
			} while (taxaB > taxaA);
				
			while (populacaoA < populacaoB) {
				
				taxaFinalA = ((taxaA / 100) + 1);
				taxaFinalB = ((taxaB / 100) + 1);

				populacaoA = populacaoA * taxaFinalA;
				populacaoB = populacaoB * taxaFinalB;
				
				anos++;
			}
			System.out.println("Serão necessários " + (Math.round(anos)) + " anos para que a população do país A iguale ou ultrapasse a população do país B");
			System.out.println("Deseja rodar o programa novamente: ");
			System.out.println("1-Sim");
			System.out.println("2-Não");
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
				
