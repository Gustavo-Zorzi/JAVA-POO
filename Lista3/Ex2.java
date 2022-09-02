import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um nome de usuário: ");
		String nome = entrada.nextLine();
		String senha = "";
		do {
			System.out.print("Digite a senha: ");
			senha = entrada.nextLine();
			if (nome.equals(senha)) {
				System.out.println("Erro! A senha não pode ser igual ao nome de usuário");
			}
		} while (nome.equals(senha));
		System.out.println("Usuário e senha validados!");
		
		entrada.close();
	}

}
