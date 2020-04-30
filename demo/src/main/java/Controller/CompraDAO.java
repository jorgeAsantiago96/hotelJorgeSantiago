package Controller;

import java.sql.SQLException;

import database.Conexion;

public class CompraDAO {
	private Conexion database;
	private int numeroCompra;
	private int numReservacionC;
	private String fechacompra;
	private int monto;
	
	public CompraDAO(int numeroCompra, int numReservacionC, String fechacompra, int monto) {
		super();
		this.numeroCompra = numeroCompra;
		this.numReservacionC = numReservacionC;
		this.fechacompra = fechacompra;
		this.monto = monto;
	}
	
	public CompraDAO() {
	}

	public int getNumeroCompra() {
		return numeroCompra;
	}

	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public int getNumReservacionC() {
		return numReservacionC;
	}

	public void setNumReservacionC(int numReservacionC) {
		this.numReservacionC = numReservacionC;
	}

	public String getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(String fechacompra) {
		this.fechacompra = fechacompra;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	public boolean registrarCompra() {
		boolean resultado = false;
		String r="";
		this.database = new Conexion();
		
		try {
			this.database.connect().createStatement().execute("INSERT INTO Compras (numeroCompra, numReservacionC, fechacompra, monto) VALUES "
					+ "("+this.numeroCompra+","+this.numReservacionC+",'"+this.fechacompra+"',"+this.monto+")");
			resultado=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
}
