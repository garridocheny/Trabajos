/**
 * 
 */

//alert("Jojojo");

document.getElementById('btnAcepta').onclick= function (evnt)
{
	//alert("Haz iniciado el fin del Mundo")
	var contenidoCajaTexto = document.getElementById('txtUser').value;
	//alert("Tu nombre es: " +contenidoCajaTexto);
	
	var datosAEnviar = new FormData();
	datosAEnviar.append('Usuario',contenidoCajaTexto);
	
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function()
	{
		if (xhr.readyState ==4 && xhr.status==200)
			{
			console.log(xhr.responseText);
			document.getElementById('welcometesto').innerHTML=xhr.responseText;
			}
	};
	xhr.open('POST','ejemploajaxservletservlet',true);
	xhr.send(datosAEnviar);
}
