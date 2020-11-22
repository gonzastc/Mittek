<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@ include file="/WEB-INF/views/include.jsp"%>
<title>Registrar Envío - Mittek</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
			<%@ include file="/WEB-INF/views/menu1.jsp"%>
			<div class="col-10">
				<div class="row">
					<div class="col-12">
						<h1
							class="d-flex justify-content-center alert alert-success text-body"
							role="alert">Registrar Envío</h1>
						<form method="POST">
							<div class="form-row">

								<label>Remitente</label> <select class="form-control"
									name="remitentes">
									<c:forEach items="${model.remitentes}" var="remitentes">
										<option value=${remitentes.idRemitente}>Nombre:
											${remitentes.nombre} ${remitentes.apellido}</option>
									</c:forEach>
								</select>

								<div class="form-group col-md-12">
									<label>Carga</label> 
									<div class="d-flex">
									<input name="alto" type="text"
										class="form-control"
										placeholder="Ingrese el Alto de la Carga en CM" /> 
									<input name="ancho" type="text" class="form-control"
										placeholder="Ingrese el Ancho de la Carga en CM" /> 
									</div>
									<div class="d-flex ">
									<input name="largo" type="text" class="form-control"
										placeholder="Ingrese el Largo de la Carga en CM" /> 
									<input	name="peso" type="text" class="form-control"
										placeholder="Ingrese el Peso de la Carga en CM" />
										</div>
								</div>

								<div class="form-group col-md-12">
									<label>Origen</label> <input name="origen" type="text"
										class="form-control" placeholder="Ingrese el Origen" />
								</div>

								<div class="form-group col-md-12">
									<label>Destino</label> <input name="destino" type="text"
										class="form-control" placeholder="Ingrese el Destino" />
								</div>

								<div class="form-group col-md-12">
									<label>Tarifa Mínima</label> <input name="Tarifa_minima"
										type="text" class="form-control"
										placeholder="Ingrese la tarifa minima que desea pagar" />
								</div>

								<div class="form-group col-md-12">
									<label>Tarifa Máxima</label> <input name="Tarifa_maxima"
										type="text" class="form-control"
										placeholder="Ingrese la tarifa máxima que desea pagar" />
								</div>

								<div class="form-group col-md-12">
									<label>Fecha de Entrega</label> <input onkeydown="return false"
										name="fechaDeEntrega" placeholder="Fecha Seleccionada..."
										type="text" id="date-picker-example"
										class="form-control datepicker">
								</div>
								<div class="form-group col-md-12">
									<label>Fecha de Mínima para la carga en el Origen</label> <input
										onkeydown="return false" name="fechaMinimaOrigen"
										placeholder="Fecha Seleccionada..." type="text"
										id="date-picker-example" class="form-control datepicker">
								</div>
								<div class="form-group col-md-12">
									<label>Fecha de Máxima para la carga en el Origen</label> <input
										onkeydown="return false" name="fechaMaximaOrigen"
										placeholder="Fecha Seleccionada..." type="text"
										id="date-picker-example" class="form-control datepicker">
								</div>
								<div class="form-group col-md-12">
									<label>Fecha limite para seleccionar Transportista</label> <input
										onkeydown="return false" name="fechaLimiteTransportista"
										placeholder="Fecha Seleccionada..." type="text"
										id="date-picker-example" class="form-control datepicker">
								</div>


								<input class="btn btn-success btn-lg btn-block" type="submit"
									value="Confirmar Solicitud"></input>
							</div>						
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/end.jsp"%>
	<script>$('.datepicker').datepicker({
				    format: 'dd/mm/yyyy',
				    language: 'es',
				    autoclose: true, 
				    startDate: "+0d"				    
				});
		</script>
</body>
</html>