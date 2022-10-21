package ExerciosFormasGeometricas;

public class Cubo extends FormaGeometrica{
	
	public final static double TIPO_1 = 101.90;
	
	public final static double TIPO_2 = 212.45;
	
	public final static double TIPO_3 = 345.56;
	
	private double dRendimento;
	
	private double dLitros;
	
	private double dLatas;

	private double dPreco;
	
	private double dTipo;
	
	private final double RENDIMENTO_PADRAO = 1;
	
	Cubo(double dAresta, double dRendimento, double dTipo){
		dAreaBase	     = this.calculaArea(dAresta);
		dAreaTotal       = this.calculaAreaTotal(dAreaBase);
		dVolume 	     = this.calculaVolume(dAresta);
		dDiagonal        = this.calculaDiagonal(dAresta);
		this.dRendimento = this.trataRendimento(dRendimento);
		dLitros     	 = this.calculaLitros(dRendimento);
		dLatas           = this.calculaLatas(dLitros);
		dPreco           = this.calculaPreco(dLatas, dTipo);
		this.dTipo       = dTipo;
	}
	
	@Override
	public double calculaArea(double dAresta) {
		return dAresta * dAresta;
	}

	@Override
	public double calculaVolume(double dAresta) {
		return Math.pow(dAresta, 3);
	}

	@Override
	public double calculaDiagonal(double dAresta) {
		return dAresta * Math.sqrt(3);
	}
	
	public double calculaLitros(double dRendimento) {
		return this.dAreaBase/dRendimento;
	}
	
	public double calculaLatas(double dLitros) {
		return Math.ceil(dLitros/18);
	}
	
	public double calculaAreaTotal(double dArea) {
		return dArea*6;
	}
	
	public double calculaPreco(double dLatas, double dTipo) {
		return dLatas*dTipo;
	}
	
	
	public double getRendimento() {
		return dRendimento;
	}

	public void setRendimento(double dRendimento) {
		this.dRendimento = this.trataRendimento(dRendimento);
	}

	public double getLitros() {
		return dLitros;
	}

	public void setLitros(double dLitros) {
		this.dLitros = dLitros;
	}

	public double getLatas() {
		return dLatas;
	}

	public void setLatas(double dLatas) {
		this.dLatas = dLatas;
	}

	public double getPreco() {
		return dPreco;
	}

	public void setPreco(double dPreco) {
		this.dPreco = dPreco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aresta:\n");
		builder.append(dAresta);
		builder.append("\nRendimento:\n");
		builder.append(dRendimento);
		builder.append("\nTipo de Tinta:\n");
		builder.append(dTipo);
		builder.append("\n_________________\n");
		builder.append("\nArea da Base:\n");
		builder.append(dAreaBase);
		builder.append("\nArea Total:\n");
		builder.append(dAreaTotal);
		builder.append("\nVolume:\n");
		builder.append(dVolume);
		builder.append("\nDiagonal:\n");
		builder.append(dDiagonal);
		builder.append("\nLitros de Tinta:\n");
		builder.append(dLitros);
		builder.append("\nLatas de Tinta:\n");
		builder.append(dLatas);
		builder.append("\nPreco:\n");
		builder.append(dPreco);
		
		return builder.toString();
	}
	
	private double trataRendimento(double dRendimento) {
		return (dRendimento > 0) ? dRendimento : RENDIMENTO_PADRAO;
	}
	
}
