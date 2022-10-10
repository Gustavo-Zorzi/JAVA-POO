package IntroducaoPOO;

public class Pessoa {
	
	private String sNome;
	
	private String sSobrenome;
	
	private double dAltura;
	
	private double dPeso;
	
	private int iIdade;
	
	public Pessoa(String sNome, String sSobrenome, double dAltura, double dPeso, int iIdade) {
		this.sNome = sNome;
		this.sSobrenome = sSobrenome;
		this.dAltura = dAltura;
		this.dPeso = dPeso;
		this.iIdade = iIdade;
	}

	public String getNome() {
		return sNome;
	}

	public void setNome(String sNome) {
		this.sNome = sNome;
	}

	public String getSobrenome() {
		return sSobrenome;
	}

	public void setSobrenome(String sSobrenome) {
		this.sSobrenome = sSobrenome;
	}

	public double getAltura() {
		return dAltura;
	}

	public void setAltura(double dAltura) {
		this.dAltura = dAltura;
	}

	public double getPeso() {
		return dPeso;
	}

	public void setPeso(double dPeso) {
		this.dPeso = dPeso;
	}
	
	public int getIdade() {
		return iIdade;
	}
	
	public void setIdade(int iIdade) {
		this.iIdade = iIdade;
	}
	
	public void envelhecerPessoa(int iAnos) { 
		
		this.iIdade += iAnos;
		
		crescerPessoa(0.5, iAnos < 21);
	}
	
	public void engordarPessoa(double dMassa) {
		this.dPeso += dMassa;
	}
	
	public void emagrecerPessoa(double dMassa) {
		this.dPeso -= dMassa;
	}
	
	private void crescerPessoa(double dAlturaCrescimento, boolean bCondicaoCrescimento) {
		this.dAltura = (bCondicaoCrescimento) ? this.dAltura += dAlturaCrescimento : this.dAltura;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seu nome é ");
		builder.append(sNome);
		builder.append(" ");
		builder.append(sSobrenome);
		builder.append(", sua Altura: ");
		builder.append(dAltura);
		builder.append(", seu Peso: ");
		builder.append(dPeso);
		builder.append(", sua Idade: ");
		builder.append(iIdade);
		builder.append("");
		return builder.toString();
	}
	
}
