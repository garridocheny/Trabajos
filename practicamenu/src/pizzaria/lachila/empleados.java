package pizzaria.lachila;
import java.util.Scanner;


public abstract class empleados {
	Scanner sc = new Scanner(System.in);
	
	private int idEmpleado;
	private String snombre;
	private String sexo;
	
	public int getidEmpleado()
	{
		return idEmpleado;
	}
	public void setidEmpleado(
			int _idEmpleado)
	{
			idEmpleado=_idEmpleado;
	}
	public String getsnombre()
	{
		return getsnombre();
	}
	public void setsnombre(String
			_snombre)
	{
		snombre= _snombre;
	}
	public String getsexo()
	{
		return sexo;
	}
	public void setsexo(String _sexo)
	{
		sexo=  _sexo;
	}
	}

