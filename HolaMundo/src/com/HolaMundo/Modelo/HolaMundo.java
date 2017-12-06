package com.HolaMundo.Modelo;

public class HolaMundo {
		// TODO Auto-generated method stub
	private String mensajito;
	private String nombre;
	private String apellido;
	private int edad;
	
	public String getmensajito()
	{
		return mensajito;
	}
	
	public void setmensajito( String pmensajito)
	{
		mensajito = pmensajito;
	}
	
	
	public String toString()
	{
		return "Contenido:[mensajito:"+mensajito+", nombre: "+nombre+", Apellido: "+apellido+", edad: "+edad];
	}
	}
}
