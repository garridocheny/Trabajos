package pizzaria.lachila;
import java.util.*;

public class lachilapp {
	public static cocinero[] cocineros = new cocinero[20];
	public static int qcocineros=0;
	
	public static void main(String[] args) {
		menuprincipal();
	}
		

	public static void menuprincipal() 
	{
		Scanner entrada = new Scanner(System.in);
	byte respuesta;
	
	
	do
	{
		System.out.println("1. Agregar empleado.");
		System.out.println("2. Eliminar empleado.");
		System.out.println("3. Modificar empleado");
		System.out.println("4. Salir");
	respuesta = entrada.nextByte();
	switch(respuesta)
	{
		case 1: System.out.println("Señeccionaste Agregagar Empleados");
		menuagregarEmpleados();
		break;
		case 2: System.out.println("Señeccionaste eliminar");
		mostrarempleado();
		break;
		case 3: System.out.println("Señeccionaste modificar");
		break;
		case 4: System.out.println("Salir");
		break;
	}
	}while(respuesta<4);
	}
	public static void menuempleados(){
		

	Scanner entrada = new Scanner(System.in);
	byte respuesta;
	do
	{
		System.out.println("1. Administrar Empleados.");
		System.out.println("2. Admin ventas.");
		System.out.println("3. Admin Pizzas");
		System.out.println("4. Salir");
		respuesta = entrada.nextByte();
		switch(respuesta)
		{
			case 1: System.out.println("Seleccionaste administrar Empleados");
			 menuagregarEmpleados();
			break;
			case 2: System.out.println("Seleccionaste administrar ventas");
			break;
			case 3: System.out.println("Seleccionaste administrar pizzas");
			break;
			case 4: System.out.println("Seleccionaste salir");
			break;
		}
		}while(respuesta<4);
	}
	public static void menuagregarEmpleados() 
	{
		Scanner entrada = new Scanner(System.in);
	byte respuesta;
	do
	{
		System.out.println("1. Agregar Cocineros.");
		System.out.println("2. Agregar Cajeros.");
		System.out.println("3. Agregar Repartidor");
		System.out.println("4. Salir");
	respuesta = entrada.nextByte();
	switch(respuesta)
	{
		case 1: agregarcocinero();
		break;
		case 2: System.out.println("Cajeros");
		break;
		case 3: System.out.println("Repartidor");
		break;
		case 4: System.out.println("Salir");
		break;
	}
	}while(respuesta<4);
	}
	public static void agregarcocinero()
	{
		Scanner entrada= new Scanner(System.in);
		cocineros[qcocineros]= new cocinero();
		System.out.println("Introduce el ID del cocinero");
		cocineros[qcocineros].setidEmpleado(entrada.nextInt());
		System.out.println("Introduce el nombre");
		cocineros[qcocineros].setsnombre(entrada.next());
		System.out.println("¿Qué género?");
		cocineros[qcocineros].setsexo(entrada.next());
		
		qcocineros++;
	}
	
	public static void mostrarempleado()
	{
		for (int i=0; i<qcocineros; i++)
		{
			System.out.println("empleado: ");
			System.out.println(cocineros[i].getidEmpleado());
			System.out.println("Nombre: ");
			System.out.println(cocineros[i].getsnombre());
			System.out.println("Sexo: ");
			System.out.println(cocineros[i].getsexo());
		}
	}
}