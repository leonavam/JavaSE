package es.el.peliculas.run;

import java.util.Scanner;

import es.el.peliculas.negocio.CatalogoPeliculas;
import es.el.peliculas.negocio.CatalogoPeliculasImplementacion;

public class LabFinal {
	private static int opcion = -1;
	private static final Scanner sc = new Scanner(System.in);
	private static final String nombreArchivo = "E:\\FilesJava\\catalogoPeliculas.txt";
	private static final CatalogoPeliculas CATALOGO_PELICULAS = new CatalogoPeliculasImplementacion();
	
	private static void mostrarMenu() {
		System.out.print("\nElija una opción:\n"
				+ "1.- Iniciar Catálogo Películas\n"
				+ "2.- Agregar Película\n"
				+ "3.- Listar Películas\n"
				+ "4.- Buscar Película\n"
				+ "5.- Borrar Archivo\n"
				+ "6.- Salir");
		System.out.print("\n\nElegir opción: ");
	}
	
	public static void main(String[] args) {
	
		while (opcion != 6) {
			try {
				mostrarMenu();
				opcion = Integer.parseInt(sc.nextLine());
				
				switch (opcion) {
				case 1:
					CATALOGO_PELICULAS.iniciarArchivo(nombreArchivo);
					break;
				case 2:
					CATALOGO_PELICULAS.agregarPelicula(null, nombreArchivo);
					break;
				case 3:
					CATALOGO_PELICULAS.listarPeliculas(nombreArchivo);
					break;
				case 4:
					System.out.print("Introduce el nombre de la pelicula a buscar: ");
					String buscar = sc.nextLine();
					CATALOGO_PELICULAS.buscar(nombreArchivo, buscar);
					break;
				case 5:
					CATALOGO_PELICULAS.borrar(nombreArchivo);
					break;
				case 6:
					System.out.println("Hasta luego!");
					break;
				default:
					System.out.println("ERROR: Inserte otra opción!");
					break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}



	

}
