package ExerciosFormasGeometricas;

public abstract class FormaGeometrica {
	
	protected double dAresta;
	
	protected double dDiagonal;
	
	protected double dAreaBase;
	
	protected double dAreaTotal;
	
	protected double dVolume;
	
	protected abstract double calculaArea(double dAresta);
	
	protected abstract double calculaVolume(double dAresta);
	
	protected abstract double calculaDiagonal(double dAresta);

	protected double getAresta() {
		return dAresta;
	}

	protected void setAresta(double dAresta) {
		this.dAresta = dAresta;
	}

	protected double getDiagonal() {
		return dDiagonal;
	}

	protected void setDiagonal(double dDiagonal) {
		this.dDiagonal = dDiagonal;
	}

	protected double getArea() {
		return dAreaBase;
	}

	protected void setArea(double dArea) {
		this.dAreaBase = dArea;
	}

	protected double getVolume() {
		return dVolume;
	}

	protected void setVolume(double dVolume) {
		this.dVolume = dVolume;
	}
	
}
