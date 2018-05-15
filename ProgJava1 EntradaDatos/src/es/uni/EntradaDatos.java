package es.uni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {

	public static void main(String[] args) {
		
		String captura;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			System.out.print("introduce datos: ");
			captura = br.readLine();
			
			while (!("salir".equals(captura))) {
				System.out.println("Dato introducido: " + captura);
				captura = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Good bye!!!");

	}

}
