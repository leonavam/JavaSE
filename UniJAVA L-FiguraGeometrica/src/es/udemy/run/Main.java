package es.udemy.run;

import es.udemy.source.Caja;

public class Main {

	public static void main(String[] args) {
		
		Caja caja = new Caja(3,2,6);
		
		Caja caja2 = new Caja();
		caja2.CrearCaja();
		System.out.println("Caja2 " + caja2.CalculaVolumen());
		
		System.out.println("El volumen de la caja es: " + caja.CalculaVolumen());
		
	}

}
