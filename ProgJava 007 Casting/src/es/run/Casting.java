package es.run;

import es.code.Empleado;
import es.code.Escritor;
import es.code.Gerente;
import es.code.TipoEscritura;

public class Casting {

	public static void main(String[] args) {
		
		Empleado empleado;
		
		empleado = new Escritor("Leonel", 2500, TipoEscritura.MODERNO);
		System.out.println(empleado.getDetalle());
		
		imprimirDetalles(empleado);
		//System.out.println(((Escritor) empleado).getTipoEscritura());
		
		empleado = new Gerente("Leo", 25, "Informatica");
		System.out.println(empleado.getDetalle());
		//System.out.println(((Gerente) empleado).getDepartment());
		
		imprimirDetalles(empleado);
		
		System.out.println(empleado.toString());
		
	}

	private static void imprimirDetalles(Empleado empleado) {
		
		if (empleado instanceof Escritor)
			System.out.println(((Escritor)empleado).getTipoEscritura());
		if (empleado instanceof Gerente)
			System.out.println(((Gerente)empleado).getDepartment());
	}

}
