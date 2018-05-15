package es.el.peliculas.negocio;

public interface CatalogoPeliculas {
	
	public void agregarPelicula(String nombrePelicula, String nombreArchivo);
	public void listarPeliculas(String nombreArchivo);
	public void buscar(String nombreArchivo, String buscar);
	public void iniciarArchivo(String nombreArchivo);
	public void borrar(String nombrearchivo);
	

}
