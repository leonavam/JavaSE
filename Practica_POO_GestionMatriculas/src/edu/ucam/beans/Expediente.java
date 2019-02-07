package edu.ucam.beans;

import java.util.Enumeration;
import java.util.Hashtable;

public class Expediente {

	private static int numExpedientes;
	private String id;
	private Alumno alumno;
	private Hashtable<String, Asignatura> asignaturas;
	
	private Expediente() {
		Expediente.numExpedientes++;
	}
	
	public Expediente(Alumno alumno) {
		this();
		this.alumno = alumno;
		this.id = alumno.getDni();
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public Hashtable<String, Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Hashtable<String, Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public static int getNumExpedientes() {
		return numExpedientes;
	}

	public String getId() {
		return id;
	}

	public double getNumCreditosMatriculadas() {
		double creditos = 0;
		Enumeration<Asignatura> e = getAsignaturas().elements();
		Asignatura asignatura;
		while (e.hasMoreElements()) {
			asignatura = e.nextElement();
			creditos += asignatura.getCreditos();
		}
		
		return creditos;
	}
	
}
