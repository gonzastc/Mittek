<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>Biblio 21 - Libros</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
				<blockquote class="blockquote text-center">
   		   		    <p class="h2 justify-content-center"> Detalle de Libros</p>
   		 		</blockquote>	 
	              <table class="table">
	                <thead class="thead-dark">
	                  <tr >
	                    <th scope="col" >Título</th>
	                    <th scope="col" >Autor</th>
	                    <th scope="col" >Editorial</th>
	                    <th scope="col" >Cantidad Disponible</th>
	                    <th scope="col" >Accion</th>
	                  </tr>                  
	                </thead>
	                 
	                <c:forEach items="${model.libros}"  var="libro">
	      				
		      			<tbody>
		                  <tr>      			
		      				<td> <c:out value="${libro.titulo}"/> </td>
		      				<td> <c:out value="${libro.autor}"/> </td>
		      				<td> <c:out value="${libro.editorial.nombre}"/> </td>
		      				<td> <c:out value="${libro.cantidad}"/> </td>
		      				<td >
								<a href="${pageContext.request.contextPath}/editLibro/${libro.idLibro}" class="btn btn-success btn-sm" role="button" title="Editar"><span class="fa fa-edit"></span></a>
								<a href="${pageContext.request.contextPath}/deleteLibro/${libro.idLibro}" onclick='return confirm("¿Estas seguro? Se borrarán todos los préstamos con este libro")' class="btn btn-danger btn-sm" role="button" title="Eliminar"><span class="fa fa-trash"></span></a>
							</td>
	      					</tr>
	      				</tbody>
	      			</c:forEach>
	              </table>
           
				</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>