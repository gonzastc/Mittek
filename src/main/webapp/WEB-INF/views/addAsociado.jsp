<%@ include file="/WEB-INF/views/include.jsp" %>
<html>
<head>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Biblio 21 - Registrar Asociado</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-primary text-body" role="alert">Registrar Asociado</h1>
			  <form:form method="POST" action="addAsociado" modelAttribute="asociado">
	      <div class="form-row">
	        
	        
	      <div class="form-group col-md-12">
	          <label for="dni">Dni</label>
	          <form:input path="dni" type="text" class="form-control" id="dni" placeholder="Ingrese su Dni"/>
	      </div>
	
	      <div class="form-group col-md-12">
	          <label for="nombre">Nombre</label>
	          <form:input path="nombre" type="text" class="form-control" id="Nombre" placeholder="Ingrese su Nombre"/>
	      </div>
	
	       <div class="form-group col-md-12">
	          <label for="apellido">Apellido</label>
	          <form:input path="apellido" type="text" class="form-control" id="apellido" placeholder="Ingrese su Apellido"/>
	      </div>
	      <div class="form-group col-md-12">
	          <label for="telefono">Telefono</label>
	          <form:input path="telefono" type="text" class="form-control" id="telefono" placeholder="Ingrese su telefono"/>
	      </div>
	      <div class="form-group col-md-12">
	          <label for="mail">Mail</label>
	          <form:input path="mail" type="text" class="form-control" id="mail" placeholder="Ingrese su Mail"/>
	      </div>
	
	        <input class="btn btn-primary btn-lg btn-block" type="submit" value="Guardar Asociado"></input>
	    
		</form:form>
				</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>