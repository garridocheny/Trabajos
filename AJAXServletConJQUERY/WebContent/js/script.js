/**
 * 
 */

alert("Puedes hacerlo");

document.getElementById('btnAceptaTesto').onclick = function(evnt) {
	var xhr = new XMLHttpRequest();
	var contenidoCajaTexto = document.getElementById("txtTesto");

	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			document.getElementById("testoBienvenida").innerHTML = "Eres &eacuteste don (o do&ntildea): " + contenidoCajaTexto.value + "</br>" + xhr.responseText;
		}
	}
	xhr.open("POST", "data/data.json", true);
	xhr.send();
}