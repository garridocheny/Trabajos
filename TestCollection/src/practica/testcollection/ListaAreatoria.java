package practica.testcollection;
import java.util.*;

public class ListaAreatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ListaAleatorios = new ArrayList<Integer>();
		
		Random numeroAleatorio = new Random();
		numeroAleatorio.setSeed(38765);
		
		for (int i = 0; i < 5; i++) 
		{	
			ListaAleatorios.add(numeroAleatorio.nextInt(100));	
		}
			Iterator iterator = ListaAleatorios.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		//iterator = ListaAleatorios.iterator();
		for(Integer entero:ListaAleatorios)
		{
			System.out.println(entero);
		}
	
	}
}


