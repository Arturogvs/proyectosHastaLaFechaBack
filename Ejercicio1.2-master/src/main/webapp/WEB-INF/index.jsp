<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio 1</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/everis.js"></script>
</head>
<body>
	<h1> hola <c:out value="${everisFirstName} ${everisLastName}">
	</c:out> desde index.jsp</h1>
	
	<c:out value="${celular.getMarca()}"></c:out>
	<c:out value="${celular.marca}"></c:out>
	<hr>
	<c:out value="${listaCelulares[0].numero}"></c:out>
	<br><hr>
	<form action="/alumnos" method="POST">
		<label for="nombre">Nombre: </label>
		<input type="text" id="nombre" name="nombre">
		<label for="pass">Password: </label>
		<input type="password" id="pass" name="pass">
		<input type="submit" value="enviar">
	</form>

</body>
</html>