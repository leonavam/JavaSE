package es.code;

public class Circulo extends FiguraGeometrica {

	public Circulo() {
		
	}

	@Override
	public void crearFigura() {
		System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
		
	}

}
