package es.run;

import es.code.PersonaBean;

public class ManejoJavaBeans {

		public static void main(String[] args) {
			
			PersonaBean p = new PersonaBean();
			p.setName("Leo");
			p.setAge(23);
			
			System.out.println("Nombre: " + p.getName() + "\tEdad: " + p.getAge());
			
			
		}	
}
