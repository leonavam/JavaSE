package introduccionjdbc;

import java.sql.*;

public class IntroduccionJDBC {

	public static void main(String[] args) {
	

			
		String url = "jdbc:mysql://localhost/javase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Creamos un objeto conexión
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");
			Statement statement = connection.createStatement();
			//Crear query
			String sql = "select id_persona, nombre, apellido from persona";
			ResultSet resultSet = statement.executeQuery(sql);
		
			System.out.println("id\tnombre\t\tapellido" );
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t\t" + resultSet.getString(3));
			}
			
			resultSet.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
		
}
