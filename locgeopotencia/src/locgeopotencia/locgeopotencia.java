package locgeopotencia;
import java.util.Scanner;

public class locgeopotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner(System.in);
		
		boolean boolstop=false;
		
		do
		{
		int n, base;
		System.out.println("Ingrese el número base: ");
		base = datos.nextInt();
		System.out.println("Ingrese el número exponente");
		n = datos.nextInt();
		int resultado = (int) Math.pow(base, n);
		System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
		System.out.println("¿Quieres juegar otra vez? ");
		String scontinue = datos.nextLine();
		if (scontinue.equals("no"));
			{	
				boolstop=true;
			}
		}
		while (!boolstop==true);
	}
	
}


	

