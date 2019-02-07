package edu.ucam.dao.implement;

import edu.ucam.beans.Administrativo;
import edu.ucam.dao.InterfaceAdministrativo;
import edu.ucam.tablas.Tablas;

public class AdministrativoImplement implements InterfaceAdministrativo {

	private Administrativo administrativo;
	
	public void createAdministrativo(String dni, String nombre, String apellido, String direccion, int telefono, String password) {
		administrativo = new Administrativo(dni, nombre, apellido, direccion, telefono, password);
		
		addAdministrativo(administrativo);
	}
	
	@Override
	public void addAdministrativo(Administrativo administrativo) {
		Tablas.getUsuarios().put(administrativo.getDni(), administrativo);
	}

	@Override
	public void deleteAdministrativo(String dni) {
		Tablas.getUsuarios().remove(dni);

	}

	@Override
	public void updateAdministrativo(String dni) {
		// TODO Auto-generated method stub

	}

	@Override
	public Administrativo getAdministrativo(String dni) {
		administrativo = (Administrativo) Tablas.getUsuarios().get(dni);
		return administrativo;
	}

}
