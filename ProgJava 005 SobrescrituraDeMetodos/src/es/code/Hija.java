package es.code;

public class Hija extends Madre {
	
	
	public Hija(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void getDatos() {
		System.out.println("Nombre hija: " + name +
				"\nEdad hija: " + age);
	} 
}
