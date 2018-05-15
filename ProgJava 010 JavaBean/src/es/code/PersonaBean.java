package es.code;

import java.io.Serializable;

public class PersonaBean implements Serializable{
	
	private String name;
	private int age;
	
	public PersonaBean() {
	}
	
	public PersonaBean(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
