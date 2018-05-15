package es.code;

public class Rectangulo extends FiguraGeometrica {

	public Rectangulo() {
		
	}

	@Override
	public void crearFigura() {
		System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
		
	}

}
