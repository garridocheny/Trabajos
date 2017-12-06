package practica.testcollection;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100, "Jenry");
		hm.put(101, "Fernando");
		hm.put(102, "Karen");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
