package IntroducaoPOO;

public class Televisao {
	
	private int iVolumeMaximo = 50;
	
	private String sMarca;
	
	/**
	 * @dTamanho
	 * Polegadas
	 * Atributo será implementado para renderizar o tamanho da TV de maneira dinamica
	 */
	private double dTamanho;
	
	private int iVolume = 0;
	
	private int iCanal;
	
	public Televisao(String sMarca, double dTamanho, int iVolumeMaximo) {
		this.sMarca = sMarca;
		this.dTamanho = dTamanho;
		this.iVolumeMaximo = iVolumeMaximo;
	}
	
	public void setVolume(int iVolume) {
		this.iVolume = (iVolume <= this.iVolumeMaximo) ? iVolume : this.iVolume;
	}
	
	public void setCanal(int iCanal) {
		this.iCanal = iCanal;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(",-------------------,\n");
		builder.append("| ,---------------, |\n");
		builder.append("| |"+iCanal+"     | |\n");
		builder.append("| |               | |\n");
		builder.append("| |               | |\n");
		builder.append("| |               | |\n");
		builder.append("| |               | |\n");
		builder.append("| |_______________| |\n");
		builder.append("|_____"+sMarca+"____|\n");
		builder.append("`-------------------´\n");
		return builder.toString();
	}
	
}
