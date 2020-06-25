<%@page import="com.calculatorpojo.CalculatorPojo" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-comspatible" content="ie=edge">
<title>Calculator-Sprimg MVC</title>
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css">

 <link rel="icon" type="image/png" href="favicon/favicon-32x32.png" />
	  <link rel="icon" type="image/png" href="favicon/favicon-16x16.png" />
	  <link rel="icon" type="image/png" href="favicon/apple-touch-icon.png" />
	  <link rel="icon" type="image/png" href="favicon/android-chrome-512x512.png" />
	  <link rel="icon" type="image/png" href="favicon/android-chrome-192x192.png" />
	  <link rel="shortcut icon" href="favicon/favicon.ico" />
<!-- Bootstrap core CSS   -->

<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="css/mdb.min.css" rel="stylesheet">
<!-- Your custom styles (optional) -->
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<div class="calculator card">

		<input type="text" class="calculator-screen z-depth-1" name="screen"
			value="${screen }" disabled>

		<div class="calculator-keys">

			<a href="operation?operand=1"><button type="button"
					class="operator btn btn-info" value="+" onclick="operation"
					name="operand">+</button></a> <a href="operation?operand=2"><button
					type="button" class="operator btn btn-info" value="-"
					name="operand">-</button></a> <a href="operation?operand=3"><button
					type="button" class="operator btn btn-info" value="*"
					href="operation" name="operand">&#xD7;</button></a> <a
				href="operation?operand=4"><button type="button"
					class="operator btn btn-info" value="/" href="operation"
					name="operand">&#xF7;</button></a> <a href="val?no=7"><button
					type="button" value="7" class="btn btn-light waves-effect"
					href="val" name="no">7</button></a> <a href="val?no=8"><button
					type="button" value="8" class="btn btn-light waves-effect"
					href="val" name="no">8</button></a> <a href="val?no=9"><button
					type="button" value="9" class="btn btn-light waves-effect"
					href="val" name="no">9</button></a> <a href="val?no=4"><button
					type="button" value="4" class="btn btn-light waves-effect"
					href="val" name="no">4</button></a> <a href="val?no=5"><button
					type="button" value="5" class="btn btn-light waves-effect"
					href="val" name="no">5</button></a> <a href="val?no=6"><button
					type="button" value="6" class="btn btn-light waves-effect"
					href="val" name="no">6</button></a> <a href="val?no=1"><button
					type="button" value="1" class="btn btn-light waves-effect"
					href="val" name="no">1</button></a> <a href="val?no=2"><button
					type="button" value="2" class="btn btn-light waves-effect"
					href="val" name="no">2</button></a> <a href="val?no=3"><button
					type="button" value="3" class="btn btn-light waves-effect"
					href="val" name="no">3</button></a> <a href="val?no=0"><button
					type="button" value="0" class="btn btn-light waves-effect"
					name="no">0</button></a>

			<!--<button type="button" class="decimal function btn btn-secondary" value="." >.</button>  -->
			<a href="clear"><button type="button"
					class="all-clear function btn btn-danger btn-sm" name="clear">AC</button>
			</a> <a href="ans"><button type="button"
					class="equal-sign operator btn btn-default" name="ans">=</button></a>

		</div>
	</div>


	<!-- SCRIPTS -->
	<!-- JQuery -->
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<!-- Bootstrap tooltips -->
	<script type="text/javascript" src="js/popper.min.js"></script>
	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<!-- MDB core JavaScript -->
	<script type="text/javascript" src="js/mdb.min.js"></script>



</body>

</html>