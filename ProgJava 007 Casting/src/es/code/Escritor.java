package es.code;

public class Escritor extends Empleado {
	
	private TipoEscritura tipoEscritura;

	public Escritor(String name, double salary, TipoEscritura tipoEscritura) {
		super(name, salary);
		this.tipoEscritura = tipoEscritura;
	}

	public TipoEscritura getTipoEscritura() {
		return tipoEscritura;
	}

	public void setTipoEscritura(TipoEscritura tipoEscritura) {
		this.tipoEscritura = tipoEscritura;
	}
	
	public String getDetalle() {
		return super.getDetalle() + ", Tipo Escritura: " + tipoEscritura.getDescripcion();
	}

}
