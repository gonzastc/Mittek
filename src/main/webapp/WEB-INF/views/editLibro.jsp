<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" 	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>Biblio 21 - Editar Editoriales</title>
</head>

<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-primary text-body" role="alert">Editar Editoriales</h1>
						<form method="POST" action="#">
							      <div class="form-row">
							
							      <div class="form-group col-md-12">
							          <label>Nombre</label>
							          <input value="${libro.titulo}" name="titulo" type="text" class="form-control" placeholder="Ingrese el Nombre del Libro"/>
							          <label>Autor</label>
							          <input value="${libro.autor}" name="autor" type="text" class="form-control" placeholder="Ingrese el Autor del Libro"/>
							          <label>Editorial</label>
							          <select value="${libro.editorial}" class="form-control" name="editorial">
										<c:forEach items="${editoriales}" var="editorial">
											<option value=${editorial.idEditorial}>${editorial.nombre}</option>
										</c:forEach>
									  </select>
									  <label>Cantidad</label>
									  <input value="${libro.cantidad}" class="form-control" type="number" name="cantidad"/>
							      </div>
								</div>
							     <input class="btn btn-primary btn-lg btn-block" type="submit" value="Actualizar Libro"></input>
							    
						</form>
			</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>

</html>
