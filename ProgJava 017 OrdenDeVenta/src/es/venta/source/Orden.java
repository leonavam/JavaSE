package es.venta.source;

import java.util.ArrayList;

public class Orden {

	private int idOrden;
	private static int numOrdenes;
	ArrayList<Producto> Productos;
	
	public Orden() {
		numOrdenes++;
		idOrden = numOrdenes;
		
		Productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		Productos.add(producto);
	}
	
	private double calcularTotal() {
		double total = 0;
		
		for (int i = 0; i < Productos.size(); i++) {
			total += Productos.get(i).getPrecio();
		}
		
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("Numero de orden: " + idOrden);
		for (int i = 0; i < Productos.size(); i++) {
			System.out.println(Productos.get(i));
		}
		System.out.println("Total de la orden: " + calcularTotal());
	}
}
