/**
 * 
 */

alert("Scprit 5")

document.getElementById('btnAceptaTesto').onclick = function(evnt){
	var xhr = new XMLHttpRequest();
	var cajaDelIndex5 = document.getElementById("txtTesto");
	
	xhr.onreadystatechange = function(){
		if (xhr.readyState == 4 && xhr.status == 200){
			document.getElementById("testoBienvenida").innerHTML = "Tu texto es: "+cajaDelIndex5.value+"</br>"+xhr.responseText;
	}
	}
	xhr.open("POST","data/data.json",true);
	xhr.send();
}