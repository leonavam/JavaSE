package es.casa.main;

import java.util.Date;

import es.casa.source.Cliente;
import es.casa.source.Empleado;
import es.casa.source.Persona;

public class Main {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado("leo",55,2500);
		emp.setDireccion("Valencia - Spain");
		emp.setGenero('M');
		Cliente clt = new Cliente("Lore",25,new Date(), true);
		clt.setDireccion("Murcia - Spain");
		clt.setEdad(23);
		clt.setGenero('F');
		clt.setNombre("Lore");
		
		Cliente clt2 = new Cliente("Ana",28,new Date(), false);
	
		System.out.println(emp);
		System.out.println(clt);
		System.out.println(clt2);
		System.out.println("Numero de personas: " + Persona.getNumPersonas());
		System.out.println("Numero de clientes: " + Cliente.getNumClientes());
		System.out.println("Numero de empleados: " + Empleado.getNumEmpleados());
	}

}
