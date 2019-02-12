package edu.ucam.beans;

public class Alumno extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int numAlumnos;
	private int id;
	
	public Alumno(String dni, String nombre, String apellido, String direccion, int telefono) {
		super(dni, nombre, apellido, direccion, telefono);
		Alumno.numAlumnos++;
		this.id = numAlumnos;
	}

	public int getId() {
		return id;
	}
	
	public static int getNumAlumnos() {
		return Alumno.numAlumnos;
	}
	
}
