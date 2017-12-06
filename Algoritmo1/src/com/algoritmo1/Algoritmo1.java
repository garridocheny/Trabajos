package com.algoritmo1;

import java.util.Scanner;

public class Algoritmo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numero1; //números enteros de aquí
		int numero2;
		short numero3;
		long numero4;   //A aquí
		float numero5;  //Decimales 
		double numero6;  //Decimales.
		boolean isVariable;
		char letra;
		final int numero7= 10;
		
		
		numero1=10;
		numero2=128;
		numero3=129;
		numero4=200;
		
		numero5=0.200f;
		numero6=3.1416;
		isVariable=true;
		letra='x';
		
		System.out.println("El valor de la variable byte es: "+numero1+" genial");
		System.out.println("El valor de la variable int es: "+numero2+" genial");
		System.out.println("El valor de la variable short es: "+numero3+" genial");
		System.out.println("El valor de la variable long es: "+numero4+" genial");
		System.out.println("El valor de la variable float es: "+numero5+" genial");
		System.out.println("El valor de la variable double es: "+numero6+" genial");
		System.out.println("El valor de la variable boolean es: "+isVariable+" genial");
		System.out.println("El valor de la variable char es: "+letra+" genial");
		System.out.println("El valor de la constante es: "+numero7+" genial");
		
		//Declarando objetos.
		String cadena;
		
		//Inicializamos objeto (Instanciar el objeto o concretizar una clase)
		cadena = new String();
		cadena="Stand out";
		
		System.out.println("El valor del objeto String es:"+cadena+" De nuevo genial");
		
	
		int operacion1 = numero1+numero2;
		System.out.println("El valor de la suma es "+operacion1);
		
		
		/////
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("¿Cuántos números quieres sumar?");
		int numero=0;
		int suma=0;
		int numerointroducido=0;
		
		numero= sca.nextInt();
		System.out.println("La cantidad de números a sumar es: "+numero);
		
		for (int i=0;i<numero;i++)
		{
			System.out.println("Digita el numero: ");
			numerointroducido=sca.nextInt();
			suma=suma+numerointroducido;
		}
		System.out.println("La sumatoria de los números es: "+suma);
		
		suma=0;
		numerointroducido=0;
		isVariable=true;
		int contador=1;
		int vueltas=0;
		
		System.out.println("¿Cuántas operaciones?");
		vueltas=sca.nextInt();
		
		while (isVariable)
		{
			System.out.println("Digita el número: ");
			numerointroducido=sca.nextInt();
			suma=suma+numerointroducido;
			contador++;
			if (contador<=vueltas)
			{
				isVariable=false;
			}
			
		}
		System.out.println("La sumatoria de los numeros es: "+suma);
		
		
		suma=0;
		numerointroducido=0;
		isVariable=true;
		contador=0;
		vueltas=0;
		System.out.println("Ingresa la cantidad de números a sumar");
		vueltas=sca.nextInt();
		do
		{
			System.out.println("Agrega los números que quieras sumar");
			numerointroducido=sca.nextInt();
			suma=suma+numerointroducido;
			contador++;
			if (contador>=vueltas)
			{
				isVariable=false;
			}
		}while(isVariable);
		System.out.println("El resultado de la suma es: "+suma);
	}

}
