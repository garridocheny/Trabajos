package practica.testcollection;
import java.util.*;


public class Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();
		v.add("Sammy");
		v.addElement("Dante");
		v.addElement("Emmanuel");
		Enumeration e=v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	}

}
