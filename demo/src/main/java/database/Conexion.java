package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Conexion {

	Connection conn = null;

	String driver = "com.mysql.jdbc.Driver";
	String database =  "hotel1";
	String hostname = "3.133.140.0";
	String port = "3306";
	String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"";
	String username = "hotel1";
	String password = "Pitusmaximus12.";
	
	public Connection connect() {
		
		try {
			this.conn = DriverManager.getConnection(this.url,this.username,this.password);
		} catch (SQLException e) {
			System.out.println("Conexion Fallida!:\n" + e.getMessage());
		}

		if (conn != null) {
			System.out.println("Conexion establecida");
		} else {
			System.out.println("No se pudo establecer conexion");
		
		}
		
		return this.conn;
		
	}
}