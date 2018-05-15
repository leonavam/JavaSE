package es.el.main;

import es.el.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("leo");
		Persona p2 = new Persona("leo");
		Persona p3 = new Persona("loo");
		Persona p4 = new Persona("ll");
		
		System.out.println("El numero de personas es " + Persona.getNumPersonas());
		
	}

}
