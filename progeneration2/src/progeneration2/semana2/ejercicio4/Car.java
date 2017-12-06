package progeneration2.semana2.ejercicio4;

public class Car 
{
	private String sBrand;
	private String sType;
	private int iVelocity;
	public int ibirthyear;
	
	Car(String param1, String param2, int param3) 
	{
		sBrand=param1;
		sType=param2;
		iVelocity=param3;
	}

	
	public String getBrand()
	{
		return sBrand;
	}
	public void setBrand(String param1)
	{
		sBrand=param1;
	}
	public	String getType()
	{
		return sType;
	}
	public void setType(String param2)
	{
		sType=param2;
	}
	public int getVelocity()
	{
		return iVelocity;
	}
	public void setVelocity(int param3)
	{
		iVelocity=param3;
	}
}
