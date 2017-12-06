<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet"/>
<title>Dynamic Table </title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar filas</title>
</head>
<body>

<h2>Practica Dynamic Table</h2>
<table>
<theader>
<th>Nombre</th><th>Usuario</th><th>Email</th>
</theader>
<tbody id="tcuerpo">
<tr><td>Jon</td><td>Snow</td><td>ejemplo1@correo.com</td>
<tr><td>Varys</td><td>Eunco</td><td>ejemplo2@correo.com</td>
<tr><td>Margaery</td><td>Tyrell</td><td>ejemplo3@correo.com</td>
</tbody>
</table>

<input id="buttonOne" type="button" value="Agregar"/>
</body>
<script src="js/script.js"></script>
</html>