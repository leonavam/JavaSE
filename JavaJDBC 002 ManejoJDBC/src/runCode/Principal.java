package runCode;

import java.util.ArrayList;

import datos.PersonaJDBC;
import domain.Persona;

public class Principal {

	public static void main(String[] args) {
		
		PersonaJDBC personaJDBC = new PersonaJDBC();
		personaJDBC.insert("ss", "MMMM");
		
		//personaJDBC.update(4, "Leonel", "Navarrete");
		//personaJDBC.delete(4);
		ArrayList<Persona> personas = personaJDBC.select();
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
