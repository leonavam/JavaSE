package es.casa.source;

public class Empleado extends Persona {

	private int idEmpleado;
	private double sueldo;
	private static int numEmpleados;
	
	public Empleado(String nombre, double sueldo) {
		super(nombre);
		numEmpleados++;
		this.idEmpleado = numEmpleados;
		this.sueldo = sueldo;
	}
	
	public Empleado(String nombre, int edad, double sueldo ) {
		super(nombre,edad);
		numEmpleados++;
		this.idEmpleado = numEmpleados;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public static int getNumEmpleados() {
		return numEmpleados;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
}
