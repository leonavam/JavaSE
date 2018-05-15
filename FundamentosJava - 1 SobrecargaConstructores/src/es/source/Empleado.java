package es.source;

public class Empleado extends Persona {

	private double sueldo;
	private static int idEmpleado;
	
	public Empleado(String name, int age, double sueldo) {
		super(name, age);
		this.sueldo = sueldo;
		idEmpleado++;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public static int getIdEmpleado() {
		return idEmpleado;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [sueldo=" + sueldo + "]";
	}

	
}
