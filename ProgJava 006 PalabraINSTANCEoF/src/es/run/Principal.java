package es.run;

import es.code.Circulo;
import es.code.Elipse;
import es.code.FiguraGeometrica;
import es.code.Rectangulo;
import es.code.Triangulo;

public class Principal {

	public static void main(String[] args) {
		
		FiguraGeometrica figura;
		figura = new Elipse();
		
		
		dimeTipoFigura(figura);
		System.out.println("Todos los tipos son: ");
		todosLosTipos(figura);
		
		System.out.println("\n\n\tDesde aqui con abstract");
		figura.crearFigura();
		
		figura = new Rectangulo();
		figura.crearFigura();
		

	}
	
	private static void dimeTipoFigura(FiguraGeometrica form) {
		if (form instanceof Elipse) System.out.println("Soy un elipse");
		else if (form instanceof Circulo) System.out.println("Soy un círculo");
		else if (form instanceof Triangulo) System.out.println("Soy un triángulo");
		else if (form instanceof Rectangulo) System.out.println("Soy un rectángulo");
		else if (form instanceof FiguraGeometrica) System.out.println("Soy una figura geométrica");
		else if (form instanceof Object) System.out.println("Soy un objeto");
		else System.out.println("No se encontró ningún tipo");
	}
	
	public static void todosLosTipos(FiguraGeometrica form) {
		if (form instanceof Elipse) System.out.println("Soy un elipse");
		if (form instanceof Circulo) System.out.println("Soy un círculo");
		if (form instanceof Triangulo) System.out.println("Soy un triángulo");
		if (form instanceof Rectangulo) System.out.println("Soy un rectángulo");
		if (form instanceof FiguraGeometrica) System.out.println("Soy una figura geométrica");
		if (form instanceof Object) System.out.println("Soy un objeto");
		else System.out.println("No se encontró ningún tipo");
		
	}

}
