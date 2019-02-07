package edu.ucam.enums;

public enum TipoAsignatura {
	
	BÁSICA("BA"),
	OBLIGATORIA("OB"),
	OPTATIVA("OP");
	
	
	private final String abreviatura;
	
	private TipoAsignatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getAbreviatura() {
		return abreviatura;
	}
	
}
