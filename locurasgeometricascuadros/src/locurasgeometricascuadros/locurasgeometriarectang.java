package locurasgeometricascuadros;
import java.util.Scanner;

public class locurasgeometriarectang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		
		//Crea un Array
	

		double dlado=0;
		int ix=0;
		double dopera=dlado*dlado;
		double dperi=dlado+dlado+dlado+dlado;
		
		System.out.println("¿Cuántos cuadrados quieres calcular?");
		ix=sc.nextInt();
		
		int irect[] = new int [ix]; 
		
		for (int i = 0; i < irect.length; i++) 
		{
		System.out.println("Agrega un lado");
		dlado=sc.nextDouble();
		
		
		System.out.println("Su área es "+dopera);
		System.out.println("Su perímetro es " +dperi);
	}
	}
}
