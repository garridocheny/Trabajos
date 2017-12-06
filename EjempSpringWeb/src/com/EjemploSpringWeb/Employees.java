package com.EjemploSpringWeb;

public class Employees {
	private int idEmployee;
	private String nameEmployee;
	private String addressEmployee;
	
	public void setidEmployee(int _idEmployee)
	{
		idEmployee=_idEmployee;
	}
	
	public int getidEmployee ()
	{
		return idEmployee;
	}
	
	public void setnameEmployee(String _nameEmployee)
	{
		nameEmployee=_nameEmployee;
	}
	
	public String getnameEmployee ()
	{
		return nameEmployee;
	}
	
	public void setaddressEmployee (String _addressEmployee)
	{
		addressEmployee=_addressEmployee;
	}
	
	public String getaddressEmployee ()
	{
		return addressEmployee;
	}
}
