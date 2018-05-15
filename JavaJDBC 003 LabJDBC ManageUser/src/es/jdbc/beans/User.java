package es.jdbc.beans;

public class User {

	private int id_user;
	private String name;
	private String pass;
	
	public User(int id_user, String name, String pass) {
		this.id_user = id_user;
		this.name = name;
		this.pass = pass;
	}
	
	public int getId_user() {
		return id_user;
	}
	
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [" + id_user + ", name=" + name + ", pass=" + pass + "]";
	}
	
	
	
	
	
}
