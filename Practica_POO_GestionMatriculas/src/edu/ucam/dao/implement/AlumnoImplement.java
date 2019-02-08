package edu.ucam.dao.implement;

import java.util.Hashtable;

import edu.ucam.beans.Alumno;
import edu.ucam.dao.InterfaceAlumno;
import edu.ucam.dao.InterfaceExpediente;
import edu.ucam.tablas.Tablas;

public class AlumnoImplement implements InterfaceAlumno {
	
	private Alumno alumno;
	
	@Override
	public void createAlumno(String dni, String nombre, String apellido, String direccion, int telefono) {
		alumno = new Alumno(dni, nombre, apellido, direccion, telefono);
		addAlumno(alumno);
	}

	@Override
	public void addAlumno(Alumno alumno) {
		Tablas.getAlumnos().put(alumno.getDni(), alumno);
		Tablas.getUsuarios().put(alumno.getDni(), alumno);
		System.out.println("Alumn add to TableAlumns");
		
		InterfaceExpediente expediente = new ExpedienteImplement();
		expediente.createExpediente(alumno);
	}

	@Override
	public void updateAlumno(String dni) {
		alumno = Tablas.getAlumnos().get(dni);
		if (alumno != null) {
			// TODO
		}
		
	}

	@Override
	public void deleteAlumno(String dni) {
		Tablas.getAlumnos().remove(dni);
		Tablas.getUsuarios().remove(dni);
	}

	@Override
	public Alumno getAlumno(String dni) {
		alumno = Tablas.getAlumnos().get(dni);
		return alumno;
	}

	@Override
	public Hashtable<String, Alumno> getAllAlumnos() {
		return Tablas.getAlumnos();
	}

	

	
}
