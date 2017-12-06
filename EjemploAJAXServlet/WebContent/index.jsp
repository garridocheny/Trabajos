<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
<form action="ejemploajaxservletservlet" method="post">
<h1>Implementando la respuesta en el servidor con AJAX</h1>
<br/>
<label>Escribe tu nombre:</label>
<input type="text" Id="txtUser" placeholder="Lléname de letras"/>
<br/>
<input id="btnAcepta" type="button" value="Acepta el testo"/>
<div id="welcometesto"></div>
</form>

</body>
<script type="text/javascript" src="js/script.js"></script>
</html>