package es.run;

import es.code.ClaseGenerica;

public class MainGenerics {

	public static void main(String[] args) {
		
		ClaseGenerica <Integer> objetoInt = new ClaseGenerica<Integer>(100);
		objetoInt.obtenerTipo();
		
		ClaseGenerica <String> objStr = new ClaseGenerica<String>("HolaLeo");
		objStr.obtenerTipo();
		System.out.println(objStr.getObjeto());

	}

}
