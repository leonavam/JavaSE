package es.el.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import es.el.peliculas.beans.Pelicula;

public class AccesoDatosImplementacion implements AccesoDatos {

	@Override
	public boolean isExiste(String nombreArchivo) {
		File f = new File(nombreArchivo);
		return f.exists();
	}

	@Override
	public ArrayList<Pelicula> Peliculas(String nombreArchivo) {
		File f = new File(nombreArchivo);
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String lectura;
			
			while ((lectura = br.readLine()) != null) {
				Pelicula pelicula = new Pelicula(lectura);
				peliculas.add(pelicula);
			}

			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return peliculas;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
		File f = new File(nombreArchivo);
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(f, anexar));
			pw.println(pelicula.toString());
			pw.close();
			
			System.out.println("Se ha escrito " + pelicula.getNombrePelicula() +" en el archivo: " + nombreArchivo + " !\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String buscar(String nombreArchivo, String buscar) {
		File f = new File(nombreArchivo);
		String res = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String lectura;
			int i=1;
			while ((lectura = br.readLine()) != null) {
				if (lectura.equalsIgnoreCase(buscar)) {
					res = "Pelicula encontrada en la pos: " + i;
					break;
				}else
					res = "Pelicula no enontrada!";
				i++;
			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return res;
	}

	@Override
	public void crear(String nombreArchivo) {
		File f = new File(nombreArchivo);
		try {
			if(!(f.exists())) {
				PrintWriter pw = new PrintWriter(new FileWriter(f));
				pw.close();
				System.out.println("Archivo creado!!!\n");
			}else {
				System.out.println("El Archivo ya ha sido creado");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
