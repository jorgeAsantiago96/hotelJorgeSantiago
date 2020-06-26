<?php 
$client = new SoapClient("http://3.133.140.0:8080/ws/hotel.wsdl");

$user = $_GET['Usuario'];
$contraseña = $_GET['Contraseña'];
$nombre = $_GET['Nombre'];
$apellido = $_GET['Apellido'];
$coreo = $_GET['Correo'];
$telefono = $_GET['Telefono'];

$parametros = array("UsuarioR" => $user, "ContraseñaR" => $contraseña, "NombreR" => $nombre, "ApellidoR" => $apellido, "CorreoR" => $coreo, "TelefonoR" => $telefono);
$response = $client->__soapCall('EditarClienteCambiarInfo', array($parametros));

print "<h1>" . $response->{'Respuesta'} . "</h1>";

$respuesta = $response->{'Respuesta'};

if($respuesta=="Los datos del usuario se han actualizado correctamente"){
    header('Location: http://localhost/SistemaViajes/editcliente.php?EditCorrecto=""&cliente='.$user);  
}else{
    header('Location: http://localhost/SistemaViajes/editcliente.php?EditFallido=""&cliente='.$user);
}
?>