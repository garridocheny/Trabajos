/**
 * 
 */

	var xhr = new XMLHttpRequest();  //objeto AJAX

	//Forma1
	document.getElementById('buttonOne').onclick = function(evnt)
		
		{
	
	xhr.open("GET", 'data/usuarios.xml', true); //la dirección que pedimos
	xhr.onreadystatechange = function() // la función
		{
		if (xhr.readyState == 4 && xhr.status==200) //4:la respuesta ha terminado de llegar
			{
			document.getElementById('resultado_ajax').innerHTML = xhr.responseText;
			}
		}
xhr.send();

}