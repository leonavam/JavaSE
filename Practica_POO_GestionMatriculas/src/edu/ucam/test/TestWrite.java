package edu.ucam.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import edu.ucam.beans.Alumno;
import edu.ucam.tablas.Tablas;

public class TestWrite {

	public static void main(String[] args) {
		Tablas.getUsuarios();
		generateInformetTxt("000");
	}
	
	public static void generateInformetTxt(String dni) {
		
		FileWriter fileWriter;
		File file = new File("Informes/"+dni+".txt");
		Alumno alumno = Tablas.getAlumnos().get(dni);
		System.out.println(alumno);
		String str = "\t\tINFORME FINAL\n"+
				"DNI: "+ alumno.getDni() + "\nNombre: " +alumno.getNombre() + " " + alumno.getApellido() + 
				"\nDirección: " +alumno.getDireccion() + "\nTeléfono: " + alumno.getTelefono();
		String str2 = "\n\n*****************************************\n\nAsignaturas";
				
		try {
			fileWriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			
			bw.write(str);
			bw.write(str2);
			
			bw.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
