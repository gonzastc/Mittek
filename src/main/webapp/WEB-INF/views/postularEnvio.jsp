<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>	Postularse a Envio</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu1.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-success text-body" role="alert">Postularse a Envío</h1>
				<form method="POST" >
	      <div class="form-row">
	        
	      <label>Transportista</label>  
	      <select class="form-control" name="transportistas">
			<c:forEach items="${model.transportistas}" var="transportistas">
				<option value=${transportistas.idTransportista}>Nombre: ${transportistas.nombre} ${transportistas.apellido}</option>
			</c:forEach>
		</select>
		
		<label>Envio</label>  
	      <select class="form-control" name="envios">
			<c:forEach items="${model.envios}" var="envios">
				<option value=${envios.idEnvio}>Origen: ${envios.origen}. Destino: ${envios.destino}. Fecha Entrega: ${envios.getFechaEntregaSH()}.</option>
			</c:forEach>
		</select>
		<div class="form-group col-md-12">
	          <label>Tarifa</label>
	          <input name="tarifa" type="text" class="form-control" placeholder="Ingrese la tarifa"/>
	    </div>	
				<input class="btn btn-success btn-lg btn-block" type="submit" value="Confirmar Postulación"></input>
		</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>