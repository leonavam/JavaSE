package edu.ucam.beans;

import java.util.ArrayList;

public class Expediente {

	private static int numExpedientes;
	private String id;
	private Alumno alumno;
	private ArrayList<Asignatura> asignaturas;
	
	private Expediente() {
		Expediente.numExpedientes++;
	}
	
	public Expediente(Alumno alumno) {
		this();
		this.alumno = alumno;
		this.id = alumno.getDni();
		this.asignaturas = new ArrayList<>();
		System.out.println("Expediente " + id + " creado");
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public static int getNumExpedientes() {
		return numExpedientes;
	}

	public String getId() {
		return id;
	}

	public double getNumCreditosMatriculados() {
		double creditos = 0;
		
		for (Asignatura asignatura : asignaturas) {
			creditos += asignatura.getCreditos();
		}
		
		return creditos;
	}
	
}
