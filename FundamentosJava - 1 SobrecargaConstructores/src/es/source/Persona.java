package es.source;

public class Persona {
	
	private int idPerson;
	private String name;
	private int age;
	private static int numPerson;
	
	private Persona() {
		numPerson++;
		idPerson = numPerson;
	}
	
	public Persona(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persona [idPerson=" + idPerson + ", name=" + name + ", age=" + age + "]";
	}

	public static int getNumPerson() {
		return numPerson;
	}
	
	

}
