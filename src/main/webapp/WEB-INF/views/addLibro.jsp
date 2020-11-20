<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<%@ include file="/WEB-INF/views/include.jsp" %>
<title>Biblio 21 - Registrar Libro</title>
</head>
<body>
	<div class="container-fluid pt-4">
		<div class="row">
		<%@ include file="/WEB-INF/views/menu.jsp" %>
		<div class="col-10">
			<div class="row">
				<div class="col-12">			
					<h1 class= "d-flex justify-content-center alert alert-primary text-body" role="alert">Registrar Libro</h1>
					  <form method="POST" action="#">
				      <div class="form-row">
				
				      <div class="form-group col-md-12">
				          <label>Nombre</label>
				          <input name="titulo" type="text" class="form-control" placeholder="Ingrese el Nombre del Libro"/>
				          <label>Autor</label>
				          <input name="autor" type="text" class="form-control" placeholder="Ingrese el Autor del Libro"/>
				          <label>Editorial</label>
				          <select class="form-control" name="editorial">
							<c:forEach items="${model.editoriales}" var="editorial">
								<option value=${editorial.idEditorial}>${editorial.nombre}</option>
							</c:forEach>
						  </select>
						  <label>Cantidad</label>
						  <input class="form-control" type="number" name="cantidad"/>
				      </div>
					</div>
				     <input class="btn btn-primary btn-lg btn-block" type="submit" value="Guardar Libro"></input>
				    
				</form>
				</div>
			</div>
			
		</div>		
		</div>
	</div>
	<%@ include file="/WEB-INF/views/end.jsp" %>
</body>
</html>