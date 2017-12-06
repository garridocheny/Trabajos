package locurasgeometriarectang;
import java.util.Scanner;

public class locurasgeometriarectang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		
		//Crea un Array
	

		double dbase=0;
		double daltura=0;
		int ix=0;
		double dopera;
		double dperi;
		
		System.out.println("¿Cuántos rectángulos quieres calcular?");
		ix=sc.nextInt();
		
		int irect[] = new int [ix]; 
		
		for (int i = 0; i < irect.length; i++) 
		{
		System.out.println("Agrega una base");
		dbase=sc.nextDouble();
		
		
		System.out.print("Agrega una altura");
		daltura=sc.nextDouble();
		
		 dopera=dbase*daltura;
		 dperi=dbase+dbase+daltura+daltura;
		
		System.out.println("Su área es "+dopera);
		System.out.println("Su perímetro es " +dperi);
	}
	}
}
