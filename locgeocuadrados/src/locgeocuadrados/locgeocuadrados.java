package locgeocuadrados;

import java.util.Scanner;

public class locgeocuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		
		//Crea un Array
	

		double dlado=0;
		int ix=0;
		double dopera;
		double dperi;
		
		System.out.println("¿Cuántos cuadrados quieres calcular?");
		ix=sc.nextInt();
		
		int irect[] = new int [ix]; 
		
		for (int i = 0; i < irect.length; i++) 
		{
		System.out.println("Agrega un lado");
		dlado=sc.nextDouble();
		
		 dopera=dlado*dlado;
		 dperi=dlado*4;
		
		System.out.println("Su área es "+dopera);
		System.out.println("Su perímetro es " +dperi);
	}
	}
}
