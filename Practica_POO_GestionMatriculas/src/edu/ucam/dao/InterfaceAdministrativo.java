package edu.ucam.dao;

import edu.ucam.beans.Administrativo;

public interface InterfaceAdministrativo {
	
	public void createAdministrativo(String dni, String nombre, String apellido, String direccion, int telefono, String password);
	public void addAdministrativo(Administrativo administrativo);
	public void deleteAdministrativo(String dni);
	public void updateAdministrativo(String dni);
	public Administrativo getAdministrativo(String dni); 
	
}
