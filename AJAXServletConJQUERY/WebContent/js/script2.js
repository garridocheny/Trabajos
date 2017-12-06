/**
 * 
 */

alert("Puedes hacerlo2");

$(document).ready(function()
		{
				$('#btnAceptaTesto').click(function()
						{
							alert("Entro al boton");
							var contenidoCajaTexto= $('#txtTesto').val();
							alert("Contenido de la caja de Texto: "+contenidoCajaTexto);
							
						/*	$.getJSON("data/data.json", function(data)
									{
								$('#testoBienvenida').html("Resultados:"+data.pokemon[0].nombre);
									});*/
							
							$.ajax
							({
								type:'POST',
								data:{contenidoCajaTexto:contenidoCajaTexto},
								url : 'data/data.json',
								success: function(data)
								{
									$('#testoBienvenida').html("Resultados: "+data.pokemon[3].nombre);
								},
								error: function(result2)
								{
									$('#testoBienvenida').html("Dio error");
								}
							});
						});
		});
		