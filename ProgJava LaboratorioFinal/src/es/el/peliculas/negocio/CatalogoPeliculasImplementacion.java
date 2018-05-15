package es.el.peliculas.negocio;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import es.el.peliculas.beans.Pelicula;
import es.el.peliculas.datos.AccesoDatos;
import es.el.peliculas.datos.AccesoDatosImplementacion;

public class CatalogoPeliculasImplementacion implements CatalogoPeliculas{
	
	AccesoDatos datos = new AccesoDatosImplementacion();

	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		Scanner sc = new Scanner(System.in);
		try {
			if (datos.isExiste(nombreArchivo)) {
				System.out.print("Inserte nombre de pelicula para añadir: ");
				String nombrePelicula1 = sc.nextLine();
				datos.escribir(new Pelicula(nombrePelicula1), nombreArchivo, true);
				
			}else
				System.out.println("El archivo no ha sido creado!, Inicie Catálogo");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
                                                                                                                                                                                                                                                                                              
	@Override
	public void listarPeliculas(String nombreArchivo) {
		ArrayList<Pelicula> peliculas = datos.Peliculas(nombreArchivo);
		for (Pelicula pelicula : peliculas) {
			System.out.println("Pelicula: " + pelicula);
		}
	}

	@Override
	public void buscar(String nombreArchivo, String buscar) {
		String res = datos.buscar(nombreArchivo, buscar);
		System.out.println(res);
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		datos.isExiste(nombreArchivo);
		datos.crear(nombreArchivo);
	}

	@Override
	public void borrar(String nombrearchivo) {
		File f = new File(nombrearchivo);
			f.delete();
		System.out.println("Archivo borrado!");
		
	}
	
	

	
	
}
