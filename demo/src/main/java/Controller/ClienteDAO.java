package Controller;
import java.sql.ResultSet;
import database.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import Model.Cliente;


public class ClienteDAO {
	
	
	private Conexion database;
	private String usuario;
	private String contrasena;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	
	public ClienteDAO() {
	}
	

	public ClienteDAO(String usuario, String contrasena, String nombre, String apellido, String correo,
			String telefono) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	public boolean registrarCliente() {
		boolean resultado = false;
		String r="";
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute("INSERT INTO Cliente (usuario, contrasena, nombre, apellido,correo,telefono) VALUES "
					+ "('"+this.usuario+"','"+this.contrasena+"','"+this.nombre+"','"+this.apellido+"','"+this.correo+"','"+this.telefono+"')");
			resultado=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	

	public boolean EliminarCliente(String user) {
		boolean resultado = false;
		this.database = new Conexion();
		String r="";
		
		try
	    {
			String driver = "com.mysql.jdbc.Driver";
			String database =  "hotel1";
			String hostname = "3.133.140.0";
			String port = "3306";
			String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"";
			String username = "hotel1";
			String password = "Pitusmaximus12.";
			Connection conn = DriverManager.getConnection(url, username, password);
			
			
			 String query = "select usuario from Cliente where usuario= '"+user+"'";
		      java.sql.Statement st = this.database.connect().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      
		      while (rs.next())
		      {
		        r = rs.getString("usuario");
		      }
		      
			  if(r.equals(user)){
				  String query2 = "delete from Cliente where usuario= '"+user+"'";
			      PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query2);
			      preparedStmt.execute();
			      resultado=true;
			  }
	   
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		
		return resultado;
	}
	
	public boolean Autenticacion(String usuario, String pass) {
		boolean resultado = false;
		this.database = new Conexion();
		String r="";
		String rp="";
		
		try
	    {
		   
	      String query = "select * from Cliente where usuario= '"+usuario+"' AND contrasena='"+pass+"'";
	      java.sql.Statement st = this.database.connect().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      
	      while (rs.next())
	      {
	        r = rs.getString("usuario");
	        rp = rs.getString("contrasena");
	      }
	      
		  if(r.equals(usuario) && rp.equals(pass)){
			  resultado=true;
		  }
	      
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		
		return resultado;
	}

	
}
