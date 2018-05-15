package es.el;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Persona {
	
	private int idPersona;
	private String name;
	private String apellido;
	private boolean borrado;
	private static int numPersonas;
	
	
	public Persona(String name) {
		numPersonas++;
		idPersona = numPersonas;
		this.name = name;
	}
	
	public Persona(String name, String apellido, boolean borrado) {
		numPersonas++;
		idPersona = numPersonas;
		
		this.name = name;
		this.apellido = apellido;
		this.borrado = borrado;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isBorrado() {
		return borrado;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
	public static int getNumPersonas() {
		return numPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", name=" + name + ", apellido=" + apellido + ", borrado=" + borrado
				+ "]";
	}


	
}
