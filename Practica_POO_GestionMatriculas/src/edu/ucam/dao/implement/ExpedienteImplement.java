package edu.ucam.dao.implement;

import edu.ucam.beans.Alumno;
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
		// TODO Auto-generated method stub

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
	public double closeExpediente(String dni) {
		
		return 0;
	}

}
