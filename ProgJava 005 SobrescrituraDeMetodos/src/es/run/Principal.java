package es.run;

import es.code.Hija;
import es.code.Madre;

public class Principal {

	public static void main(String[] args) {
		
		Madre m = new Madre("Luz", 27);
		Hija h = new Hija("Luce", 20);
		/*
		m.getDatos();
		h.getDatos();
		*/
		Madre mm = new Madre("Leo", 23);
		mm.getDatos();
		
		mm = new Hija("LEITO", 23);
		mm.getDatos();
	}

}
