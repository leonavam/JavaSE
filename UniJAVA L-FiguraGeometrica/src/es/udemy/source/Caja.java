package es.udemy.source;

import java.util.Scanner;

public class Caja {
	
	private int ancho;
	private int alto;
	private int profundo;
	
	public Caja() {
		
	}
	
	public Caja(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
	}
	
	public double CalculaVolumen() {
		
		double vol = ancho * alto * profundo;
		return vol;
	}
	
	public void CrearCaja() {
		Scanner in = new Scanner(System.in);
		System.out.println("Alto: ");
		setAlto(in.nextInt());
		System.out.println("Ancho: ");
		setAncho(in.nextInt());
		System.out.println("Profundidad: ");
		setProfundo(in.nextInt());
		
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void setProfundo(int profundo) {
		this.profundo = profundo;
	}

}
