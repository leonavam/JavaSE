package net.opw;

import java.time.LocalDate;
import java.time.Month;

public class FechaActual {

	public static void main(String[] args) {
		
		LocalDate hoy = LocalDate.now();
		System.out.println("Fecha Actual: " + hoy);
		
		int year = hoy.getYear();
		Month month = hoy.getMonth();
		int mes = hoy.getMonthValue();
		int day = hoy.getDayOfMonth();
		System.out.println(month.toString() + year + mes + day);

	}

}
