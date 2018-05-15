package es.uni;

import es.uni.code.ManejoArchivosMetodos;

public class CrearArchivo {
	
	public static void main(String[] args) {
	
		String NameFile = "E:\\FilesJava\\pruebaJava.txt";
		
		ManejoArchivosMetodos file = new ManejoArchivosMetodos();
		
		file.crearArchivo(NameFile);
		//file.escribeArchivo(NameFile);
		file.escribirEnArchivo(NameFile);
		/*file.escribirEnArchivo(NameFile);
		file.escribirEnArchivo(NameFile);*/
		file.leerDeArchivo(NameFile);
	}
	
}
