package es.code;

public class Triangulo extends FiguraGeometrica {

	public Triangulo() {
		
	}

	@Override
	public void crearFigura() {
		System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
		
	}

}
