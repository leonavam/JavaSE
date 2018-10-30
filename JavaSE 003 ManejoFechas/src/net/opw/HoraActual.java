package net.opw;

import java.time.LocalTime;

public class HoraActual {

	public static void main(String[] args) {
		
		LocalTime hora = LocalTime.now();
		
		System.out.println(hora + " " + hora.getNano());
		
		//Add hours
		LocalTime nhora = hora.plusHours(5);
		System.out.println(nhora);

	}

}
