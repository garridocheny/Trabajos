package operacionessucesivas;

import java.util.Scanner;

public class multiplicaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
		int imulti = 1;

		System.out.print("ingrese el Numero ");

		int iusuario = sc.nextInt();

		for (int i = iusuario; i>1; i--){

		imulti = imulti * i;
		System.out.print((i)+"x");
		}
		System.out.println("="+imulti);





		}



		}
