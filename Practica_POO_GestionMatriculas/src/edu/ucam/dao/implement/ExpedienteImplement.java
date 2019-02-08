package edu.ucam.dao.implement;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import edu.ucam.beans.Alumno;
import edu.ucam.beans.Asignatura;
import edu.ucam.beans.Expediente;
import edu.ucam.dao.InterfaceExpediente;
import edu.ucam.tablas.Tablas;

public class ExpedienteImplement implements InterfaceExpediente {
	
	private Expediente expediente;

	@Override
	public void createExpediente(Alumno alumno) {
		
		this.expediente = new Expediente(alumno);
		Tablas.getExpedientes().put(expediente.getId(), expediente);

	}

	@Override
	public void updateExpediente(String dni) {
		

	}

	@Override
	public void deleteExpediente(String dni) {
		Tablas.getExpedientes().remove(dni);
		Tablas.getAlumnos().remove(dni);
		Tablas.getUsuarios().remove(dni);
	}

	@Override
	public Expediente getExpediente(String dni) {
		expediente = Tablas.getExpedientes().get(dni);
		return expediente;
	}
	
	@Override
	public ArrayList<Asignatura> getAsignaturasMatriculadas(Alumno alumno){
		ArrayList<Asignatura> asignaturas = new ArrayList<>();
		
		Expediente expediente = Tablas.getExpedientes().get(alumno.getDni());
		
		asignaturas = expediente.getAsignaturas();
		
		return asignaturas; 
	}
	
	@Override
	public void matricularAsignatura(Alumno alumno, String asignatura) {
		Expediente expediente = Tablas.getExpedientes().get(alumno.getDni());
		
		expediente.getAsignaturas().add(Tablas.getAsignaturas().get(asignatura));
	}
	

	@Override
	public double closeExpediente(String dni) {
		
		return 0;
	}

}
