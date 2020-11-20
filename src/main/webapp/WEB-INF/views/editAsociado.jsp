<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" 	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webjars/bootstrap/4.0.0/css/bootstrap.css">
<title>Biblio 21 - Editar Asociado</title>
</head>

<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-primary text-body" role="alert">Editar Asociado</h1>
			<form:form method="POST" action="editAsociado" modelAttribute="asociado">
			<div class="form-row">
			<div class="form-group col-md-12">
				<label for="dni">Dni</label>
				<form:input disabled="true" path="dni" type="text" class="form-control" id="dni" />
			</div>

			<div class="form-group col-md-12">
				<label for="nombre">Nombre</label>
				<form:input path="nombre" type="text" class="form-control" id="Nombre" />
			</div>

			<div class="form-group col-md-12">
				<label for="apellido">Apellido</label>
				<form:input path="apellido" type="text" class="form-control" id="apellido" />
			</div>
			<div class="form-group col-md-12">
				<label for="telefono">Telefono</label>
				<form:input path="telefono" type="text" class="form-control" id="telefono"  />
			</div>
			<div class="form-group col-md-12">
				<label for="mail">Mail</label>
				<form:input path="mail" type="text" class="form-control" id="mail" />
			</div>

			<input class="btn btn-info btn-lg btn-block" type="submit" value="Actualizar Asociado"></input>
					
	</form:form>
			</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>

</html>
