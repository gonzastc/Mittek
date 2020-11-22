<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>	Registrar Envío - Mittek</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu1.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-primary text-body" role="alert">Registrar Envío</h1>
			  <form:form method="POST" action="registrarEnvio" modelAttribute="envio">
	      <div class="form-row">
	        
	        
	      <div class="form-group col-md-12">
	          <label for="origen">Origen</label>
	          <form:input path="origen" type="text" class="form-control" id="origen" placeholder="Ingrese el Origen"/>
	      </div>
	
	      <div class="form-group col-md-12">
	          <label for="destino">Destino</label>
	          <form:input path="destino" type="text" class="form-control" id="destino" placeholder="Ingrese el Destino"/>
	      </div>
	
	       <div class="form-group col-md-12">
	          <label>Fecha de Entrega</label>
			  <input onkeydown="return false" name="fechaDeEntrega" placeholder="Fecha Seleccionada..." type="text" id="date-picker-example" class="form-control datepicker">
	      </div>
	      <div class="form-group col-md-12">
	          <label>Fecha de Mínima para la carga en el Origen</label>
			  <input onkeydown="return false" name="fechaMinimaOrigen" placeholder="Fecha Seleccionada..." type="text" id="date-picker-example" class="form-control datepicker">
	      </div>
	      <div class="form-group col-md-12">
	          <label>Fecha de Máxima para la carga en el Origen</label>
			  <input onkeydown="return false" name="fechaMaximaOrigen" placeholder="Fecha Seleccionada..." type="text" id="date-picker-example" class="form-control datepicker">
	      </div>
	      <div class="form-group col-md-12">
	          <label>Fecha limite para seleccionar Transportista</label>
			  <input onkeydown="return false" name="fechaLimiteTransportista" placeholder="Fecha Seleccionada..." type="text" id="date-picker-example" class="form-control datepicker">
	      </div>
	      
	
	        <input class="btn btn-primary btn-lg btn-block" type="submit" value="Confirmar Solicitud"></input>
	    
		</form:form>
				</div>
			</div>
			
		</div>				
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
			<script>$('.datepicker').datepicker({
				    format: 'dd/mm/yyyy',
				    language: 'es',
				    startDate: "+0d"				    
				});
		</script>
</body>
</html>