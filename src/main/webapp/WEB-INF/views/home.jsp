<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Biblio 21</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h3 class=" badge-danger">Préstamos Vencidos</h3>
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
								<th scope="col">Dni</th>
								<th scope="col">Nombre</th>
								<th scope="col">Apellido</th>
								<th scope="col">Mail</th>
								<th scope="col">Telefono</th>
								<th scope="col">Accion</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${model.prestamosvencidos}" var="prestamo">
							<tr>
								<td scope="row"><c:out value="${prestamo.libro.titulo}" /></td>
								<td><c:out value="${prestamo.getFechaPrestamoSH()}" /></td>
								<td><c:out value="${prestamo.getFechaVencimientoSH()}" /></td>
								<td><c:out value="${prestamo.asociado.dni}" /></td>
								<td><c:out value="${prestamo.asociado.nombre}" /></td>
								<td><c:out value="${prestamo.asociado.apellido}" /></td>
								<td><c:out value="${prestamo.asociado.mail}" /></td>
								<td><c:out value="${prestamo.asociado.telefono}" /></td>
								<td align="center">
									<a href="devolverPrestamo/${prestamo.idPrestamo}" title="Registrar Devolución"><span class="badge badge-success"><i class="fa fa-edit"></i></span></a>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">	
				<div class="col-12">
					<h3 class=" badge-warning">Préstamos A Vencer</h3>
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
							<th scope="col">Dni</th>
							<th scope="col">Nombre</th>
							<th scope="col">Apellido</th>
							<th scope="col">Mail</th>
							<th scope="col">Telefono</th>
							<th scope="col">Accion</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${model.prestamosvigentes}" var="prestamo">
						<tr>
							<td scope="row"><c:out value="${prestamo.libro.titulo}" /></td>
							<td><c:out value="${prestamo.getFechaPrestamoSH()}" /></td>
							<td><c:out value="${prestamo.getFechaVencimientoSH()}"/></td>
							<td><c:out value="${prestamo.asociado.dni}" /></td>
							<td><c:out value="${prestamo.asociado.nombre}" /></td>
							<td><c:out value="${prestamo.asociado.apellido}" /></td>
							<td><c:out value="${prestamo.asociado.mail}" /></td>
							<td><c:out value="${prestamo.asociado.telefono}" /></td>
							<td align="center">
								<a href="devolverPrestamo/${prestamo.idPrestamo}" title="Registrar Devolución"><span class="badge badge-success"><i class="fa fa-edit"></i></span></a>
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