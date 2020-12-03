<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>Error Tarifa</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu1.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h2 class=" d-flex justify-content-center text">Los datos de las tarifas son incorrectos.</h2>
					<h3 class="d-flex justify-content-center text">Intente nuevamente</h3>
					<a class="btn btn-success" role="button" href="#" onClick="history.go(-1)"> Corregir Datos</a>
					<a class="btn btn-success" href="/springapp/home" role="button"> Volver al Inicio</a>
				</div>
			</div>
			
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>