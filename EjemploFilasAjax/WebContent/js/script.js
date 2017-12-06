/**
 * Ajax para agregar filas
 */

//alert("Script funciona");


var  xhr = new XMLHttpRequest(); // objeto AJAX

// Forma1
document.getElementById('buttonOne').onclick = function(evnt) {

	xhr.open("GET", "index.jsp", true); // la dirección que pedimos
	xhr.onreadystatechange = function()// la función de callback
	{
		if (xhr.readyState == 4 && xhr.status == 200) // 4:la respuesta ha
														// terminado de llegar
		{
			document.getElementById("tcuerpo").innerHTML += "<tr><td>Usuario1</td><td>Apellido</td><td>Correo</td>";
		}

	}
	xhr.send(); // envío de petición
}