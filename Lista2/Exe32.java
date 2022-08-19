package Lista2;
import java.util.*;

public class Exe32 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);

		
		String[] aGabarito = {"a","a","b","b","c","c","d","d","e","e"};
		
		ArrayList<String> aResposta = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {	
			System.out.print("Entre com Resposta Q"+(i+1)+": ");
			
			String sResposta = oInput.next().toLowerCase();
			
			aResposta.add(sResposta);
		}
		
		int iPontos = 0;
		
		for(int i = 0; i < 10; i++) {
			if(aGabarito[i].equals(aResposta.get(i))) {
				System.out.println("Q"+(i+1)+" : Correta");
				iPontos = iPontos + 1;
			}
			else {
				System.out.println("Q"+(i+1)+" : Incorreta, resposta correta("+aGabarito[i]+")");
			}
		}
		
		System.out.println("Pontuacao: "+iPontos);
		
		oInput.close();
	}

}
