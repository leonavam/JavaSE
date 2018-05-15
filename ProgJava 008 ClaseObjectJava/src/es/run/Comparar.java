package es.run;

import es.code.Persona;

public class Comparar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Leo", 2500);
		Persona p2 = new Persona("Leo", 25);
		
		if (p1.equals(p2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}
