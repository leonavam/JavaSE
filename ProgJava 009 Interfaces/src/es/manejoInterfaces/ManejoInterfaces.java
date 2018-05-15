package es.manejoInterfaces;

import es.datos.code.AccesoDatos;
import es.datos.code.ImplementacionMySql;
import es.datos.code.ImplementacionOracle;

public class ManejoInterfaces {
	
	public static void main(String[] args) {
		
		AccesoDatos datos = new ImplementacionOracle();
		ejecutar(datos, "listar");
		
		datos = new ImplementacionMySql();
		ejecutar(datos, "insertar");
		
	}

	private static void ejecutar(AccesoDatos dates, String action) {
		if("listar".equals(action))
			dates.listar();
		
		if("insertar".equals(action))
			dates.insertar();
		
	}
	
	
	

}
