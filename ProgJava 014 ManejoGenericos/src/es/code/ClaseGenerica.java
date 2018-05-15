package es.code;

public class ClaseGenerica <T>{
	
	T objeto;
	
	public ClaseGenerica(T objeto) {
		this.objeto = objeto;
	}

	public T getObjeto() {
		return objeto;
	}

	public void obtenerTipo() {
		System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
	}
	
	
}
