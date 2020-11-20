<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/WEB-INF/views/include.jsp" %>
		<title>Biblio 21 - Registrar Préstamo</title>
	</head>
	<body>
		<div class="container-fluid pt-4">
			<div class="row">
				<%@ include file="/WEB-INF/views/menu.jsp" %>
				<div class="col-10">
					<div class="row">
					<div class="col-12">
					<h1 class= "d-flex justify-content-center alert alert-primary text-body" role="alert">Registrar Préstamo</h1>
						<form method="post">
						<div class="form-group">
							<label>Asociado</label>
							<select class="form-control" name="asociado">
								<c:forEach items="${model.asociados}" var="asociado">
									<option value=${asociado.dni}>${asociado.nombre} ${asociado.apellido}</option>
								</c:forEach>
							</select>
							<label>Libro</label>
							<select class="form-control" name="libro">
								<c:forEach items="${model.libros}" var="libro">
									<option value=${libro.idLibro}>${libro.titulo} - ${libro.autor}</option>
								</c:forEach>
							</select>
							<label>Fecha de Vencimiento</label>
							<input onkeydown="return false" name="fechaDeVencimiento" placeholder="Fecha Seleccionada..." type="text" id="date-picker-example" class="form-control datepicker">
						</div>
						<input type="submit" class="btn btn-primary btn-lg btn-block" value="Guardar Préstamo"></input>
						</form>
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