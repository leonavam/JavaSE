package es.venta.source;

public class Producto {
	
	private int idProducto;
	private String name;
	private double precio;
	private static int numProductos;
	
	private Producto() {
		numProductos++;
		idProducto = numProductos;
	}
	
	public Producto(String name, double precio) {
		this();
		this.name = name;
		this.precio = precio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public static int getNumProductos() {
		return numProductos;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", name=" + name + ", precio=" + precio + "]";
	}
	

	
	
}
