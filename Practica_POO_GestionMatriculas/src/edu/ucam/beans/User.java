package edu.ucam.beans;

import java.io.Serializable;

public abstract class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int numUser;
	private String dni;
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;

	private User() {
		User.numUser++;
	}

	public User(String dni, String nombre, String apellido, String direccion, int telefono) {
		this();
		this.dni = dni.toUpperCase();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;			
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public static int getNumUser() {
		return numUser;
	}
	
}
