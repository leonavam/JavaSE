package net.opw;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TiempoDespues {

	public static void main(String[] args) {
		
		LocalDate nextWeek = LocalDate.now().plus(1, ChronoUnit.WEEKS);
		LocalDate hoy = LocalDate.now();
		System.out.println("Hoy es: " + hoy);
		System.out.println("La siguiente semana será: " + nextWeek);
		
		if (nextWeek.isAfter(hoy)) {
			System.out.println(nextWeek + " es posterior a " + hoy);
		}
		if (hoy.isBefore(nextWeek)) {
			System.out.println("hoy es antes que next");
		}
		
	}

}
