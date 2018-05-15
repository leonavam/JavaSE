package es.run;

import java.util.Scanner;

import es.code.CodeCalc;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		String op,out = "salir";
		do {
			System.out.println("Inserte operación a realizar: ");
			op = sc.nextLine().toLowerCase();
			if(op.equals(out)) break;
			System.out.println("Inserta numero: ");
			a = sc.nextInt();
			System.out.println("Inserta numero: ");
			b = sc.nextInt();
			
			CodeCalc calc = new CodeCalc(a, b);
			if(calc.calcula(op) != null)
				System.out.println("\tRespuesta " + calc.calcula(op));
			else 
				System.out.println("\tInténtalo otra vez!!!");
			sc.nextLine(); //limpiar buffer
		}while(!(op.equals(out)));
		System.out.println("\n\tHasta la próxima!!!");
	}

}
