<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="form" uri  = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bodegon</title>
</head>
<body>
	<h1>${message}</h1>
	
	<form:form action="${pageContext.request.contextPath}/pushProduct" method="post" modelAttribute="product">
		<label for="name">Nombre del producto: </label><br>
		<form:input type="text" name="name" path="name" />
		<form:errors path="name" cssStyle="color:RED;"/> <br><br>
		
		<label for="brand">Marca del producto: </label><br>
		<form:input type="text" name="brand" path="brand" />
		<form:errors path="brand" cssStyle="color:RED;"/> <br><br>
		
		<label for="description">Descripción del producto: </label><br>
		<form:input type="text" name="description" path="description" />
		<form:errors path="description" cssStyle="color:RED;"/> <br><br>
		
		<label for="category">Categoria del producto: </label><br>
		<form:input type="text" name="category" path="category" />
		<form:errors path="category" cssStyle="color:RED;"/> <br><br>
		
		<label for="price">Precio del producto: </label><br>
		<form:input type="number" name="price" path="price" />
		<form:errors path="price" cssStyle="color:RED;"/> <br><br>
		
		<label for="name">Fecha de expiración: </label><br>
		<form:input type="text" name="expirationDate" path="expirationDate" />
		<form:errors path="expirationDate" cssStyle="color:RED;"/> <br><br>
		
		<input type="submit" value="Agregar"/>	
	</form:form>
</body>
</html>