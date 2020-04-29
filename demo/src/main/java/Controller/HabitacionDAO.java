package Controller;
import java.sql.ResultSet;
import database.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;


public class HabitacionDAO {
	private Conexion database;
	private String numeroHab;
	private String estado;
	
	public HabitacionDAO(String numeroHab, String estado) {
		super();
		this.numeroHab = numeroHab;
		this.estado = estado;
	}
	

	public HabitacionDAO() {

	}


	public String getNumeroHab() {
		return numeroHab;
	}

	public void setNumeroHab(String numeroHab) {
		this.numeroHab = numeroHab;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	public boolean Disponibilidad(int n) {
		boolean resultado = false;
		this.database = new Conexion();
		String r="";
		
		try
	    {
		   
	      String query = "select estado from Habitacion where numeroHab= "+n+"";
	      java.sql.Statement st = this.database.connect().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      
	      while (rs.next())
	      {
	        r = rs.getString("estado");
	      }
	      
		  if(r.equals("libre")){
			  resultado=true;
			  System.out.println(r);
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
