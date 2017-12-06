package com.algoritmo1;

import java.util.Scanner;

public class Multiplosde5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i=0;
		int suma=0;
		int cantidadcincos = 0;
		
		for (i=0; i<=100 ; i++);
		{
			System.out.println(i);
			
			if (i%5==0);
			{
				suma=suma+i;
				cantidadcincos=cantidadcincos+i;
			}
		}
		System.out.println("La suma de los cinco es: "+suma);
		System.out.println("La cantidad de cincos es: "+cantidadcincos);
		boolean isprimo=true;
		int numerointroducido2=0;
		
		
			// Algoritmo número primo.
		
		Scanner sca= new Scanner(System.in);
		
		System.out.println("Ve si un numero es primo: ");
		numerointroducido2=sca.nextInt();
		
		for (i=2;i<numerointroducido2 ;i++)
		{
			if(numerointroducido2%i==0)
			{
				isprimo=false;
			}
			if (isprimo=false)
			{
				System.out.println("No es primo"+isprimo);
			}
			
		}
		if(isprimo=true)
		{
			System.out.println("Es primo en número"+isprimo);
		}
	}
}
