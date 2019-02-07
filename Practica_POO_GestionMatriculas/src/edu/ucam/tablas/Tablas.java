package edu.ucam.tablas;

import java.util.Enumeration;
import java.util.Hashtable;

import edu.ucam.beans.Administrativo;
import edu.ucam.beans.Alumno;
import edu.ucam.beans.Asignatura;
import edu.ucam.beans.Expediente;
import edu.ucam.beans.User;
import edu.ucam.enums.CursoEscolar;
import edu.ucam.enums.Semestre;
import edu.ucam.enums.TipoAsignatura;

public class Tablas {

	private static Hashtable<String, User> usuarios;
	private static Hashtable<String, Alumno> alumnos;
	private static Hashtable<String, Asignatura> asignaturas;
	private static Hashtable<String, Expediente> expedientes;

	public Tablas() {

	}

	public static Hashtable<String, User> getUsuarios() {
		if (usuarios == null) {
			usuarios = new Hashtable<>();
			
			loadDataUsers();
		}
		return usuarios;
	}

	public static Hashtable<String, Alumno> getAlumnos() {
		if (alumnos == null) {
			alumnos = new Hashtable<>();
			
			loadDataAlumnos();
		}
		return alumnos;
	}

	public static Hashtable<String, Asignatura> getAsignaturas() {
		if (asignaturas == null) {
			asignaturas = new Hashtable<>();
			
			loadDataAsignaturas();
		}
		return asignaturas;
	}

	public static Hashtable<String, Expediente> getExpedientes() {
		return expedientes;
	}

	private static void loadDataUsers() {
		getUsuarios().put("000", new Alumno("000", "erik", "Navarrete", "Los angeles 10", 652708716) );
		getUsuarios().put("111", new Alumno("111", "leonel", "Monetenegro", "La ñora 10", 000111223) );
		getUsuarios().put("ADMIN", new Administrativo("admin", "adminName", "adminSurname", "adminDir", 112233445, "admind") );
		getUsuarios().put("Y3235025C", new Alumno("Y3235025C", "miNombre", "miApellido", "miDireccion", 000111223) );
		
	}

	private static void loadDataAlumnos() {
		getAlumnos().put("000", new Alumno("000", "erik", "Navarrete", "Los angeles 10", 652708716) );
		getAlumnos().put("111", new Alumno("111", "leonel", "Monetenegro", "La ñora 10", 000111223) );
	}

	private static void loadDataAsignaturas() {
		getAsignaturas().put("PROGRAMACION I", new Asignatura("programacion i", TipoAsignatura.OBLIGATORIA, 3, CursoEscolar.PRIMERO, Semestre.PRIMERO));
		getAsignaturas().put("DAD II", new Asignatura("dad ii", TipoAsignatura.OBLIGATORIA, 4.5, CursoEscolar.TERCERO, Semestre.SEGUNDO));
	}

	public static double getCreditosTotales() {
		double totales = 0;
		
		Enumeration<Asignatura> e = Tablas.getAsignaturas().elements();
		Asignatura asignatura; 
		while (e.hasMoreElements()) {
			asignatura = (Asignatura) e.nextElement();
			totales += asignatura.getCreditos();
		}
		
		return totales;
	}
}
