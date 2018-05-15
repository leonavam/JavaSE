package es.udemy.pasoPorValor;

public class PasoPorValor {
	
	private int n;
	
	public PasoPorValor(int n) {
		this.n = n;
		imprimir(n);
		cambiarValor(n);
		imprimir(n);
	}

	private void cambiarValor(int n2) {
		n2 = 100;
	}

	private void imprimir(int n2) {
		System.out.println("Paso por Valor: " + n2);
	}
}
