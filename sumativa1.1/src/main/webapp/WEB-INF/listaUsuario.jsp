<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-2">
		
		</div>
		<div class="col-md-8">
			<h1>Lista de Usuarios</h1>
			<br>
			<table class="table table-striped">
				  <thead>
				    <tr>
				      
				      <th scope="col">ID</th>
				      <th scope="col">Rut</th>
		  		      <th scope="col">Nombre</th>
		  		      <th scope="col">Apellido</th>
		  		      <th scope="col">Password</th>
		  		      
				    </tr>
				  </thead>
				  <tbody>
				   <c:forEach var="usuario" items="${lista_usuario}">
			         <tr>
				      <td><c:out value = "${usuario.id}"/></td>
				      <td><c:out value = "${usuario.rut}"/></td>
		  		      <td><c:out value = "${usuario.nombre}"/></td>
		  		      <td><c:out value = "${usuario.apellido}"/></td>
		  		      <td><c:out value = "${usuario.pass}"/></td>
		  		      <th scope="row"><a class="btn btn-primary" href="/actualizarUsuarios/${usuario.id}/${usuario.rut}/${usuario.nombre}/${usuario.apellido}/${usuario.pass}/">Actualizar</a></th>
		  		      <th scope="row"><a class="btn btn-danger" href="/eliminarUsuarios/${usuario.id}">Eliminar</a></th>
		  		      
				    </tr>
			       </c:forEach>
			       		
				  </tbody>
			</table>
					<a class="btn btn-success" href="/inicio">Volver</a>
			
		</div>
			
	</div>

</div>


</body>
</html>