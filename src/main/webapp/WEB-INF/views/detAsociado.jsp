<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" 	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webjars/bootstrap/4.0.0/css/bootstrap.css">
	<title>Biblio 21 - Asociados</title>
</head>


  <body>
  <div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			
			<div class="row">
   		<div class="col-md-12">
   			
   		<blockquote class="blockquote text-center">
   		   		    <p class="h2 justify-content-center"> Detalle de Asociados</p>
   		 </blockquote>
        
        <div class="asociados mr-3 ml-3">
         
            <div>
              <table class="table">
                <thead class="thead-dark">
                  <tr >
                    <th scope="col" >Documento</th>
                    <th scope="col" >Nombre</th>
                    <th scope="col" >Apellido</th>
                    <th scope="col" >Telefono</th>
                    <th scope="col" >Mail</th>
                    <th scope="col" >Accion</th>
                  </tr>                  
                </thead>
                 
                <c:forEach items="${model.asociados}"  var="asoc">
      				
	      			<tbody>
	                  <tr>      			
	      				<td> <c:out value="${asoc.dni}"/> </td>
	      				<td> <c:out value="${asoc.nombre}"/> </td>
	      				<td> <c:out value="${asoc.apellido}"/> </td>
	      				<td> <c:out value="${asoc.telefono}"/> </td>
	      				<td><c:out value="${asoc.mail}"/> </td>
	      				<td >
							<a href="${pageContext.request.contextPath}/editAsociado/${asoc.dni}" class="btn btn-success btn-sm" role="button" title="Editar"><span class="fa fa-edit"></span></a>
							<a href="${pageContext.request.contextPath}/deleteAsociado/${asoc.dni}" onclick='return confirm("¿Estas seguro? Se borrarán todos los préstamos asociados con esta persona")' class="btn btn-danger btn-sm" role="button" title="Eliminar"><span class="fa fa-trash"></span></a>
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
		</div>
	</div>
    <%@ include file="/WEB-INF/views/end.jsp" %>
  </body>
</html>