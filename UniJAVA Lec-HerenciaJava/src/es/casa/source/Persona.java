package es.casa.source;

public class Persona {
	
	private static int numPersonas;
	private String nombre;
	private char genero;
	private int edad;
	private String direccion;
	
	private Persona() {
		numPersonas++;
	}
	
	public Persona(String nombre) {
		this();
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad) {
		this();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public static int getNumPersonas() {
		return numPersonas;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	
	
}
