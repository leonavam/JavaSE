package edu.ucam.beans;

public class Administrativo extends User {
	
	private static int numAdministrativos;
	private int id;
	private String password;

	public Administrativo(String dni, String nombre, String apellido, String direccion, int telefono, String password) {
		super(dni, nombre, apellido, direccion, telefono);
		
		Administrativo.numAdministrativos++;
		this.id = numAdministrativos;
		this.password = password;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static int getNumAdministrativos() {
		return numAdministrativos;
	}

	public int getId() {
		return id;
	}
	
	
	

	

}
