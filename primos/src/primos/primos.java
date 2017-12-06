package primos;
import java.util.Scanner;

public class primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean boolprimo=true;
		
		System.out.println("Ingresa un número y te diré si es primo");
		int iusuario=sc.nextInt();
		
		if (iusuario%2!=0 || iusuario==2)
		{
			boolprimo=true;
			System.out.println("Es primo juju");
		}
		else 
		{
			System.out.println("No es primo jojo");
		}
			
	}

}
