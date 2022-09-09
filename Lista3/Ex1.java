import java.util.Scanner; 

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int nota = 0;
		do {
			System.out.println("Digite uma nota entre zero e dez: ");
			nota = entrada.nextInt();
			if ((nota<0) || ( nota>10)) {
				System.out.println("Entrada inválida!");
			}
		} while ((nota<0) || (nota>10));
		System.out.println("Entrada Validada!");
		
			
		entrada.close();
	}

}
