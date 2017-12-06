<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sandwich de Límites</title>
</head>
<body>
<form action="limitesservlet" method="post">
		<label>¿Cuál es tu numero favorito?</label>
		<input type="number" name="txtNumber1"></input>
		</br>
		<label>¿Cuál es tu número menos favorito?</label>
		<input type="text" name="txtNumber2"></input>
		</br>
		<input type="submit" value="Enviar"></input>
	</form>
	<div>
	</div>
</body>
</html>