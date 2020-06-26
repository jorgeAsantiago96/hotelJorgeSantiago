<?php 
$client = new SoapClient("http://localhost:8080/ws/hotel.wsdl");

//if(isset($_GET['NumHabitacion']))
//{

$user = $_GET['Usuario'];
$contraseña = $_GET['Contraseña'];
$nombre = $_GET['Nombre'];
$apellido = $_GET['Apellido'];
$coreo = $_GET['Correo'];
$telefono = $_GET['Telefono'];

$parametros = array("Usuario" => $user, "Contraseña" => $contraseña, "Nombre" => $nombre, "Apellido" => $apellido, "Correo" => $coreo, "Telefono" => $telefono);
$response = $client->__soapCall('CrearCliente', array($parametros));

print "<h1>" . $response->{'respuesta'} . "</h1>";

$respuesta = $response->{'respuesta'};


if($respuesta=="true"){
    header('Location: http://localhost/SistemaViajes/cliente.php?nuevo=' . $user);  
}else{
    header('Location: http://localhost/SistemaViajes/login.php?fallidoregistro=""');
}
?>