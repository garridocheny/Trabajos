<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Iniciar Sesión</title>
</head>
<body>
	<form action="EjemploJDBCServlet" method="get">
	<h2>Inicia Sesión</h2>
		<label>Capture Username:</label> <input type="text" name="txtUsername"></input>
		</br>
		<label>Password</label> <input type="text" name="txtPassword"></input>
		<input type="submit" value="Login"> </input>
	</form>
</body>
</html>