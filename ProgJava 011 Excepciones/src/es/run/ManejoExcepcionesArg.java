package es.run;

import es.code.Division;
import es.code.OperationException;

public class ManejoExcepcionesArg {
	
	public static void main(String[] args) throws OperationException{
		try {
			int op1 = Integer.parseInt(args[0]);
			int op2 = Integer.parseInt(args[1]);
			Division div =  new Division(op1, op2);
			System.out.println(div.dividir());
		}catch (ArrayIndexOutOfBoundsException aie) {
			System.out.print("Ocurrio una excepcion!!!");
			System.out.println("Hubo un error al acceder a un elemento fuera de rango");
			aie.printStackTrace();
		}catch (NumberFormatException nfe) {
			System.out.print("Ocurrio una excepcion!!!");
			System.out.println("Uno de los argumentos no es entero");
			nfe.printStackTrace();
		}catch (OperationException oe) {
			System.out.print("Ocurrio una excepcion!!!");
			System.out.println("Se trató de realizar una op errónea");
			oe.printStackTrace();
		}finally {
			System.out.println("\n\tSe terminaron de revisar las excepciones ");
		}
	}
}
