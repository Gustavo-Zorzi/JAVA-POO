import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um nome de usu�rio: ");
		String nome = entrada.nextLine();
		String senha = "";
		do {
			System.out.print("Digite a senha: ");
			senha = entrada.nextLine();
			if (nome.equals(senha)) {
				System.out.println("Erro! A senha n�o pode ser igual ao nome de usu�rio");
			}
		} while (nome.equals(senha));
		System.out.println("Usu�rio e senha validados!");
		
		entrada.close();
	}

}
