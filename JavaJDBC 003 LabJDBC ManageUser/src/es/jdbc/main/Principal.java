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
		
		Hashtable<String, User> users =  userJDBC.select();
		
		Enumeration<User> enumeration = users.elements();
		Object val;
		while (enumeration.hasMoreElements()) {
			val = enumeration.nextElement();
			System.out.println(val);
		}
		
		

	}

}
