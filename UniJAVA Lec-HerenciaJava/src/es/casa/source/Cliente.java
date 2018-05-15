package es.casa.source;

import java.util.Date;

public class Cliente extends Persona {

	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int numClientes;
	
	/*public Cliente(String nombre, Date fechaRegistro, boolean vip) {
		super(nombre);
		numClientes++;
		idCliente = numClientes;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}*/
	
	public Cliente(String nombre, int edad) {
		super(nombre, edad);
		numClientes++;
		idCliente = numClientes;
	}
	
	public Cliente(String nombre, int edad, Date fechaRegistro, boolean vip) {
		this(nombre, edad);
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public static int getNumClientes() {
		return numClientes;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "]";
	}
	
	

}
