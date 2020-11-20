<%@ include file="/WEB-INF/views/include.jsp" %>
<html>
<head>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Biblio 21 - Registrar Editorial</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-primary text-body" role="alert">Registrar Editorial</h1>
			  <form:form method="POST" action="addEditorial" modelAttribute="editorial">
	      <div class="form-row">
	
	      <div class="form-group col-md-12">
	          <label for="nombre">Nombre</label>
	          <form:input path="nombre" type="text" class="form-control" id="Nombre" placeholder="Ingrese su Nombre"/>
	      </div>
	
	        <input class="btn btn-primary btn-lg btn-block" type="submit" value="Guardar Editorial"></input>
	    
		</form:form>
				</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>