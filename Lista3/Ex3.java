import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		float salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.print("Digite o nome (Mais de três caracteres): ");
			nome = entrada.nextLine();
		} while (nome.length()<=3);
		
		do {
			System.out.print("Informe a idade (entre 0 e 150): ");
			idade = entrada.nextInt();
		} while ((idade<0) || (idade>150));
		
		do {
			System.out.print("Informe o salário (Maior que zero): ");
			salario = entrada.nextFloat();
		} while (salario<0);
		
		do {
			System.out.print("Informe o sexo (M-Masculino e F-Feminino): ");
			sexo = entrada.nextLine();
		} while (!((sexo.equalsIgnoreCase("m")) || (sexo.equalsIgnoreCase("f"))));
		
		do {
			System.out.println("Estado Civil: ");
			System.out.println("S-Solteiro(a)");
			System.out.println("C-Casado(a)");
			System.out.println("V-Viuvo(a)");
			System.out.print("D-Desquitado(a)");
			estadoCivil = entrada.nextLine();		
		} while (!((estadoCivil.equalsIgnoreCase("s")) || (estadoCivil.equalsIgnoreCase("c")) || (estadoCivil.equalsIgnoreCase("v")) || (estadoCivil.equalsIgnoreCase("d"))));
		System.out.println("Dados validados!");
		
		entrada.close();
	}

}
