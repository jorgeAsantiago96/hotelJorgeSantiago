<!DOCTYPE html>
	<html lang="zxx" class="no-js">
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Travel</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/jquery-ui.css">				
			<link rel="stylesheet" href="css/nice-select.css">							
			<link rel="stylesheet" href="css/animate.min.css">
			<link rel="stylesheet" href="css/owl.carousel.css">				
			<link rel="stylesheet" href="css/main.css">

			<?php 
			$ln = false;
            if(isset($_GET['cliente'])){
                $user = $_GET['cliente'];
                $saludo = "Bienvenido cliente " . $user;
            }

            if(isset($_GET['nuevo'])){
                $user = $_GET['nuevo'];
                $saludo = "Hola nuevo cliente " . $user;
			}
			
			if(isset($_GET['UsuarioCliente'], $_GET['NumHabitacion'], $_GET['NumDias'], $_GET['FechaLLegada'], $_GET['FechaSalida'])){
                $user = $_GET['UsuarioCliente'];
				$num = $_GET['NumHabitacion'];
				$dias = $_GET['NumDias'];
				$fechaL = $_GET['FechaLLegada'];
				$fechaS = $_GET['FechaSalida'];
				$saludo = "Bienvenido cliente " . $user;
				$ln = true;
				

				$client = new SoapClient("http://localhost:8080/ws/hotel.wsdl");
				$parametros = array("NumHabitacion" => $num, "UsuarioCliente" => $user, "NumDias" => $dias, "FechaLLegada" => $fechaL, "FechaSalida" => $fechaS);
				$response = $client->__soapCall('Reservacion', array($parametros));

				if($response->{'ResultadoCliente'} != ""){
					$mensaje = $response->{'ResultadoReservacion'};
					$rescliente = $response->{'ResultadoCliente'};
					$numreservacion = $response->{'NumeroReservacion'};
					$colorM = "background-color: green;";
					$res200 = true;
				}else{
					$mensaje = $response->{'ResultadoReservacion'};
					$colorM = "background-color: rgb(171, 10, 48);";
					$res200 = false;
				}


            }
            
            ?>


		</head>
		<body>	
			<header id="header">

				<div class="container main-menu">
					<div class="row align-items-center justify-content-between d-flex">
				      <div id="logo">
				        <a href="index.html"><img src="img/logo.png" alt="" title="" /></a>
				      </div>
				      <nav id="nav-menu-container">
				        <ul class="nav-menu">
				          <li><a href="index.html">Home</a></li>
				          <li><a href="hotels.html">Hotels</a></li>
				          <li class="menu-has-children"><a href=""><?php print $user ?></a>
				            <ul>
								  <li><a href="editcliente.php?cliente=<?php echo $user?>">Editar informacion</a></li>
				            	  <li><a href="login.php">Cerrar Sesion</a></li>
						          <!--<li class="menu-has-children"><a href="">Level 2 </a>
						            <ul>
						              <li><a href="#">Item One</a></li>
						              <li><a href="#">Item Two</a></li>
						            </ul>
						          </li>-->					                		
				            </ul>
				          </li>					          					          		          
				        </ul>
				      </nav><!-- #nav-menu-container -->					      		  
					</div>
				</div>
			</header><!-- #header -->
			  
			<!-- start banner Area -->
			<section class="about-banner relative">
				<div class="overlay overlay-bg"></div>
				<div class="container">				
					<div class="row d-flex align-items-center justify-content-center">
						<div class="about-content col-lg-12">
							<h1 class="text-white">
                            <?php print $saludo ?>				
							</h1>	
							<!--<p class="text-white link-nav"><a href="index.html">Home </a>  <span class="lnr lnr-arrow-right"></span>  <a href="hotels.html"> Hotels</a></p>-->
						</div>	
					</div>
				</div>
			</section>
			<!-- End banner Area -->	


			<section class="destinations-area section-gap">
				<div class="container">
		            <div class="row d-flex justify-content-center">
		                <div class="menu-content pb-40 col-lg-8">
		                    <div class="title text-center">
		                        <h1 class="mb-10">Ultimas Compras</h1>
		                        <p>Aun no has realizado ninguna compra</p>
		                    </div>
		                </div>
		            </div>

					<div class="row d-flex justify-content-center">
		                <div class="menu-content pb-40 col-lg-8">
		                    <div class="title text-center">
		                        <h1 class="mb-10">Habitaciones</h1>
		                        <p>Realiza tu reservacion de forma rapida y eficaz</p>
		                    </div>
		                </div>
		            </div>	



	<div class="row" style="margin-left: 0.75rem;">
	<?php 
	//$client = new SoapClient("http://3.133.140.0:8080/ws/hotel.wsdl");
	
	
	include('providers\nusoap\lib\nusoap.php');
    $client = new nusoap_client('http://3.133.140.0:8080/ws/hotel.wsdl','wsdl'); 
	$parametros = array();
	$response = $client->call("ObtenerListaHabitaciones", array($parametros));
		//$parametros = array("NumHabitacion" => $_GET['NumHabitacion']);
	//$response = $client->__soapCall('ObtenerListaHabitaciones', $parametros);

	//$respuesta = $response->{'habitacion'};
	$respuesta = $response['habitacion'];

	foreach ($respuesta as $key => $value) {
		//if($value->{'numeroHabitacion'}<5){
			if($value['numeroHabitacion']<5){
			$imagen = "img/elements/room1.jpg";
			$descripcion = "Habitacion sencilla con cama matrimonial, mesa de trabajo, television HD por cable, internet incluido, baño completo";
		}//else if($value->{'numeroHabitacion'}<10){
			else if($value['numeroHabitacion']<10){
			$imagen = "img/elements/room2.jpg";
			$descripcion = "Habitacion premium, disfruta de todos los lujos de la habitacion sencilla pero con un mayor espacio, una muy bonita vista y sofas incluidos";
		}else if($value['numeroHabitacion']>9){
			$imagen = "img/elements/room3.jpg";
			$descripcion = "Habitacion Deluxe, vive la mejor experiencia de confort, todas las virtudes anteriores pero con materiales de maxima de calidad, vista de lujo y terraza";
		}

		$idHab = $value['numeroHabitacion'];
		if($value['estado']=="libre"){
		?>
			<div class="card" style="width: 16rem; background-color: green; margin-left: 1rem; margin-top: 1rem;">
			<img src=<?php echo $imagen ?> class="card-img-top" alt="...">
			<div class="card-body">
			  <h5 class="card-title" style="margin-left: 0.5rem;"><?php echo "habitacion " . $value['numeroHabitacion'] ?></h5>
			  <p class="card-text" style="margin-left: 0.5rem; color:white;"><?php echo $descripcion ?></p>
			  <button class="btn btn-primary" style="margin-left: 3.5rem;" onclick="reservacion(<?php echo $idHab ?>)">Reservar</button>
			</div>
		  </div>

		<?php
		}else{
			?>
			<div class="card" style="width: 16rem; background-color: rgb(171, 10, 48); margin-left: 1rem; margin-top: 1rem;">
			<img src=<?php echo $imagen ?> class="card-img-top" alt="...">
			<div class="card-body">
			  <h5 class="card-title" style="margin-left: 0.5rem;"><?php echo "habitacion " . $value['numeroHabitacion'] ?></h5>
			  <p class="card-text" style="margin-left: 0.5rem; color:white;"><?php echo $descripcion ?></p>
			  <button class="btn btn-primary" style="margin-left: -0.4rem;" disabled>Habitacion no disponible</button>
			</div>
		  </div>

		<?php
		}
			}
		?>
		</div>

				</div>	
			</section>

		<div id="ReservarHab">
		<div class="card" style="width: 16rem; background-color: blue; margin-left: 1rem; margin-top: 1rem;">
			<div class="card-body">
			<span class='close' onclick="close()">x</span>
				<form action="cliente.php">
					<input type="number" class="form-control" name="NumHabitacionForm" id="NumHabitacionForm" disabled>
					<input type="text" class="form-control" name="UsuarioClienteForm" id="UsuarioClienteForm" style="margin-top: 1rem;" disabled>
					<input type="hidden" class="form-control" name="NumHabitacion" id="NumHabitacion">
					<input type="hidden" class="form-control" name="UsuarioCliente" id="UsuarioCliente" style="margin-top: 1rem;">
					<input type="number" class="form-control" name="NumDias" id="NumDias" style="margin-top: 1rem;">
					<input type="date" class="form-control" name="FechaLLegada" id="FechaLLegada" style="margin-top: 1rem;">
					<input type="date" class="form-control" name="FechaSalida" id="FechaSalida" style="margin-top: 1rem;">
					<button type="submit" class="btn btn-primary" style="margin-left: 3.5rem; margin-top: 1rem;">Reservar</button>
				</form>
			</div>
		</div>
		</div>


<?php 
if($ln==true){
	if($res200==true){
?>
		<div id="mensaje">
		<div class="card" style="width: 16rem; background-color:" <?php echo $colorM. " " . "margin-left: 1rem; margin-top: 1rem;"?>>
			<div class="card-body">
			  <h5 class="card-title" style="margin-left: 0.5rem;"><?php echo $mensaje ?></h5>
			  <p class="card-text" style="margin-left: 0.5rem; color:white;"><?php echo $rescliente ?></p>
			  <p class="card-text" style="margin-left: 0.5rem; color:white;"><?php echo $numreservacion ?></p>
			  <button class="btn btn-primary" style="margin-left: 3.5rem;" onclick="cerrar()">Cerrar</button>
			</div>
		</div>
		</div>
<?php 
	}
}
?>
			

			<!-- Start destinations Area -->

			<!-- End destinations Area -->
			

			<!-- Start home-about Area -->

			<!-- End home-about Area -->

			<!-- start footer Area -->		
            <footer class="footer-area section-gap">
		<div class="container">

			<div class="row footer-bottom d-flex justify-content-between align-items-center">
				<p class="col-lg-8 col-sm-12 footer-text m-0">
					<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					Copyright &copy;
					<script>document.write(new Date().getFullYear());</script> All rights reserved | <i
						class="fa fa-heart-o" aria-hidden="true"></i> by <a href="#" target="_blank">Jorge Alberto
						Santiago Hernandez</a>
					<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
				</p>
				<div class="col-lg-4 col-sm-12 footer-social">
					<a href="#"><i class="fa fa-facebook"></i></a>
					<a href="#"><i class="fa fa-twitter"></i></a>
					<a href="#"><i class="fa fa-dribbble"></i></a>
					<a href="#"><i class="fa fa-behance"></i></a>
				</div>
			</div>
		</div>
	</footer>
			<!-- End footer Area -->	

			<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="js/popper.min.js"></script>
			<script src="js/vendor/bootstrap.min.js"></script>			
			<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>		
 			<script src="js/jquery-ui.js"></script>					
  			<script src="js/easing.min.js"></script>			
			<script src="js/hoverIntent.js"></script>
			<script src="js/superfish.min.js"></script>	
			<script src="js/jquery.ajaxchimp.min.js"></script>
			<script src="js/jquery.magnific-popup.min.js"></script>						
			<script src="js/jquery.nice-select.min.js"></script>					
			<script src="js/owl.carousel.min.js"></script>							
			<script src="js/mail-script.js"></script>	
			<script src="js/main.js"></script>	


			<script>
			function reservacion(x){
			document.getElementById("NumHabitacionForm").value = x;
			document.getElementById("UsuarioClienteForm").value = <?php echo "'".$user."'" ?>;

			document.getElementById("NumHabitacion").value = x;
			document.getElementById("UsuarioCliente").value = <?php echo "'".$user."'" ?>;
			document.getElementById("ReservarHab").style.display = "block";
			}

			function doReservacion(){
			 var user =	document.getElementById("UsuarioCliente").value;
			 var hab =	document.getElementById("NumHabitacion").value;
			 var dias =	document.getElementById("NumDias").value;
			 var fechaL =	document.getElementById("FechaLLegada").value;
			 var fechaC =	document.getElementById("FechaSalida").value;
			 
			}

			function cerrar(){
			 document.getElementById("mensaje").style.display = "none";
			 document.getElementById("ReservarHab").style.display = "none";
			 
			 }

			 function close(){
			 document.getElementById("ReservarHab").style.display = "none";
			 
			 }


			//document.getElementById('semestre').onchange = function() {
			//var x = document.getElementById("semestre").value;

			//if (x == 'F-J') {
			//	document.getElementById("mes1").style.display = "block";
			//	document.getElementById("mes2").style.display = "none";
			//}

			//if (x == 'A-E') {
			//	
			//	document.getElementById("mes2").style.display = "inline";
			//}


			//}
			</script>

            <style>
		.section-gap {
        padding: 0;
		}

		.footer-area {
    background: #04091e;
    padding-top: 0; 
        }

		.main-menu {
    padding-bottom: 10px;
    padding-top: 10px;
    background: rgba(255, 255, 255, 0.15);
    padding-left: 20px;
    padding-right: 20px;
	margin-top: 10px;
}

#ReservarHab{
	display: none;
    position: absolute;
    top: 45%;
    left: 45%;
    margin-top: -50px;
    margin-left: -50px;
    width: 100px;
    height: 100px;
}​

.close {
    float:right;
    display:inline-block;
    padding:2px 5px;
    background:#ccc;
}

#close:hover {
    float:right;
    display:inline-block;
    padding:2px 5px;
    background:#ccc;
    color:red;
}


	</style>
		</body>
	</html>