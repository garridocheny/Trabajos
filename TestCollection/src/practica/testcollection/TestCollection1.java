package practica.testcollection;
import java.util.ArrayList;
import java.util.Iterator;


public class TestCollection1 extends TestCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Estamos en la pr�ctica 1");
		//Creamos la colecci�n.
		ArrayList<String> list= new ArrayList<String>();
		
		//
		list.add("Testo");
		list.add("TestoNuevamente");
		list.add("Testo otra vez");
		list.add("Testo de �ltima");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
