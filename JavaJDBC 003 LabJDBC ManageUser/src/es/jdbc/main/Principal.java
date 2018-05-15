package es.jdbc.main;

import java.util.Enumeration;
import java.util.Hashtable;

import es.jdbc.beans.User;
import es.jdbc.datos.UserJDBC;

public class Principal {

	public static void main(String[] args) {
		
		UserJDBC userJDBC = new UserJDBC();
		//userJDBC.insert("leonel", "12345");
		
		//userJDBC.update(1, "erik", "1234");
		//userJDBC.delete(2);
		
		userJDBC.select();
		
		Enumeration<User> enumeration = userJDBC.select().elements();
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		


	}

}
