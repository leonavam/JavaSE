package edu.ucam.dao.implement;

import java.util.Enumeration;
import java.util.Hashtable;

import edu.ucam.beans.Asignatura;
import edu.ucam.dao.InterfaceAsignatura;
import edu.ucam.enums.CursoEscolar;
import edu.ucam.enums.Semestre;
import edu.ucam.enums.TipoAsignatura;
import edu.ucam.tablas.Tablas;

public class AsignaturaImplement implements InterfaceAsignatura {
	
	private Asignatura asignatura;

	public AsignaturaImplement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAsignatura(String name, TipoAsignatura tipoAsignatura, double creditos, CursoEscolar cursoEscolar, Semestre semestre) {
		asignatura = new Asignatura(name, tipoAsignatura, creditos, cursoEscolar, semestre);
		addAsignatura(asignatura);
	}
	
	@Override
	public void addAsignatura(Asignatura asignatura) {
		Tablas.getAsignaturas().put(asignatura.getName(), asignatura);
	}

	@Override
	public void updateAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAsignatura(String str) {
		Tablas.getAsignaturas().remove(str);
	}

	@Override
	public Asignatura getAsignatura(String str) {
		asignatura = Tablas.getAsignaturas().get(str);
		return asignatura;
	}

	@Override
	public Hashtable<String,Asignatura> getAllAsignaturas() {
		
		// Para borrar
		Enumeration<Asignatura> e = Tablas.getAsignaturas().elements();
		while (e.hasMoreElements()) {
			Asignatura asignatura = (Asignatura) e.nextElement();
			System.out.println(asignatura.toString());
		}
		
		return Tablas.getAsignaturas();
	}

}
