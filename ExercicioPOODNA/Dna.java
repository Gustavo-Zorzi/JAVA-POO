package ExercicioPOODNA;

import java.util.stream.*;
import java.util.Arrays;
import java.util.Random;

public class Dna{
	
	private final String ADENINA  = "A";
	private final String TIMINA   = "T";
	private final String GUANINA  = "G";
	private final String CITOSINA = "C";
	private final String URACILA  = "U";
	
	private String[] aAcidos = {ADENINA, TIMINA, GUANINA, CITOSINA};
	
	private String[] aFitaDna;
	
	private int iCadeiaTamanho;
	
	public Dna(int iCadeiaTamanho) {
		this.iCadeiaTamanho = iCadeiaTamanho;
		aFitaDna = new String[iCadeiaTamanho];
		criaFitaDna(aFitaDna);
	}
	
	private void criaFitaDna(String[] aFitaDna) {
		
		Random oNumeroAleatorio = new Random();
		
		for(int iBase = 0; iBase < aFitaDna.length; iBase++) {
			aFitaDna[iBase] = aAcidos[oNumeroAleatorio.nextInt(aAcidos.length)];
		}
	}
	
	public String[] transcricaoDnaRna(String[] aFitaDna) {
		
		for(int iBase = 0; iBase < aFitaDna.length; iBase++) {
			aFitaDna[iBase] = (aFitaDna[iBase].equals(ADENINA)) ? URACILA : aFitaDna[iBase];
			
		}
		
		String[] aFitaRna = aFitaDna;
		
		return aFitaRna;
	}
	
	public String[] getFitaDna() {
		return aFitaDna;
	}
	
	public int getCadeiaTamanho() {
		return iCadeiaTamanho;
	}
	
	public void setCadeiaTamanho(int iCadeiaTamanho) {
		this.iCadeiaTamanho = iCadeiaTamanho;
	}
	
}
