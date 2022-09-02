package Lista3;
import java.util.HashMap;
import java.util.Scanner;

public class Exe22 {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);
		
		HashMap<String, Integer> aCandidatos = new HashMap<String, Integer>();
		
		aCandidatos.put("Jose",  0);
		aCandidatos.put("Maria", 0);
		aCandidatos.put("Joao",  0);
		
		System.out.print("Informe a quantidade de votantes: ");
		
		int iVotantes = oInput.nextInt();
		
		int iCandidatos = 1;
		
		for(int i = 0; i < iVotantes; i++) {			
			for(String sCandidatos : aCandidatos.keySet()) {		
				System.out.println("["+iCandidatos+"]"+sCandidatos);
				iCandidatos++;
			}
			System.out.print("Escolha seu candidato(a): ");
			int iVoto = oInput.nextInt();
			if(iVoto == 1) {
				int iVotos = aCandidatos.get("Joao");
				aCandidatos.put("Joao", iVotos+1);
			}
			else if(iVoto == 2) {
				int iVotos = aCandidatos.get("Jose");
				aCandidatos.put("Jose", iVotos+1);
			}
			else if(iVoto == 3) {
				int iVotos = aCandidatos.get("Maria");
				aCandidatos.put("Maria", iVotos+1);
			}
			else {
				System.out.println("Informe um valor valido.");
				i--;
			}
			iCandidatos = 1;
		}
		
		iCandidatos = 1;
		
		System.out.println("Quantidade de votos de cada Candidato: ");
		for(String sCandidatos : aCandidatos.keySet()) {		
			System.out.println("["+iCandidatos+"]"+sCandidatos+" Votos: "+aCandidatos.get(sCandidatos)+"");
			iCandidatos++;
		}
		
		oInput.close();
	}

}
