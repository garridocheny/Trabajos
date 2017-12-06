package locurasgeometriatriang;

import java.util.Scanner;

public class locurasgeometriatriang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//PArte 2 Triángulos
		
		double dbase;
		double daltura;
		
		System.out.println("Introduce la base de un triángulo");
		dbase=sc.nextDouble();
		
		System.out.println("Introduce la altura");
		daltura=sc.nextDouble();
		

		double dopera=(dbase*daltura)/2;
		
		System.out.println("Su área es "+dopera);

	}

}
