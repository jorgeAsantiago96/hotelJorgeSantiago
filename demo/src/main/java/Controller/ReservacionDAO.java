package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import database.Conexion;

public class ReservacionDAO {
	private Conexion database;
	private int numeroReservacion;
	private String usuarioRes;
	private int numHabR;
	private String fechaini;
	private String fechafin;
	
	public ReservacionDAO(int numeroReservacion, String usuarioRes, int numHabR, String fechaini, String fechafin) {
		super();
		this.numeroReservacion = numeroReservacion;
		this.usuarioRes = usuarioRes;
		this.numHabR = numHabR;
		this.fechaini = fechaini;
		this.fechafin = fechafin;
	}
	
	public ReservacionDAO() {
	}

	public int getNumeroReservacion() {
		return numeroReservacion;
	}

	public void setNumeroReservacion(int numeroReservacion) {
		this.numeroReservacion = numeroReservacion;
	}

	public String getUsuarioRes() {
		return usuarioRes;
	}

	public void setUsuarioRes(String usuarioRes) {
		this.usuarioRes = usuarioRes;
	}

	public int getNumHabR() {
		return numHabR;
	}

	public void setNumHabR(int numHabR) {
		this.numHabR = numHabR;
	}

	public String getFechaini() {
		return fechaini;
	}

	public void setFechaini(String fechaini) {
		this.fechaini = fechaini;
	}

	public String getFechafin() {
		return fechafin;
	}

	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}
	
	public boolean doReservacion() {
		boolean resultado = false;
		this.database = new Conexion();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO Reservacion (numeroReservacion, usuarioRes, numHabR, fechaini,fechafin) VALUES "
					+ "('"+this.numeroReservacion+"','"+this.usuarioRes+"','"+this.numHabR+"','"+this.fechaini+"','"+this.fechafin+"')");	
					try {
						this.database.connect().createStatement().execute("UPDATE Habitacion SET estado='Ocupada' WHERE numeroHab="+this.numHabR);
						resultado = true;
					} catch (SQLException e) {
						e.printStackTrace();
					}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean EliminarReservacion(String user, int n) {
		boolean resultado = false;
		this.database = new Conexion();
		String r="";
		int rn=0;
		int rnum=0;
		
		try
	    {
			String driver = "com.mysql.jdbc.Driver";
			String database =  "hotel1";
			String hostname = "localhost";
			String port = "3306";
			String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"";
			String username = "root";
			String password = "Pitusmaximus12.";
			Connection conn = DriverManager.getConnection(url, username, password);
			
			 String query = "select * from Reservacion where numeroReservacion= "+n+" AND usuarioRes= '"+user+"'";
		      java.sql.Statement st = this.database.connect().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      
		      while (rs.next())
		      {
		        r = rs.getString("usuarioRes");
		        rn = rs.getInt("numeroReservacion");
		        rnum = rs.getInt("numHabR");
		        
		        System.out.println(r);
		        System.out.println(rn);
		        System.out.println(rnum);
		      }
		      
			  if(r.equals(user) && rn == n){
				  System.out.println("dentro if inicio");
				  Connection connx = DriverManager.getConnection(url, username, password);
				  String query2 = "delete from Reservacion where usuarioRes= '"+user+"' AND numeroReservacion= "+n;
			      PreparedStatement preparedStmt = (PreparedStatement) connx.prepareStatement(query2);
			      preparedStmt.execute();
			      
			      try {
			    	  System.out.println("dentro if try");
			    	  this.database.connect().createStatement().execute("UPDATE Habitacion SET estado='libre' WHERE numeroHab="+rnum);
			    	  resultado=true;

			  	  } catch (SQLException e) {
					e.printStackTrace();
				  }
		    	  connx.close();
			  
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
	
}
