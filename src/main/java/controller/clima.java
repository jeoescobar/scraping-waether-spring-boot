package controller;

public class clima {
	public String indice_aire;
	public String calidad;
	public String contaminante;
	public String riesgo;
	public String estacion;
	
	public clima(String indice_aire, String calidad, String contaminante, String riesgo, String estacion) {
		super();
		this.indice_aire = indice_aire;
		this.calidad = calidad;
		this.contaminante = contaminante;
		this.riesgo = riesgo;
		this.estacion = estacion;
	}
	
	public clima() {
		
	}
	
	
	public String getIndice_aire() {
		return indice_aire;
	}

	public void setIndice_aire(String indice_aire) {
		this.indice_aire = indice_aire;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public String getContaminante() {
		return contaminante;
	}

	public void setContaminante(String contaminante) {
		this.contaminante = contaminante;
	}

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	
}
