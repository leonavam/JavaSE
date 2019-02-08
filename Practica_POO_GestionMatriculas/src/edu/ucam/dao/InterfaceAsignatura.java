package edu.ucam.dao;

import java.util.ArrayList;
import java.util.Hashtable;

import edu.ucam.beans.Asignatura;
import edu.ucam.enums.CursoEscolar;
import edu.ucam.enums.Semestre;
import edu.ucam.enums.TipoAsignatura;

public interface InterfaceAsignatura {

	public void createAsignatura(String name, TipoAsignatura tipoAsignatura, double creditos, CursoEscolar cursoEscolar, Semestre semestre);
	public void addAsignatura(Asignatura asignatura);
	public void updateAsignatura(Asignatura asignatura);
	public void deleteAsignatura(String str);
	public Asignatura getAsignatura(String str);
	public Hashtable<String,Asignatura> getAllAsignaturas();
	
	public ArrayList<Asignatura> getOnlyAsignaturas();
	
	public double getCreditos();
	
}
