package domain;

public class Persona {

	private int id_persona;
	private String nombre;
	private String apellido;
	
	
	public Persona(int id, String name, String lastname) {
		this.id_persona = id;
		this.nombre = name;
		this.apellido = lastname;
	}
	
	public int getId_persona() {
		return id_persona;
	}
	
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id_persona + "\tnombre=" + nombre + "\tapellido=" + apellido + "]";
	}
	
	
	
}
