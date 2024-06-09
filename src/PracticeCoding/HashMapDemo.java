package PracticeCoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap();
		hs.put(101, "name");// add key and value pair in hashmap
		hs.put(102,  "goli");
		hs.put(103,  "bola");
		hs.put(104,  "good");
		hs.put(106,  "mad");
		hs.put(null, null);//one null key is allowed
	
		
		
		System.out.println(hs.keySet());//retuns all the keys from the hashmap
		System.out.println(hs.values());//retuns all the values form the hashmap
		
		System.out.println(hs.containsKey(104));
		System.out.println(hs.containsKey(109));//retuns true or false
		
		for(Object i:hs.keySet()) {
			
			System.out.println(i+ " "+hs.get(i));
	}
		
		for(Object i: hs.values()) {
			System.out.println(i+" "+hs.get(i));
		}
		
		for (Map.Entry entry: hs.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
			
			
		
			
		}
		
		Set s = hs.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

}
}
