package es.uni.code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivosMetodos {
	
	public void crearArchivo(String nombreArchivo) {
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
	
	public void escribirEnArchivo(String nombreArchivo) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, true));
			String c = "Hola desde el método escribir";
			pw.println(c);
			pw.println();
			pw.println("Fin desde método escribir");
			
			pw.close();
			
			System.out.println("Se ha escrito en el archivo: " + nombreArchivo + " !\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Mantiene el contenido anterior y escribe debajo
	public void leerDeArchivo(String nombreArchivo) {
		File f = new File(nombreArchivo);
		try {
			System.out.println("\tInicio lectura");
			BufferedReader br = new BufferedReader(new FileReader(f));
			String lectura;
			
			while ((lectura = br.readLine()) != null) {
				System.out.println(lectura);
			}
			
			br.close();
			
			System.out.println("\tFin lectura archivo!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Borra todo el contenido anterior
	public void escribeArchivo(String nombreArchivo) {
		File f = new File(nombreArchivo);
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			String in = "Hola Ainhoa";
			pw.println(in);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
