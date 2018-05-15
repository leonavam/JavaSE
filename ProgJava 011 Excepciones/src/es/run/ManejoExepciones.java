package es.run;

import es.code.Division;
import es.code.OperationException;

public class ManejoExepciones {

	public static void main(String[] args) {
		
		try {
			Division d = new Division(5, 0);
			System.out.println(d.dividir());
		} catch (OperationException oe) {
			System.out.println("Ocurrió un error!!!");
			oe.printStackTrace();
		}
	}

}
