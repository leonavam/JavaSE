package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.Persona;

public class PersonaJDBC {
	
	//Para conexion
	private Connection connection;
	
	private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido) VALUES(?,?)";
	private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
	private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
	private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona ORDER BY id_persona";

	public PersonaJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonaJDBC(Connection connection) {
		this.connection = connection;
	}
	

	public int insert(String nombre, String apellido) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		int rows = 0;
		try {
			//Si this.connection es diferente de null se utiliza this,connection, la conexion que ha sido creado;
			//caso contrario se crea una nueva conexión con Conexion.getConection();
			//Se hace este precedimiento para poder hacer transacciones
			connection = (this.connection != null) ? this.connection : Conexion.getConection();
			
			preparedStatement = connection.prepareStatement(SQL_INSERT);
			int index = 1;
			preparedStatement.setString(index++, nombre);
			preparedStatement.setString(index++, apellido);
			System.out.println("Ejecutar query: " + SQL_INSERT);
			rows = preparedStatement.executeUpdate();
			System.out.println("Registros afectados " + rows);
		//} catch (SQLException e) {
			//e.printStackTrace();
		} finally {
			Conexion.close(resultSet);
			Conexion.close(preparedStatement);
			
			if(this.connection == null) {
				Conexion.close(connection);
			}
		}
		return rows;
	}

	public int update(int id, String nombre, String apellido) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;
		try {
			connection = (this.connection != null) ? this.connection : Conexion.getConection();
			
			System.out.println("Ejecutando query: " + SQL_UPDATE);
			preparedStatement = connection.prepareStatement(SQL_UPDATE);
			int index = 1;
			preparedStatement.setString(index++, nombre);
			preparedStatement.setString(index++, apellido);
			preparedStatement.setInt(index, id);
			rows = preparedStatement.executeUpdate();
			System.out.println("Registros actualizados: " + rows);

		//} catch (SQLException e) {
			//e.printStackTrace();
		} finally {
			Conexion.close(preparedStatement);
			if(this.connection == null) {
				Conexion.close(connection);
			}
		}

		return rows;
	}

	public int delete(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;
		try {
			connection = (this.connection != null) ? this.connection : Conexion.getConection();

			preparedStatement = connection.prepareStatement(SQL_DELETE);
			preparedStatement.setInt(1, id);
			rows = preparedStatement.executeUpdate();
			System.out.println("Registros eliminados: " + rows);
		//} catch (SQLException e) {
			//e.printStackTrace();
		}finally {
			Conexion.close(preparedStatement);
			if(this.connection == null)
				Conexion.close(connection);
		}
		return rows;
	}

	public ArrayList<Persona> select() throws SQLException{

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Persona persona = null;

		ArrayList<Persona> personas = new ArrayList<>();
		try {
			connection = (this.connection != null) ? this.connection : Conexion.getConection();
			
			preparedStatement = connection.prepareStatement(SQL_SELECT);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String nombre = resultSet.getString(2);
				String apellido = resultSet.getString(3);
				persona = new Persona(id, nombre, apellido);
				personas.add(persona);
			}

		//} catch (SQLException e) {
			//e.printStackTrace();
		} finally {
			Conexion.close(resultSet);
			Conexion.close(preparedStatement);
			
			if(this.connection == null)
				Conexion.close(connection);
		}

		return personas;
	}
}
