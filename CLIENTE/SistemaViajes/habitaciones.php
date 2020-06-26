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
</head>

<body>
	<header id="header">
		<div class="container main-menu">
			<div class="row align-items-center justify-content-between d-flex">
				<div id="logo">
					<a href="index.html"><img src="img/logo.png" alt="" title=""/></a>
				</div>
				<nav id="nav-menu-container">
					<ul class="nav-menu">
						<li><a href="index.php">Inicio</a></li>
						<!--<li><a href="index.html">Home</a></li>
							<li class="menu-has-children"><a href="">Pages</a>
								<ul>
									<li><a href="elements.html">Elements</a></li>
									<li class="menu-has-children"><a href="">Level 2 </a>
										<ul>
											<li><a href="#">Item One</a></li>
											<li><a href="#">Item Two</a></li>
										</ul>
									</li>
								</ul>
							</li>-->
					</ul>
				</nav><!-- #nav-menu-container -->
			</div>
		</div>
	</header><!-- #header -->

	<!-- start banner Area -->
	<section class="banner-area relative">
		<div class="overlay overlay-bg"></div>
		<div class="container">
			<div class="row fullscreen align-items-center justify-content-between">
				<div class="col-lg-6 col-md-6 banner-left">
					<h6 class="text-white">Toma un descanso de tu vida rutinaria</h6>
					<h1 class="text-white">Travel Ready</h1>
					<p class="text-white">
						If you are looking at blank cassettes on the web, you may be very confused at the difference in
						price. You may see some for as low as $.17 each.
					</p>
					<a href="#" class="primary-btn text-uppercase">Get Started</a>
				</div>
				<div class="col-lg-4 col-md-6 banner-right">
					<ul class="nav nav-tabs" id="myTab" role="tablist">
						<li class="nav-item">
							<a class="nav-link active" id="flight-tab" data-toggle="tab" href="#flight" role="tab"
								aria-controls="flight" aria-selected="true">Iniciar Sesion</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" id="hotel-tab" data-toggle="tab" href="#hotel" role="tab"
								aria-controls="hotel" aria-selected="false">Registrarse</a>
						</li>
					</ul>
					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade show active" id="flight" role="tabpanel" aria-labelledby="flight-tab">
							<form class="form-wrap">
								<input type="text" class="form-control" name="name" placeholder="Usuario "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Usuario '">
								<input type="text" class="form-control" name="to" placeholder="Contraseña "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Contraseña '">
								<a href="#" class="primary-btn text-uppercase">Entrar</a>
							</form>
						</div>
						<div class="tab-pane fade" id="hotel" role="tabpanel" aria-labelledby="hotel-tab">
							<form class="form-wrap">
								<input type="text" class="form-control" name="name" placeholder="Origen "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Origen '">
								<input type="text" class="form-control" name="to" placeholder="Destino "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Destino '">
								<input type="text" class="form-control date-picker" name="start" placeholder="Fecha Salida "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Fecha Salida '">
								<input type="text" class="form-control date-picker" name="return" placeholder="Fecha Retorno "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Fecha Retorno '">
								<input type="number" min="1" max="20" class="form-control" name="adults"
									placeholder="Personas " onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Personas '">
								<input type="number" min="1" max="20" class="form-control" name="child"
									placeholder="Habitaciones " onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Habitaciones '">
								<a href="#" class="primary-btn text-uppercase">Registrarse</a>
							</form>
						</div>
						<div class="tab-pane fade" id="holiday" role="tabpanel" aria-labelledby="holiday-tab">
							<form class="form-wrap">
								<input type="text" class="form-control" name="name" placeholder="From "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'From '">
								<input type="text" class="form-control" name="to" placeholder="To "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'To '">
								<input type="text" class="form-control date-picker" name="start" placeholder="Start "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Start '">
								<input type="text" class="form-control date-picker" name="return" placeholder="Return "
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Return '">
								<input type="number" min="1" max="20" class="form-control" name="adults"
									placeholder="Adults " onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Adults '">
								<input type="number" min="1" max="20" class="form-control" name="child"
									placeholder="Child " onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Child '">
								<a href="#" class="primary-btn text-uppercase">Search Holidays</a>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<?php 
	$client = new SoapClient("http://localhost:8080/ws/hotel.wsdl");
	
		$parametros = array();
	
	//if(isset($_GET['NumHabitacion']))
	//{
		//$parametros = array("NumHabitacion" => $_GET['NumHabitacion']);
		$response = $client->__soapCall('ObtenerListaHabitaciones', $parametros);

	//print "<h1>" . $response->{'disponibilidad'} . "</h1>";
	//}
	$respuesta = $response->{'habitacion'};
	//print_r ($respuesta);

	foreach ($respuesta as $key => $value) {
		echo '<table>';
		echo '<thead>';
		echo '<td><h1>Hola mundo</h1></td>';
		echo '<td><h1>Hola mundo2</h1></td>';
		echo '</head>';

		echo '<tbody>';
		
		echo '</tbody>';
		echo '</table>';
		
		if($value->{'estado'}=="libre"){
			echo '<br>';
			echo '<img src="img/elements/ava.png" width="50" height="50"/>';
			print "  Habitacion: " . $key . " " .$value->{'estado'}. " Dentro" . "<br>";
			
		}else{
			echo '<br>';
			echo '<img src="img/elements/nota.png" width="50" height="50"/>';
			print "  Habitacion: " . $key . " " .$value->{'estado'} . " Fuera" . "<br>";
		}
		
	}

	?>
	<!-- End banner Area -->
	<!-- End price Area -->


	<!-- Start other-issue Area -->
	<!-- End other-issue Area -->


	<!-- Start testimonial Area -->
	<!-- End testimonial Area -->

	<!-- Start home-about Area -->
	<!-- End home-about Area -->


	<!-- Start blog Area -->
	<!-- End recent-blog Area -->

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
	</style>
</body>

</html>