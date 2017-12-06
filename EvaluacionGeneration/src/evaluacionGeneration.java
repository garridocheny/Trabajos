import java.util.Scanner;

public class evaluacionGeneration {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String snombre;
	String smental;
	String scompo;
	
	int inumero;
	
	int icreci;
	int ipersistencia;
	int iresponsabilidad;
	int ifuturo;
	int icomunicacion;
	int igestion;
	int iequipo;
	int idetalle;
	

	System.out.println("¿Cuál es tu nombre? ");
	snombre=sc.nextLine();
	System.out.println("Reporte de "+snombre);
	
	
	System.out.println("Comencemos con las mentalidades, califica las siguientes preguntas del 1 al 4 ¿Cómo te sientes, respecto a tu Mentalidad de Crecimiento? ");
	icreci=sc.nextInt();
	while(icreci<=0|| icreci>4)
	{
		System.out.println("Comencemos con las mentalidades, califica las siguientes preguntas del 1 al 4 ¿Cómo te sientes, respecto a tu Mentalidad de Crecimiento? ");
		icreci=sc.nextInt();
	}
	System.out.println("¿Persistencia?");
	ipersistencia=sc.nextInt();
	while(ipersistencia<=0|| ipersistencia>4)
	{
		System.out.println("¿Persistencia?");
		ipersistencia=sc.nextInt();
	}
	System.out.println("¿Responsabilidad Personal?");
	iresponsabilidad=sc.nextInt();
	while(iresponsabilidad<=0|| iresponsabilidad>4)
	{
		System.out.println("¿Responsabilidad Personal?");
		iresponsabilidad=sc.nextInt();
	}
	System.out.println("¿Orientación al futuro?");
	ifuturo=sc.nextInt();
	while(ifuturo<=0|| ifuturo>4)
	{
		System.out.println("¿Orientación al futuro?");
		ifuturo=sc.nextInt();
	}
	System.out.println("Continemos con los comportamientos ¿Cómo te sientes respecto a tu Comunicación?");
	icomunicacion=sc.nextInt();
	while(icomunicacion<=0|| icomunicacion>4)
	{
		System.out.println("Continemos con los comportamientos ¿Cómo te sientes respecto a tu Comunicación?");
		icomunicacion=sc.nextInt();
	}
	System.out.println("¿Gestión de Tiempo?");
	igestion=sc.nextInt();
	while(igestion<=0|| igestion>4)
	{
		System.out.println("¿Gestión de Tiempo?");
		igestion=sc.nextInt();
	}
	System.out.println("¿Trabajo en Equipo?");
	iequipo=sc.nextInt();
	while(iequipo<=0|| iequipo>4)
	{
		System.out.println("¿Trabajo en Equipo?");
		iequipo=sc.nextInt();
	}
	System.out.println("¿Orientación al detalle?");
	idetalle=sc.nextInt();	
	while(idetalle<=0|| idetalle>4)
	{
		System.out.println("¿Orientación al detalle?");
		idetalle=sc.nextInt();
	}
	
	
	if (icreci==4)
	{
	    System.out.println("Mentalidad de Crecimiento: 4, Azul");
	}
	else if (icreci==3)
	{
	    System.out.println("Mentalidad de Crecimiento: 3, Verde");
	}
	else if (icreci==2)
	{
	    System.out.println("Mentalidad de Crecimiento: 2, Amarillo");
	}
	else if (icreci==1)
	{
	    System.out.println("Mentalidad de Crecimiento: 1, Rojo");
	}
	
	
	if (ipersistencia==4)
	{
	    System.out.println("Persistencia: 4, Azul");
	}
	else if (ipersistencia==3)
	{
	    System.out.println("Persistencia: 3, Verde");
	}
	else if (ipersistencia==2)
	{
	    System.out.println("Persistencia: 2, Amarillo");
	}
	else if (ipersistencia==1)
	{
	    System.out.println("Persistencia: 1, Rojo");
	}
	
	
	if (iresponsabilidad==4)
	{
	    System.out.println("Responsabilidad Personal: 4, Azul");
	}
	else if (iresponsabilidad==3)
	{
	    System.out.println("Responsabilidad Personal: 3, Verde");
	}
	else if (iresponsabilidad==2)
	{
	    System.out.println("Responsabilidad Personal: 2, Amarillo");
	}
	else if (iresponsabilidad==1)
	{
	    System.out.println("Responsabilidad Personal: 1, Rojo");
	}
	
	
	
	if (ifuturo==4)
	{
	    System.out.println("Orientación al futuro: 4, Azul");
	}
	else if (ifuturo==3)
	{
	    System.out.println("Orientación al futuro: 3, Verde");
	}
	else if (ifuturo==2)
	{
	    System.out.println("Orientación al futuro: 2, Amarillo");
	}
	else if (ifuturo==1)
	{
	    System.out.println("Orientación al futuro: 1, Rojo");
	}
	
	
	if (icomunicacion==4)
	{
	    System.out.println("Comunicación: 4, Azul");
	}
	else if (icomunicacion==3)
	{
	    System.out.println("Comunicación: 3, Verde");
	}
	else if (icomunicacion==2)
	{
	    System.out.println("Comunicación: 2, Amarillo");
	}
	else if (icomunicacion==1)
	{
	    System.out.println("Comunicación: 1, Rojo");
	}
	

	if (igestion==4)
	{
	    System.out.println("Gestión de Tiempo: 4, Azul");
	}
	else if (igestion==3)
	{
	    System.out.println("Gestión de Tiempo: 3, Verde");
	}
	else if (igestion==2)
	{
	    System.out.println("Gestión de Tiempo: 2, Amarillo");
	}
	else if (igestion==1)
	{
	    System.out.println("Gestión de Tiempo: 1, Rojo");
	}
	
	
	if (iequipo==4)
	{
	    System.out.println("Trabajo en Equipo: 4, Azul");
	}
	else if (iequipo==3)
	{
	    System.out.println("Trabajo en Equipo: 3, Verde");
	}
	else if (iequipo==2)
	{
	    System.out.println("Trabajo en Equipo: 2, Amarillo");
	}
	else if (iequipo==1)
	{
	    System.out.println("Trabajo en Equipo: 1, Rojo");
	}
	

	
	if (idetalle==4)
	{
	    System.out.println("Orientación al detalle: 4, Azul");
	}
	else if (idetalle==3)
	{
	    System.out.println("Orientación al detalle: 3, Verde");
	}
	else if (idetalle==2)
	{
	    System.out.println("Orientación al detalle: 2, Amarillo");
	}
	else if (idetalle==1)
	{
	    System.out.println("Orientación al detalle: 1, Rojo");
	}
	else 
	 {
		System.err.println("Por favor, califica con números del 1 al 4");
	 }
	
	
	
	int isuma=icreci+ipersistencia+iresponsabilidad+ifuturo+icomunicacion+igestion+iequipo+idetalle;

	System.out.println("Total: "+isuma);
	
	float fpro=isuma/8;
	
	System.out.println("Promedio: "+fpro);
	
	float fprogene=icreci+ipersistencia+iresponsabilidad+ifuturo;
	
	System.out.println("Promedio Generation (Mentalidades): "+fprogene);
	
	float fprocomp=icomunicacion+igestion+iequipo+idetalle;
	
	System.out.println("Promedio Java(comportamientos): "+fprocomp);
}
}
