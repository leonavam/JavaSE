package net.opw;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;

public class FechasEventos {

	public static void main(String[] args) {

		LocalDate nacimiento = LocalDate.of(1995, 1, 5);
		MonthDay diaNacimiento = MonthDay.of(nacimiento.getMonthValue(), nacimiento.getDayOfMonth());
		MonthDay diaMesHoy = MonthDay.from(LocalDate.now());
		YearMonth yearMes = YearMonth.of(1990, 9);
		
		System.out.println(nacimiento);
		System.out.println(diaNacimiento);
		System.out.println(diaMesHoy);
		System.out.println(yearMes);

	}

}
