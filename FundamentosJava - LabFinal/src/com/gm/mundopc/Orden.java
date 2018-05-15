package com.gm.mundopc;

import java.util.ArrayList;
import java.util.Iterator;

public class Orden {

    private final int idOrden;
    //Declaracion del arreglo de computadoras
    private ArrayList<Computadora> Computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    //Definimos el maximo elementos del arreglo
    private static final int maxComputadoras = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        //Se instancia el arreglo de computadoras
        Computadoras = new ArrayList<>();  //probar a quitar el valor Computadora
    }

    public void agregarComputadora(Computadora computadora) {
        Computadoras.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (Computadora computadora : Computadoras) {
			System.out.println(computadora);
		}
    }
    
    public void mostrarOrdenConIterator() {
    	System.out.println("\n\tEsto es con iterator");
    	Iterator<Computadora> computadora = Computadoras.iterator();
    	while (computadora.hasNext()) {
			System.out.println(computadora.next());
			
		}
    }
    
    public void mostrarOrdenConForSimple() {
		System.out.println("\n\tMostrar orden con For simple");
		for (int i = 0; i < Computadoras.size(); i++) {
			System.out.println(Computadoras.get(i));
		}
	}
}
