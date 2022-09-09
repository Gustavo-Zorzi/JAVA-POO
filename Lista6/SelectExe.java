import java.util.Iterator;
import java.util.Scanner;

public class SelectExe {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Exe10.geraNum());
		}
		
		
		
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		boolean valid = false;
		
		while (!valid) {
			
			valid = true;
			
		
			System.out.println(UtilsShowCode.mostraMenu());
			answer = scan.nextInt();
			
			switch (answer) {
			case 0:
				break;
			case 7:
				
				Exe07.main7();
				
				break;
			case 8:
				
				Exe08.main8();
				
				break;
			case 9:
				
				Exe09.main9();
				
				break;
			case 10:
				
				Exe10.main10();
				
				break;
	
			default:
				valid = false;
				System.out.println("\nValor Inválido");
				break;
			}
		}
		
		scan.close();
		
	}

}
