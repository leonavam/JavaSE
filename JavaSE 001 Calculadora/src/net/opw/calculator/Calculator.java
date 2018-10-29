package net.opw.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double n1, n2;
		int op = 1;

		Scanner sc = new Scanner(System.in);

		while (op != 0) {

			System.out.println("***** CALCULADORA *****");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("0. Salir del programa");
			System.out.print("Introduzca una opción válida: ");

			op = sc.nextInt();
			if (op < 0 || op > 5) {
				System.out.println("Inserte una opcion valida!!");
			} else if (op != 0) {

				System.out.println("Inserte 2 numeros:");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();

				switch (op) {
				case 1:
					System.out.println(suma(n1, n2));
					break;
				case 2:
					System.out.println(resta(n1, n2));
					break;
				case 3:
					System.out.println(mult(n1, n2));
					break;
				case 4:
					System.out.println(div(n1, n2));
					break;
				case 5:
					System.out.println(resta(n1, n2));
					break;
				default:
					System.out.println("Hasta la próxima");
					break;
				}
			}

		}
		sc.close();

	}

	private static double div(double n1, double n2) {
		return n1 / n2;
	}

	private static double mult(double n1, double n2) {
		return n1 * n2;
	}

	private static double resta(double n1, double n2) {
		return n1 - n2;
	}

	private static double suma(double n1, double n2) {
		return n1 + n2;
	}

}
