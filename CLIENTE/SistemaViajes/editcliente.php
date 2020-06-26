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

				$client = new SoapClient("http://3.133.140.0:8080/ws/hotel.wsdl");
				$parametros = array("Usuario" => $user);
				$response = $client->__soapCall('EditarClienteMostrarInfo', array($parametros));

                $mensaje = $response->{'mensaje'};
                $userR = $response->{'UsuarioR'};
                $contraseñaR = $response->{'ContraseñaR'};
                $nombreR = $response->{'NombreR'};
                $apellidoR = $response->{'ApellidoR'};
                $correoR = $response->{'CorreoR'};
                $telefonoR = $response->{'TelefonoR'};
            }

            if(isset($_GET['EditCorrecto'])){
                $user = $_GET['cliente'];
                $message = "Datos del usuario cambiados correctamente";
                echo "<script type='text/javascript'>alert('$message');
                window.location.href = 'editcliente.php?cliente=$user';
                </script>";
			}

            if(isset($_GET['EditFallido'])){
                $user = $_GET['cliente'];
                $message = "Error al actualizar los datos del usuario";
                echo "<script type='text/javascript'>alert('$message');
                window.location.href = 'editcliente.php?cliente=$user';
                </script>";
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
								  <li><a href="elements.html">Editar informacion</a></li>
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
                            Edita la informacion de tu perfil				
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
		                        <h1 class="mb-10"></h1>
                                <form action="editClientCambiarInfo.php">
                                    <input type="text" value=<?php echo $userR ?> name="Usuario" style="Display: none">
									<div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-address-book" aria-hidden="true"></i></div>    
                                    <input type="text" id="name" name="Nombre" placeholder="Nombre(s)" onfocus="this.placeholder = ''" onblur="this.placeholder = 'First Name'" required class="single-input">
									</div>
									<div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-address-book" aria-hidden="true"></i></div>
										<input type="text" id="apellido" name="Apellido" placeholder="Apellidos" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Last Name'" required class="single-input">
									</div>
                                    <div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-key" aria-hidden="true"></i></div>
										<input type="text" id="contraseña" name="Contraseña" placeholder="Contraseña" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Last Name'" required class="single-input">
                                    </div>
                                    
									<div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-phone-square" aria-hidden="true"></i></div>
										<input type="text" id="telefono" name="Telefono" placeholder="Telefono" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email address'" required class="single-input">
									</div>
									<div class="input-group-icon mt-10">
                                    <div class="icon"><i class="fa fa-envelope" aria-hidden="true"></i></div>
										<input type="email" id="correo" name="Correo" placeholder="Correo" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email address'" required class="single-input">
                                    </div>
                                    <button type="submit" class="primary-btn text-uppercase" value="">Guardar cambios</button>
									</form>
		                    </div>
		                </div>
		            </div>




				</div>	
			</section>

			

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
			function load(){
			document.getElementById("name").value = <?php echo "'".$nombreR."'" ?>;
            document.getElementById("apellido").value = <?php echo "'".$apellidoR."'" ?>;
            document.getElementById("contraseña").value = <?php echo "'".$contraseñaR."'" ?>;
            document.getElementById("correo").value = <?php echo "'".$correoR."'" ?>;
            document.getElementById("telefono").value = <?php echo "'".$telefonoR."'" ?>;
			}
            window.onload = load;
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