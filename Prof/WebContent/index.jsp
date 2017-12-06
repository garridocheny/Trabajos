<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet"/>
</head>
<body>
	<form action="EjemploAjaxServidorServlet" method="post">
		<h1>Implementando la respuesta en el servidor con Ajax</h1>
		<label>Escribe tu nombre:</label> 
		<input type="text" id="txtUser" name="txtUser" placeholder="Escribe tu testo aqui" /> <br />
		<input type="text" name="txtTesto" placeholder="Escribe otro testo aqui" /> <br /> 
		<input id="btnAcepta" type="button" value="Acepta el testo" />
		<div id="welcometesto">
		</div>
	</form>
</body>
<script src="js/script.js"></script>
</html>