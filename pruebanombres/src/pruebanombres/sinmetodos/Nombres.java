package pruebanombres.sinmetodos;

import java.io.*;
import java.util.*;


public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada;
		entrada = new Scanner
				(System.in);
		int  nNames=0;
		ArrayList<String> lstNames = new ArrayList<String>();
		
		System.out.println("How Many names you want to introduce? ");
		nNames=entrada.nextInt();
		
		for (int i =0; i<nNames; i++) 
		{
			System.out.println("Input a name: ");
			lstNames.add(entrada.next());
		}
		
		System.out.println(lstNames);
		Iterator contador = lstNames.iterator();
		
		while(contador.hasNext())
		{
			System.out.print(contador.next()+" ");
		}
		
		entrada.close();
		contador=null;
		lstNames = null;
	}

}
