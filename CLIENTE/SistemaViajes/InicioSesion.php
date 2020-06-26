<?php 
//$client = new SoapClient("http://3.133.140.0:8080/ws/hotel.wsdl");
    include('providers\nusoap\lib\nusoap.php');
    $client = new nusoap_client('http://3.133.140.0:8080/ws/hotel.wsdl','wsdl'); 
    //$data = json_decode(file_get_contents('php://input'), true);
//if(isset($_GET['NumHabitacion']))
//{

$user = $_GET['Usuario'];
$parametros = array("Usuario" => $user, "Contrasena" => $_GET['Contraseña']);
//$response = $client->__soapCall('Autenticacion', array($parametros));
$response = $client->call("Autenticacion", array($parametros));

//print "<h1>" . $response->{'tipousuario'} . "</h1>";

//$respuesta = $response->{'tipousuario'};
$respuesta = $response['tipousuario'];

if($respuesta=="true"){
    header('Location: http://localhost/SistemaViajes/cliente.php?cliente=' . $user);
    
}else{
    print "Sesion Fallida";
    header('Location: http://localhost/SistemaViajes/login.php?fallida=""');
}
?>