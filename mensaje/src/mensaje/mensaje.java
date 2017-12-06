package mensaje;
import java.util.Scanner;

public class mensaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String eseTexto;
		
		System.out.println("Input Data:");
		eseTexto=entrada.next();
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		guiones(eseTexto.length());
		espacios(eseTexto.length());
		guiones(eseTexto.length());
		
		for (int i = 0; i < 20; i++) {
		System.out.print("-");
	}
}

	public static void guiones(int largo) {
		// TODO Auto-generated method stub
		// Es el largo de la caja.
		for (int i = 0; i < largo+2; i++) {
			System.out.print("-");
			System.out.print("_");
		
	}
	public static void espacios(int largo);
	{
		System.out.print("|");
		for (int i=0;1<largo;i++);
		{
			System.out.print("____");
		}
		System.out.println("|");
	}
	public static void mensaje(String);
	{
		System.out.println("|");
		System.out.print(mensaje);
		System.out.println("|");
	}
}
}