package es.udemy.main;

import es.udemy.pasoPorReferencia.PasoPorReferencia;
import es.udemy.pasoPorValor.PasoPorValor;

public class Main {

	public static void main(String[] args) {
		
		PasoPorValor pValor = new PasoPorValor(50);
		
		PasoPorReferencia pRef = new PasoPorReferencia();
		pRef.setNombre("Leonel");
		System.out.println("Valor recibido " + pRef.getNombre());
		pRef.setNombre("Nuevo Nombre");
		System.out.println("Valor recibido " + pRef.getNombre());
		
	}

}
