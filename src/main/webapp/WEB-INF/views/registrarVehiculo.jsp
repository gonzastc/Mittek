<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>Registrar Vehiculo</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu1.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-success text-body" role="alert">Registrar Vehículo</h1>
					  <form method="POST" action="#">
				      <div class="form-row">
				
				      <div class="form-group col-md-12">
				          <label>Marca</label>
				          <input name="marca" type="text" class="form-control" placeholder="Ingrese la marca del Vehiculo"/>
				      </div>
				      <div class="form-group col-md-12"> 
				          <label>Modelo</label>
				          <input name="modelo" type="text" class="form-control" placeholder="Ingrese el modelo del Vehiculo"/>
				   	</div>	  
				    <div class="form-group col-md-12">
	          			  <label>Año</label>
			  			<input name="anio" type="text" class="form-control" placeholder="Ingrese el año del Vehiculo"/>
	      			</div>	
	      			<div class="form-group col-md-12">
				          <label>Color</label>
				          <input name="color" type="text" class="form-control" placeholder="Ingrese el color del Vehiculo"/>
				     </div>     
				       <div class="form-group col-md-12">   
				          <label>Patente</label>
				          <input name="patente" type="text" class="form-control" placeholder="Ingrese la patente del Vehiculo"/>
				      </div>
				         <div class="form-group col-md-12"> 
				          <label>Tipo de Vehiculo</label>
				          <select class="form-control" name="tipoVehiculo">
							<c:forEach items="${model.tipoVehiculo}" var="tipoVehiculo">
								<option value=${tipoVehiculo.idTipo_vehiculo}>${tipoVehiculo.categoria}</option>
							</c:forEach>
							</select>
					</div>
					<div class="form-group col-md-12">		
						<label>Transportista</label>  
					      <select class="form-control" name="transportistas">
							<c:forEach items="${model.transportistas}" var="transportistas">
								<option value=${transportistas.idTransportista}>Nombre: ${transportistas.nombre} ${transportistas.apellido}</option>
							</c:forEach>
						</select>
					</div>		
				      </div>
					
				     <input class="btn btn-success btn-lg btn-block" type="submit" value="Guardar Vehículo"></input>
				    
				</form>
				</div>
				</div>
			</div>
			
		</div>		
		</div>

	<%@ include file="/WEB-INF/views/end.jsp" %>
				
</body>
</html>