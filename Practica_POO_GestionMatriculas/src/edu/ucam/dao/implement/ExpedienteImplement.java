package edu.ucam.dao.implement;

import java.util.ArrayList;

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
		
		expediente.getAsignaturas().add(Tablas.getAsignaturas().get(asignatura));	//Añade una asignatura al array del expediente
	}
	

	@Override
	public double closeExpediente(String dni) {
		double creditos = 0;
		Alumno alumno = Tablas.getAlumnos().get(dni);
		for (Asignatura a: getAsignaturasMatriculadas(alumno)) {
			if (a.getNota() > 4) {
				creditos += a.getCreditos();				
			}
		}
		
		return creditos;
	}

	public double getNotaFinal(Alumno alumno) {
		double nota = 0;
		Alumno al = Tablas.getAlumnos().get(alumno.getDni());
		for (Asignatura a: getAsignaturasMatriculadas(al)) {
			nota += a.getNota();
		}
		
		return nota/Tablas.getAsignaturas().size();
	}
	
}
