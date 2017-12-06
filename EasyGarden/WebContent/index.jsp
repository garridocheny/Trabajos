<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<form id="frmPerson">
		<input type="text" name="txtnom" placeholder="Nombre"> <input
			type="text" name="txtapp" placeholder="Apellido Paterno"> <input
			type="text" name="txtapm" placeholder="Apellido Materno"> <input
			type="text" name="txttel" placeholder="Telefono de persona">
		<input type="text" name="txtcel" placeholder="Celular de persona">
	</form>
	<button onclick="savePerson();">Guardar</button>

	<table>
		<thead>
			<th>Id</th>
			<th>Nombre</th>
			<th>Apellido Paterno</th>
			<th>Apellido Materno</th>
			<th>Celular</th>
			<th>Teléfono</th>
			<th>Status</th>
		</thead>
		<tbody id="dataTable">

		</tbody>
	</table>


	<script src="https://code.jquery.com/jquery-3.2.1.min.js"
		integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
		crossorigin="anonymous"></script>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {

							$
									.ajax({
										// la URL para la petición
										url : '/EasyGarden/PersonServlet?actionToDo=getAllUsers',

										// especifica si será una petición POST o GET
										type : 'GET',
										contentType : "application/json;charset=UTF-8",
										// código a ejecutar si la petición es satisfactoria;
										// la respuesta es pasada como argumento a la función
										success : function(json) {
											var dataSet = eval('(' + json + ')');
											console.log(dataSet);
											for (i = 0; i < dataSet.length; i++) {
												$('#dataTable')
														.append(
																'<tr><td>'
																		+ dataSet[i].perid
																		+ '</td>'
																		+ '<td>'
																		+ dataSet[i].pernom
																		+ '</td><td>'
																		+ dataSet[i].perapp
																		+ '</td><td>'
																		+ dataSet[i].perapm
																		+ '</td><td>'
																		+ dataSet[i].percel
																		+ '</td><td>'
																		+ dataSet[i].pertel
																		+ '</td><td>'
																		+ dataSet[i].status
																		+ '</td></tr>');
											}

										},

										// código a ejecutar si la petición falla;
										// son pasados como argumentos a la función
										// el objeto de la petición en crudo y código de estatus de la petición
										error : function(xhr, status) {
											alert('Disculpe, existió un problema'
													+ xhr);
										},

									// código a ejecutar sin importar si la petición falló o no
									/*complete : function(xhr, status) {
										alert('Petición realizada');
									}*/
									});

						});

		function savePerson() {
			$.ajax({
				// la URL para la petición
				url : '/EasyGarden/PersonServlet',

				// la información a enviar
				// (también es posible utilizar una cadena de datos)
				data : $("#frmPerson").serialize(),

				// especifica si será una petición POST o GET
				type : 'POST',

				// código a ejecutar si la petición es satisfactoria;
				// la respuesta es pasada como argumento a la función
				success : function(json) {

					alert(json);
				},

				// código a ejecutar si la petición falla;
				// son pasados como argumentos a la función
				// el objeto de la petición en crudo y código de estatus de la petición
				error : function(xhr, status) {
					alert('Disculpe, existió un problema' + xhr);
				},

			// código a ejecutar sin importar si la petición falló o no
			/*complete : function(xhr, status) {
				alert('Petición realizada');
			}*/
			});
		}
	</script>
</body>
</html>