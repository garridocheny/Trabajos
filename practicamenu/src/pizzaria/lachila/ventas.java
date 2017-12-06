package pizzaria.lachila;
import java.util.Date;


public class ventas {

		private int ifolio;
		private Date fecha;
		private double dmonto;
		
		public int getifolio()
		{
			return ifolio;
		}
		public void setifolio (
				int _ifolio)
		{
			ifolio=_ifolio;
		}
		public Date getfecha()
		{
			return fecha;
		}
		public void setfecha(
				Date _fecha)
		{
			fecha = _fecha;
		}
		public double getdmonto()
		{
			return dmonto;
		}
		public void setdmonto(
				double _dmonto)
		{
			dmonto=_dmonto;
		}

}
