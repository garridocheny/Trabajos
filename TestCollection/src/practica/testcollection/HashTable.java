package practica.testcollection;
import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		
		hm.put(100, "Gerardo");
		hm.put(102, "Ale");
		hm.put(101, "Kako");
		hm.put(103, "Ana");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.print(m.getKey()+""+m.getValue());
		}
	}

}
