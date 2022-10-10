package IntroducaoPOO;

public class PostoCombustivel {
	
	private String sTipoCombustivel;
	
	private double dValorLitro = 4.00;
	
	private double dValorAbastecimento = 4.00;
	
	private double dLitrosCombustivel = 0.00;
	
	private void setLitrosCombustivel(double dLitrosAbastecimento) {
		this.dLitrosCombustivel = dLitrosAbastecimento;
	}
	
	private void setValorAbastacimento(double dValorAbastecimento) {
		this.dValorAbastecimento = dValorAbastecimento;
	}
	
	public void abastecePorValor(double dValor) {
		setLitrosCombustivel(dValor/this.dValorLitro);
	}
	
	public void abastecerPorLitro(double dLitros) {
		setValorAbastacimento(dLitros*this.dValorLitro);
	}
	
	public void alteraValorLitro(double dValorNovos) {
		this.dValorLitro = dValorNovos;
	}
	
	public void alteraTipoCombustivel(String sTipoNovo) {
		this.sTipoCombustivel = sTipoNovo;
	}
}
