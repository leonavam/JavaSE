package es.el.peliculas.datos;

import java.util.ArrayList;
import es.el.peliculas.beans.Pelicula;

public interface AccesoDatos {
	
	public boolean isExiste(String nombreArchivo);
	public ArrayList<Pelicula> Peliculas(String nombreArchivo);
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);
	public String buscar(String nombreArchivo, String buscar);
	public void crear(String nombreArchivo);
	
	
}
