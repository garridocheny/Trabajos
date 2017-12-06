/**
 * 
 */
//alert("Testo");
document.getElementById('btnAcepta').onclick = function (evnt)
{
	var contenidoCajaTexto = document.getElementById('txtUser').value;
	alert(contenidoCajaTexto);
	var datosAEnviar = new FormData();
	datosAEnviar.append('Chalan',contenidoCajaTexto);
	//datosAEnviar.append('Alumno1','Dante');
	//datosAEnviar.append('Alumno2','Karen');
	//datosAEnviar.append('Alumno3','Ana');
	//alert(datosAEnviar);
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function()
	{
		if(xhr.readyState == 4 && xhr.status==200)
		{
			console.log(xhr.responseText);
			document.getElementById('welcometesto').innerHTML = xhr.responseText;
		}
		switch(xhr.readyState)
		{
		case 1:alert("Estado 1");
		break;
		case 2: alert("Estado 2");
		break;
		case 3: alert("Estado 3");
		break;
		case 4: alert("Estado 4 "+xhr.responseText);
		break;
		}
		//alert(xhr.responseText);
	};
	xhr.open('POST','EjemploAjaxServidorServlet',true);
	xhr.send(datosAEnviar);
}