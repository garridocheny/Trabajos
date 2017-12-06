package com.operaciones.modelo;

public class OperacionesMatematias {
	
	private float fnumero1;
	private float fnumero2;
	
	public float getfnumero1()
	{
		return fnumero1;
	}

	public void setfnumero1(float _fnumero1)
	{
		fnumero1=_fnumero1;
	}
	public float getfnumero2()
	{
		return fnumero2;
	}
	public void setfnumero2 (float _fnumero2)
	{
		fnumero2=_fnumero2;
	}
	
	public float sumar()
	{
		return fnumero1+fnumero2;
	}
	public float restar()
	{
		return fnumero1-fnumero2;
	}
	public float dividir()
	{
		return fnumero1/fnumero2;
	}
	public float multiplicar()
			{
		return fnumero1*fnumero2;
			}
	
	
}
