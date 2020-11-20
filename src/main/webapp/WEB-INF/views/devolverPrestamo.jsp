<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>Biblio 21 - Libro Devuelto</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h3 class="text-success">Se ha devuelto el préstamo del libro "${prestamo.libro.titulo}" por parte del
					 asociado "${prestamo.asociado.nombre} ${prestamo.asociado.apellido}" de forma exitosa</h3>
				</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>