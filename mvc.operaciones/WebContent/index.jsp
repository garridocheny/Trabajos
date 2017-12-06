<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletOperaciones" method="post">
		<label>Input a number</label>
		<input type="text" name="txtNumber1"></input>
		</br>
		<label>Input another number</label>
		<input type="text" name="txtNumber2"></input>
		<input type="submit" value="Accept"></input>
	</form>
	<table>
		<thead>
			<th>Usuarios</th>
			<th>Contraseñas</th>
		<tbody></tbody>
		</thead>
		<tbody>
			<tr>
				<td><%for(int i=1; i<=10;i++)
				{
					out.println(
							"<tr><td><input type=\"text\"name=\"admin"+i+"\" placeholder=\"admin"+i+"\"></td><td>admin"+i+"<td></tr>");
				}
					
					%>admin</td>
			</tr>
		</tbody>
	</table>
</body>
</html>