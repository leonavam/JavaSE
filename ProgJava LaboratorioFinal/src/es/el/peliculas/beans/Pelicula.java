package es.el.peliculas.beans;

public class Pelicula {
	
	private String nombrePelicula;
	private static int idPelicula;

	private Pelicula() {
		idPelicula++;
	}
	
	public Pelicula(String nombrePelicula) {
		this();
		this.nombrePelicula = nombrePelicula;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	@Override
	public String toString() {
		return this.nombrePelicula;
	}
	
	
	
	
}
