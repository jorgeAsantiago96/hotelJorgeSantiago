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
import org.example.hotel.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import Controller.ClienteDAO;
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
		  String contraseña = peticion.getContraseña();
		  
		  ClienteDAO cliente = new ClienteDAO();
		  String user = peticion.getUsuario();
		  String pass = peticion.getContraseña();
		    
		  if (cliente.Autenticacion(user, pass)) {
				respuesta.setTipousuario("El cliente "+user+" ha iniciado sesion correctamente");
			} else {
				respuesta.setTipousuario("No existe el cliente "+user);
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
				respuesta.setRespuesta("Se ha registrado al cliente en el sistema");
			} else {
				respuesta.setRespuesta("No se ha podido registrar al cliente "+cliente.getNombre()+" "+cliente.getApellido()+" en la base de datos");
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
}
