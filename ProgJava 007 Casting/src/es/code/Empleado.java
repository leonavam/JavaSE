package es.code;

public class Empleado {
	
	protected String name;
	protected double salary;
	
	protected Empleado(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDetalle() {
		return "Nombre: " + getName() + ", Sueldo: " + getSalary();
	}

}
