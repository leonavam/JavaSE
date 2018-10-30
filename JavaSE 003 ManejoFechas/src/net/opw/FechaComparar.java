package net.opw;

import java.time.LocalDate;

public class FechaComparar {

	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.of(2018, 10, 30);
		LocalDate hoy = LocalDate.now();
		
		if (fecha.equals(hoy))
			System.out.println("Fechas iguales");
		else
			System.out.println("Fechas diferentes!");
	}

}
