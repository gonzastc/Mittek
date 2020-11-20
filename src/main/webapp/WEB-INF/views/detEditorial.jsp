<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" 	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webjars/bootstrap/4.0.0/css/bootstrap.css">
	<title>Biblio 21 - Editoriales</title>
</head>


  <body>
  <div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			
			<div class="row">
   		<div class="col-md-12">
   			
   		<blockquote class="blockquote text-center">
   		   		    <p class="h2 justify-content-center"> Detalle de Editoriales</p>
   		 </blockquote>
        
        <div class="editoriales mr-3 ml-3">
         
            <div>
              <table class="table">
                <thead class="thead-dark">
                  <tr >
                    <th scope="col" >Id</th>
                    <th scope="col" >Nombre</th>
                    <th scope="col" >Accion</th>
                  </tr>                  
                </thead>
                 
                <c:forEach items="${model.editoriales}"  var="edit">
      				
	      			<tbody>
	                  <tr>      			
	      				<td> <c:out value="${edit.idEditorial}"/> </td>
	      				<td> <c:out value="${edit.nombre}"/> </td>
	      				<td >
							<a href="${pageContext.request.contextPath}/editEditorial/${edit.idEditorial}" class="btn btn-success btn-sm" role="button" title="Edit"><span class="fa fa-edit"></span></a>
							<a href="${pageContext.request.contextPath}/deleteEditorial/${edit.idEditorial}" onclick='return confirm("¿Estas seguro? Se borrarán todos los libros asociados con esta editorial")' class="btn btn-danger btn-sm" role="button" title="Eliminar"><span class="fa fa-trash"></span></a>
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