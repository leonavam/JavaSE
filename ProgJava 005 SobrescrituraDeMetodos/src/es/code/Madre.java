package es.code;

public class Madre {
	
	protected String name;
	protected int age;
	
	public Madre(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getDatos() {
		System.out.println("Nombre madre: " + name + "\nEdad madre: " + age);
	}

}
