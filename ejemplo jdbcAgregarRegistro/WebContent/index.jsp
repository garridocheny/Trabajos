<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Consulta los Datos del Usuario</h1>
	<form id="frmoDatosUsuario" action="ejemploJDBCAgregarregistro" method="post">
		<input id="acepta" type="submit" value="Consulta Aprietame" />
	</form>
	
	<h1>Introduce los Datos del Usuario</h1>
	<form id="frmoDatosUsuario2" action="EjemploJDBCAgregarRegistro2Servlet" method="post">
		<label>idJardinero:</label><input type="text" name="txtIdGar" /> </br> 
		<label>Nombre Jardinero:</label><input type="text" name="txtnameGar" /> </br> 
		<label>Password de Jardinero:</label><input type="password" name="txtpass" /> </br> 
		<label>Email:</label><input type="text" name="txtemail" /> </br> 
		<input id="acepta" type="submit" value="Agregar Regisgtro" />
	</form>
	
</body>
<script src="js/js.js" type="text/javascript"></script>
</html>