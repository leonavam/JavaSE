package es.code;

public class Gerente extends Empleado {
	
	private String department;

	public Gerente(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public String getDetalle() {
		return super.getDetalle() + ", Departamento: " + getDepartment();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
