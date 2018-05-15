package es.main;

import es.source.Empleado;
import es.source.Persona;
import static es.source.Empleado.getIdEmpleado;

public class principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Karla", 23);
		System.out.println(p1);

		Persona p2 = new Persona("Leo", 25);
		System.out.println(p2);
		
		Empleado e1 = new Empleado("LEo", 24, 2500);
		System.out.println(e1);
		
		Empleado e2 = new Empleado("Leo", 25, 2500);
		
		Persona p3 = new Persona("Karla", 23);
		System.out.println(p3);
		System.out.println("Personas " + Persona.getNumPerson());
		System.out.println("Empleados " + getIdEmpleado());
		
	}
}
