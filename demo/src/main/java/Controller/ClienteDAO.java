package Controller;
import java.sql.ResultSet;
import database.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Model.Cliente;


public class ClienteDAO {
	 private Conexion conn;
	 
	 public void setConnection() {
	        conn = new Conexion();
	    }
	    
	    public void closeConnection() {
	        conn.close();
	    }
	
	public boolean registrarCliente(String usuario, String contrasena, String nombre, String apellido, String correo, String telefono) {
		boolean resultado = false;
		
			String query = "INSERT INTO Cliente(usuario,contrasena,nombre,apellido,correo,telefono) VALUES('%s','%s','%s','%s','%s','%s')";
	        query = String.format(query, usuario, contrasena, nombre, apellido, correo, telefono);
	        if(conn.execute(query).equals(true)){
	        	resultado = true;
	        }
	        closeConnection();
		return resultado;
	}
}
