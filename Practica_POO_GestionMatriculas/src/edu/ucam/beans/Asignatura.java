package edu.ucam.beans;


import edu.ucam.enums.Convocatoria;
import edu.ucam.enums.CursoEscolar;
import edu.ucam.enums.Semestre;
import edu.ucam.enums.TipoAsignatura;

public class Asignatura {
	
	private static int numAsignaturas;
	private int id;
	private String name;
	private TipoAsignatura tipoAsignatura;
	private double creditos;
	private CursoEscolar cursoEscolar;
	private Semestre semestre;
	private double nota;
	private Convocatoria convocatoria;
	private boolean seHaPresentado = false;
	
	private Asignatura() {
		Asignatura.numAsignaturas++;
		this.id = numAsignaturas;
	}

	public Asignatura(String name, TipoAsignatura tipoAsignatura, double creditos, CursoEscolar cursoEscolar, Semestre semestre) {
		this();
		this.name = name.toUpperCase();
		this.tipoAsignatura = tipoAsignatura;
		this.creditos = creditos;
		this.cursoEscolar = cursoEscolar;
		this.semestre = semestre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TipoAsignatura getTipoAsignatura() {
		return tipoAsignatura;
	}

	public void setTipoAsignatura(TipoAsignatura tipoAsignatura) {
		this.tipoAsignatura = tipoAsignatura;
	}

	public double getCreditos() {
		return creditos;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}

	public static int getNumAsignaturas() {
		return numAsignaturas;
	}

	public int getId() {
		return id;
	}	
	
	public CursoEscolar getCursoEscolar() {
		return cursoEscolar;
	}

	public void setCursoEscolar(CursoEscolar cursoEscolar) {
		this.cursoEscolar = cursoEscolar;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Convocatoria getConvocatoria() {
		return convocatoria;
	}

	public void setConvocatoria(Convocatoria convocatoria) {
		this.convocatoria = convocatoria;
	}

	public boolean seHaPresentado() {
		return seHaPresentado;
	}

	public void setSeHaPresentado() {
		this.seHaPresentado = true;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", name=" + name + ", tipoAsignatura=" + tipoAsignatura + ", creditos="
				+ creditos + ", cursoEscolar=" + cursoEscolar + ", semestre=" + semestre + ", nota=" + nota
				+ ", convocatoria=" + convocatoria + ", seHaPresentado=" + seHaPresentado + "]";
	}
	

	
	
	
}
