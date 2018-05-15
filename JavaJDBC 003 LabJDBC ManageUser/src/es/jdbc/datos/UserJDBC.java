package es.jdbc.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Hashtable;

import es.jdbc.beans.User;

public class UserJDBC {
	
	 private final String SQL_INSERT = "INSERT INTO user(user, pass) VALUES(?,?)";
	 private final String SQL_UPDATE = "UPDATE user SET user=?, pass=? WHERE id_user=?";
	 private final String SQL_DELETE = "DELETE FROM user WHERE id_user= ?";
	 private final String SQL_SELECT = "SELECT * FROM user ORDER BY id_user";
	 
	 Connection connection = null;
	 PreparedStatement preparedStatement = null;
	 ResultSet resultSet = null;

	 public int insert(String user, String pass) {
		 int rows = 0;
		 
		 try {
			 connection = Conexion.getconnection();
			 preparedStatement = connection.prepareStatement(SQL_INSERT);
			 int index = 1;
			 preparedStatement.setString(index++, user);
			 preparedStatement.setString(index, pass);
			 
			 System.out.println("Ejecutar query: " + SQL_INSERT);
			 rows = preparedStatement.executeUpdate();
			 System.out.println("Filas insertadas: " + rows);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Conexion.close(preparedStatement);
			Conexion.close(connection);
		}
		 return rows;
	 }
	 
	 public int update(int id, String user, String pass) {
		 int rows = 0;
		 
		 try {
			 connection = Conexion.getconnection();
			 preparedStatement = connection.prepareStatement(SQL_UPDATE);
			 int index = 1;
			 preparedStatement.setString(index++, user);
			 preparedStatement.setString(index++, pass);
			 preparedStatement.setInt(index, id);
			 
			 System.out.println("Ejecutar query: " + SQL_UPDATE);
			 rows = preparedStatement.executeUpdate();
			 System.out.println("Filas actualizadas: " + rows);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Conexion.close(preparedStatement);
			Conexion.close(connection);
		}
		 return rows;
	 }
	 
	 public int delete(int id) {
		 int rows = 0;
		 
		 try {
			 connection = Conexion.getconnection();
			 preparedStatement = connection.prepareStatement(SQL_DELETE);
			 preparedStatement.setInt(1, id);
			 System.out.println("Ejecutar query: " + SQL_DELETE);
			 rows = preparedStatement.executeUpdate();
			 System.out.println("Se han borrado: " + rows + " registros");
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return rows;
	 }
	 
	 public Hashtable<Integer, User> select() {
		 
		 Hashtable<Integer, User> users = new Hashtable<>();
		 
		 try {
			 connection = Conexion.getconnection();
			 preparedStatement = connection.prepareStatement(SQL_SELECT);
			 resultSet = preparedStatement.executeQuery();
			
			 while(resultSet.next()) {
				 int id = resultSet.getInt(1);
				 String user = resultSet.getString(2);
				 String pass = resultSet.getString(3);
				 int index = 0;
				 
				 users.put(index++, new User(id, user, pass));
			 }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Conexion.close(resultSet);
			Conexion.close(preparedStatement);
			Conexion.close(connection);
		}
		 
		return users;
		 
	 }

}
