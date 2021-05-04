<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/inicio">Home</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="usuarios" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Productos
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="/ingProducto">Ingresar Productos</a></li>
            <li><a class="dropdown-item" href="/listarProductos">Listar Productos</a></li>
          </ul>
          
        </li> 
        
          <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="usuarios" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Ventas
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="/ingVenta">Ingresar Ventas</a></li>
            <li><a class="dropdown-item" href="/listarVentas">Listar Ventas</a></li>
          </ul>
          
        </li> 
        
          <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle" href="#" id="usuarios" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Usuarios
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
	            <li><a class="dropdown-item" href="/ingUsuario">Ingresar Usuarios</a></li>
	            <li><a class="dropdown-item" href="/listarUsuarios">Listar Usuarios</a></li>
	          </ul>
          
          </li> 
      </ul>
   
    </div>
  </div>
</nav>
<!-- <input id="producto" href="/ingProducto">Ingreso de productos</input>
	<input id="venta" href="/ingVenta">Ingreso de ventas</input>
	<input id="usuario" href="/ingUsuario">Ingreso de usuarios</input> -->
	
</body>
</html>

<!-- <c:forEach var = "i" begin = "1" end = "5">
Item <c:out value = "${i}"/><p>
</c:forEach> -->