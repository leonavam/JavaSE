package es.venta.orden;

import es.venta.source.Orden;
import es.venta.source.Producto;

public class Venta {

	public static void main(String[] args) {
		
		Producto casa = new Producto("Casa", 2500);
		Producto coche = new Producto("Coche", 3000);
		Producto jardin = new Producto("Jardin", 1500);
		
		Orden orden = new Orden();
		orden.agregarProducto(casa);
		orden.agregarProducto(coche);
		orden.agregarProducto(jardin);
		orden.agregarProducto(casa);
		orden.mostrarOrden();
		
		Orden orden2 = new Orden();
		orden2.agregarProducto(casa);
		orden2.agregarProducto(coche);
		orden2.agregarProducto(jardin);
		orden2.agregarProducto(casa);
		orden2.mostrarOrden();

	}

}
