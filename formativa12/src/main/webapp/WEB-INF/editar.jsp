<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="" modelAttribute=alumno>
<form:label path="nombre" ></form:label>
<form:input path="nombre"/>
<form:label path="pass" ></form:label>
<form:input path="pass"/>
<input type="submit">enviar</input>

</form:form>
</body>
</html>