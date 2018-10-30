package net.opw;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class FechasPeriodos {

	public static void main(String[] args) {
		
		LocalDate antes = LocalDate.of(2015, Month.JUNE, 25);
		LocalDate hoy = LocalDate.now().plus(2, ChronoUnit.MONTHS);
		
		Period period = Period.between(antes, hoy);
		System.out.println(period.toTotalMonths());

	}

}
