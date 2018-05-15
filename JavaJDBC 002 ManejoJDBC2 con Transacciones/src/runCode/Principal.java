package runCode;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			connection = Conexion.getConection();
			if (connection.getAutoCommit()) {
				connection.setAutoCommit(false);
			}
			
			PersonaJDBC personaJDBC2 = new PersonaJDBC(connection);
			
			personaJDBC2.update(2, "Lsssel", "Navarrete");
			personaJDBC2.insert("ss", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM123456");
			
			
			connection.commit();
			
			
		} catch (SQLException e) {

			try {
				System.out.println("Hacemos rollback");
				e.printStackTrace(System.out);
				connection.rollback();
			}catch (SQLException e2) {
				System.out.println("Error con rollback");
				e2.printStackTrace();
			}
		}
		

	
		
		//personaJDBC.update(4, "Leonel", "Navarrete");
		//personaJDBC.delete(4);
		/*ArrayList<Persona> personas = personaJDBC.select();
		for (Persona persona : personas) {
			System.out.println(persona);
		}*/
	}

}
