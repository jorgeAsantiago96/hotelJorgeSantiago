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
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import Controller.ClienteDAO;


@Endpoint
public class EndPoint {
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="DisponibilidadRequest")
	 
	  @ResponsePayload
	  public DisponibilidadResponse getDisponibilidad ( @RequestPayload DisponibilidadRequest peticion) {
		 DisponibilidadResponse  respuesta = new DisponibilidadResponse();
		  boolean resp; 
		  String mensaje;
		  int numH = peticion.getNumHabitacion();
		  if(numH == 2 || numH == 3 || numH == 4 || numH == 6 || numH == 8 || numH == 9 || numH == 10) {
			  resp = false;
		  }else {
			  resp = true;
		  }
		  if(resp == true){
			  mensaje = "La habitacion esta disponible";
		  }else{
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
		  String mensaje = "Habitacion " + numH + " reservada exitosamente";
		  String cliente = peticion.getUsuarioCliente();
		  
		  int numero = (int) (Math.random() * 100) + 1;
		  respuesta.setResultadoReservacion(mensaje);
		  respuesta.setNumeroReservacion(numero);
		  respuesta.setResultadoCliente(cliente);
		  return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="EliminarReservacionRequest")
	 
	  @ResponsePayload
	  public EliminarReservacionResponse DeleteReservacion ( @RequestPayload EliminarReservacionRequest peticion) {
		 EliminarReservacionResponse  respuesta = new EliminarReservacionResponse();
		 int numR = peticion.getNumeroReservacion();
		  String cliente = peticion.getUsuarioCliente();
		 
		  String mensaje = "Reservacion numero " + numR + " del cliente: "+ cliente +" eliminada exitosamente";
		  
		  respuesta.setResultadoEliminarReservacion(mensaje);
		  return respuesta;
	  }
	 
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="AutenticacionRequest")
	 
	  @ResponsePayload
	  public AutenticacionResponse doAutenticacion ( @RequestPayload AutenticacionRequest peticion) {
		 AutenticacionResponse  respuesta = new AutenticacionResponse();
		  boolean resp; 
		  String tipousuario= "";
		  
		  String usuario = peticion.getUsuario();
		  String contraseña = peticion.getContraseña();
		  
		  if(usuario.equals("cliente") && contraseña.equals("cliente")){
			  tipousuario = "Bienvenido a iniciado sesion como Cliente";
		  }else {
			  if(usuario.equals("Personal") && contraseña.equals("Personal")){
				  tipousuario = "Bienvenido a iniciado sesion como personal";
			  }else {
				  tipousuario = "Datos ingresados incorrectos o el usuario no existe";  
			  }  
		  }		  
		  

		  
		  respuesta.setTipousuario(tipousuario);
		  return respuesta;
	  }
	 
	 @PayloadRoot(namespace="http://www.example.org/hotel", localPart="CrearClienteRequest")
	 
	  @ResponsePayload
	  public CrearClienteResponse CrearCliente ( @RequestPayload CrearClienteRequest peticion) {
		 CrearClienteResponse  respuesta = new CrearClienteResponse();
		  
		  String usuario = peticion.getUsuario();
		  String contraseña = peticion.getContraseña();
		  String nombre = peticion.getNombre();
		  String apellido = peticion.getApellido();
		  String correo = peticion.getCorreo();
		  String telefono = peticion.getTelefono();
		  
			 ClienteDAO cl = new ClienteDAO();
			
		   if(cl.registrarCliente(usuario, contraseña, nombre, apellido, correo, telefono)) {
			   respuesta.setRespuesta("usuario creado corectamente");
		   }else {
			   respuesta.setRespuesta("error al crear el usuario");
		   }
		   
		   
		  
		  return respuesta;
	  }
}
