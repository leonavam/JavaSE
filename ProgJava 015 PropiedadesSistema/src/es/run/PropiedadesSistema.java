package es.run;

import java.util.Enumeration;
import java.util.Properties;

public class PropiedadesSistema {

	public static void main(String[] args) {
		
		Properties properties = System.getProperties();
		Enumeration<?> propiedades = properties.propertyNames();
		
		while(propiedades.hasMoreElements()) {
			String nombrePropiedad = (String) propiedades.nextElement();
			String valorPropiedad = properties.getProperty(nombrePropiedad);
			System.out.println("Llave: " + nombrePropiedad + " = " + valorPropiedad);
		}
	}

}
