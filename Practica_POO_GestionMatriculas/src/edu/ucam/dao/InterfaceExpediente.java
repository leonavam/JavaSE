package edu.ucam.dao;

import java.util.ArrayList;

import edu.ucam.beans.Alumno;
import edu.ucam.beans.Asignatura;
import edu.ucam.beans.Expediente;

public interface InterfaceExpediente {

	public void createExpediente(Alumno alumno);	// Es añadir expediente
	public void updateExpediente(String dni);		// 
	public void deleteExpediente(String dni);
	public Expediente getExpediente(String dni);
	
	public void matricularAsignatura(Alumno alumno, String asignatura);				//Add matricula a un expediente
	public ArrayList<Asignatura> getAsignaturasMatriculadas(Alumno alumno);
	
	public double closeExpediente(String dni);		//calculará su nota final del expediente
	
}
