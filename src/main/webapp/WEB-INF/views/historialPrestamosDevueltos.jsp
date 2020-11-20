<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>Biblio 21 - Historial de Préstamos</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">	
				<div class="col-12">
					<h3 class=" badge-info">Préstamos Devueltos</h3>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<table class="table">
						<thead class="thead-dark">
							<tr>			
								<th scope="col">Libro</th>
								<th scope="col">Fecha Pres.</th>
								<th scope="col">Fecha Vto.</th>
								<th scope="col">Fecha Dev.</th>
								<th scope="col">Asociado</th>
								<th scope="col">Dni</th>
								<th scope="col">Accion</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${model.prestamosdevueltos}" var="prestamo">
							<tr>
								<td scope="row"><c:out value="${prestamo.libro.titulo} - ${prestamo.libro.autor}" /></td>
								<td><c:out value="${prestamo.getFechaPrestamoSH()}" /></td>
								<td><c:out value="${prestamo.getFechaVencimientoSH()}"/></td>
								<td><c:out value="${prestamo.getFechaDevolucionSH()}"/></td>
								<td><c:out value="${prestamo.asociado.nombre} ${prestamo.asociado.apellido}" /></td>
								<td><c:out value="${prestamo.asociado.dni}" /></td>
								<td align="center">
									<a href="${pageContext.request.contextPath}/deletePrestamo/${prestamo.getIdPrestamo()}" onclick='return confirm("¿Estas seguro?")' class="btn btn-danger btn-sm" role="button" title="Eliminar"><span class="fa fa-trash"></span></a>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>