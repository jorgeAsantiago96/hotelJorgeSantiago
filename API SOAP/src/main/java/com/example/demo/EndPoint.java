package com.example.demo;

import org.example.hotel.DisponibilidadRequest;
import org.example.hotel.DisponibilidadResponse;
import org.example.hotel.ReservacionRequest;
import org.example.hotel.ReservacionResponse;
import org.example.hotel.EliminarReservacionRequest;
import org.example.hotel.EliminarReservacionResponse;
import org.example.hotel.AutenticacionRequest;
import org.example.hotel.AutenticacionResponse;
import org.example.hotel.CrearClienteRequest;
import org.example.hotel.CrearClienteResponse;

import java.util.ArrayList;

import org.example.hotel.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import Controller.ClienteDAO;
import Controller.CompraDAO;
import Controller.HabitacionDAO;
import Controller.ReservacionDAO;


@Endpoint
public class EndPoint {
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="DisponibilidadRequest")
	 
	  @ResponsePayload
	  public DisponibilidadResponse getDisponibilidad ( @RequestPayload DisponibilidadRequest peticion) {
		 DisponibilidadResponse  respuesta = new DisponibilidadResponse();
		  String mensaje = "";
		  int numero = peticion.getNumHabitacion();
		  
		  HabitacionDAO hab = new HabitacionDAO();
		  
			 if (hab.Disponibilidad(numero)) {
				  mensaje = "La habitacion esta disponible";
				} else {
				  mensaje = "La habitacion se encuentra ocupada";
				} 
		 
		  respuesta.setDisponibilidad(mensaje);
		  return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="ReservacionRequest")
	 
	  @ResponsePayload
	  public ReservacionResponse doReservacion ( @RequestPayload ReservacionRequest peticion) {
		 ReservacionResponse  respuesta = new ReservacionResponse();
		 
		  int numH = peticion.getNumHabitacion();
		  String cliente = peticion.getUsuarioCliente();
		  int numero = (int) (Math.random() * 100) + 1;
		  String fechaini = peticion.getFechaLLegada();
		  String fechafin = peticion.getFechaSalida();
		  
		  String mensaje= "";
		 
			 ReservacionDAO res = new ReservacionDAO(numero,cliente,numH, fechaini,fechafin);
			  
			 if (res.doReservacion()) {
				 mensaje = "Habitacion " + numH + " reservada exitosamente";
				 respuesta.setResultadoReservacion(mensaje);
				  respuesta.setNumeroReservacion(numero);
				  respuesta.setResultadoCliente(cliente);
				} else {
				 mensaje = "La habitacion no se pudo reservar";	
				 respuesta.setResultadoReservacion(mensaje);
				} 

		  return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="EliminarReservacionRequest")
	 
	  @ResponsePayload
	  public EliminarReservacionResponse DeleteReservacion ( @RequestPayload EliminarReservacionRequest peticion) {
		 EliminarReservacionResponse  respuesta = new EliminarReservacionResponse();
		 int numR = peticion.getNumeroReservacion();
		  String cliente = peticion.getUsuarioCliente();
		  
		  ReservacionDAO res = new ReservacionDAO();
			
		 	if (res.EliminarReservacion(cliente, numR)) {
		 		String mensaje = "Reservacion numero " + numR + " del cliente: "+ cliente +" eliminada exitosamente";
				  respuesta.setResultadoEliminarReservacion(mensaje);
			} else {
				String mensaje = "Error en eliminar la reservacion";
				 respuesta.setResultadoEliminarReservacion(mensaje);
			}		
		  
		  return respuesta;
	  }
	 
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="AutenticacionRequest")
	 
	  @ResponsePayload
	  public AutenticacionResponse doAutenticacion ( @RequestPayload AutenticacionRequest peticion) {
		 AutenticacionResponse  respuesta = new AutenticacionResponse();
		  
		  String usuario = peticion.getUsuario();
		  String contrasena = peticion.getContrasena();
		  
		  ClienteDAO cliente = new ClienteDAO();
		  String user = peticion.getUsuario();
		  String pass = peticion.getContrasena();
		  
		  System.out.println(user);
		  System.out.println(pass);
		  
		  if (cliente.Autenticacion(user, pass)) {
			  System.out.println(user);
			  System.out.println(pass);
			  System.out.println("gg");
			  //respuesta.setTipousuario("El cliente "+user+" ha iniciado sesion correctamente");
			  respuesta.setTipousuario("true");
		  } else {
			  System.out.println(user);
			  System.out.println(pass);
			  System.out.println("mal");
				//respuesta.setTipousuario("No existe el cliente "+user);
			  respuesta.setTipousuario("false");
		  }		
		
		  return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="CrearClienteRequest")
	 
	  @ResponsePayload
	  public CrearClienteResponse CrearCliente ( @RequestPayload CrearClienteRequest peticion) {
		 CrearClienteResponse  respuesta = new CrearClienteResponse();
		 
		 ClienteDAO cliente = new ClienteDAO(peticion.getUsuario(),peticion.getContraseña(), peticion.getNombre(), peticion.getApellido(), 
					peticion.getCorreo(), peticion.getTelefono());
		  
		 if (cliente.registrarCliente()) {
				respuesta.setRespuesta("true");
			} else {
				//respuesta.setRespuesta("No se ha podido registrar al cliente "+cliente.getNombre()+" "+cliente.getApellido()+" en la base de datos");
				respuesta.setRespuesta("false");
			}
			
			return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="EliminarClienteRequest")
	 
	  @ResponsePayload
	  public EliminarClienteResponse EliminarCliente ( @RequestPayload EliminarClienteRequest peticion) {
		 EliminarClienteResponse  respuesta = new EliminarClienteResponse();
		 
		 	ClienteDAO cliente = new ClienteDAO();
			String user = peticion.getUsuario();
		 	if (cliente.EliminarCliente(user)) {
				respuesta.setRespuesta("Se ha eliminado al cliente en el sistema");
			} else {
				respuesta.setRespuesta("No se ha podido eliminar al cliente "+peticion.getUsuario());
			}		
			
		 	return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="EditarClienteMostrarInfoRequest")
	 
	  @ResponsePayload
	  public EditarClienteMostrarInfoResponse EditarClienteMostrarInfo ( @RequestPayload EditarClienteMostrarInfoRequest peticion) {
		 EditarClienteMostrarInfoResponse  respuesta = new EditarClienteMostrarInfoResponse();
		 
		 	ClienteDAO cliente = new ClienteDAO();
			String user = peticion.getUsuario();
			
			respuesta.setMensaje("Error no se ha podido encontrar la informacion del usuario o este no existe");
			respuesta.setUsuarioR(" ");
		    respuesta.setContraseñaR(" ");
		    respuesta.setNombreR(" ");
		    respuesta.setApellidoR(" ");
		    respuesta.setCorreoR(" ");
		    respuesta.setTelefonoR(" ");
			
			cliente.GetCliente(user);
			if(cliente.getUsuario().equals(user)) {
				respuesta.setMensaje("Se ha encontrado la informacion del usuario");
			    respuesta.setUsuarioR(cliente.getUsuario());
			    respuesta.setContraseñaR(cliente.getContrasena());
			    respuesta.setNombreR(cliente.getNombre());
			    respuesta.setApellidoR(cliente.getApellido());
			    respuesta.setCorreoR(cliente.getCorreo());
			    respuesta.setTelefonoR(cliente.getTelefono());
			}
			
		 	return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="EditarClienteCambiarInfoRequest")
	 
	  @ResponsePayload
	  public EditarClienteCambiarInfoResponse EditarClienteCambiarInfo ( @RequestPayload EditarClienteCambiarInfoRequest peticion) {
		 EditarClienteCambiarInfoResponse  respuesta = new EditarClienteCambiarInfoResponse();
		 ClienteDAO cliente = new ClienteDAO();
				 
		 	String user = peticion.getUsuarioR();
		 	String pass = peticion.getContraseñaR();
		 	String nom = peticion.getNombreR();
		 	String ape = peticion.getApellidoR();
		 	String corr = peticion.getCorreoR();
		    String tel = peticion.getTelefonoR();
		 	
		    if(cliente.EditarCliente(user, pass, nom, ape, corr, tel)) {
		    	respuesta.setRespuesta("Los datos del usuario se han actualizado correctamente");
		    }else {
		    	respuesta.setRespuesta("Error no se han podido actualizar correctamente los datos del usuario");
		    }
		 
		 
		 	return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="CompraRequest")
	 
	  @ResponsePayload
	  public CompraResponse Compra ( @RequestPayload CompraRequest peticion) {
		 CompraResponse  respuesta = new CompraResponse();
		 ClienteDAO cliente = new ClienteDAO();
				 
		    int numeroCompra = (int) (Math.random() * 100) + 1;
		 	int num = peticion.getNumReservacionC();
		 	String fecha = peticion.getFechacompra();
		 	int monto = peticion.getMonto();
		 	
		 	CompraDAO compra = new CompraDAO(numeroCompra,num,fecha,monto);
		 		  
		 	if (compra.registrarCompra()) {
		 		respuesta.setRespuesta("Se ha registrado la compra correcctamente en el sistema");
			} else {
		 		respuesta.setRespuesta("No se ha podido registrar la compra en la base de datos");
		 	}
			 return respuesta;
	  }
	 
	 @PayloadRoot(localPart = "ObtenerListaReservacionesRequest", namespace = "http://www.example.org/hotel")
		
		@ResponsePayload
		public ObtenerListaReservacionesResponse getObtenerListaReservaciones (@RequestPayload ObtenerListaReservacionesRequest peticion) {
			ObtenerListaReservacionesResponse respuesta = new ObtenerListaReservacionesResponse();
			ReservacionDAO r = new ReservacionDAO();
			ArrayList<ObtenerListaReservacionesResponse.Reservacion> reservaciones = r.getListaReservaciones();
			
			if(reservaciones.size() != 0) {
				
				for (ObtenerListaReservacionesResponse.Reservacion reservacion : reservaciones) {
					respuesta.getReservacion().add(reservacion);
					System.out.println();
				}
				
			}
			
			return respuesta;
		}
	 
	 @PayloadRoot(localPart = "ObtenerListaHabitacionesRequest", namespace = "http://www.example.org/hotel")
		
		@ResponsePayload
		public ObtenerListaHabitacionesResponse getObtenerListaHabitaciones (@RequestPayload ObtenerListaHabitacionesRequest peticion) {
			ObtenerListaHabitacionesResponse respuesta = new ObtenerListaHabitacionesResponse();
			HabitacionDAO r = new HabitacionDAO();
			ArrayList<ObtenerListaHabitacionesResponse.Habitacion> habitaciones = r.getListaReservaciones();
			
			if(habitaciones.size() != 0) {
				
				for (ObtenerListaHabitacionesResponse.Habitacion habitacion : habitaciones) {
					respuesta.getHabitacion().add(habitacion);
					System.out.println();
				}
				
			}
			
			return respuesta;
		}
	 
}

