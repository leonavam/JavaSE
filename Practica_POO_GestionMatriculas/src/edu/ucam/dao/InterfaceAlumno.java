package edu.ucam.dao;

import java.util.Hashtable;

import edu.ucam.beans.Alumno;

public interface InterfaceAlumno {

	public void createAlumno(String dni, String nombre, String apellido, String direccion, int telefono);
	public void addAlumno(Alumno alumno);
	public void updateAlumno(String dni);
	public void deleteAlumno(String dni);
	public Alumno getAlumno(String dni);
	public Hashtable<String, Alumno> getAllAlumnos();
	
}
