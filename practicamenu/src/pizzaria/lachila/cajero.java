package pizzaria.lachila;

import java.util.Date;

public class cajero {
	private int idcaja;
	ventas ventascajero= new ventas();
	
	public int getidcaja()
	{
		return idcaja;
	}
	
	public void setidcaja(int _idcaja)
	{
		idcaja= _idcaja;
	}
	
	public void setventascajero(
			int _folio, 
			Date _fecha,
			double _monto)
	{
	ventascajero.setifolio(_folio);
	ventascajero.setfecha(_fecha);
	ventascajero.setdmonto(_monto);
	}
	
	public ventas getventascajero()
	{
		return ventascajero;
	}
}
