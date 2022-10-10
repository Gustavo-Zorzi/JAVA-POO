package ExercicioPOODNA;

import java.util.Random;

public class Rna {
	
	private final String ADENINA  = "A";
	private final String URACILA  = "U";
	private final String GUANINA  = "G";
	private final String CITOSINA = "C";
	
	private String[] aAcidos = {ADENINA, URACILA, GUANINA, CITOSINA};
		
	private String[] aFitaRna;
		
	private int iCadeiaTamanho;
		
	public Rna(int iCadeiaTamanho) {
		this.iCadeiaTamanho = iCadeiaTamanho;
		aFitaRna = new String[iCadeiaTamanho];
		criaFitaRna(aFitaRna);
	}
		
	private void criaFitaRna(String[] aFitaRna) {
		
		Random oNumeroAleatorio = new Random();
			
		for(int iBase = 0; iBase < aFitaRna.length; iBase++) {
			aFitaRna[iBase] = aAcidos[oNumeroAleatorio.nextInt(aAcidos.length)];
		}
	}
		
	public String[] getFitaRna() {
		return aFitaRna;
	}
		
	public int getCadeiaTamanho() {
		return iCadeiaTamanho;
	}
	
	public void setCadeiaTamanho(int iCadeiaTamanho) {
		this.iCadeiaTamanho = iCadeiaTamanho;
	}
	
}
