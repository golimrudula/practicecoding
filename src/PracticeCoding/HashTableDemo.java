package PracticeCoding;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable();// capcity is 11 and load factor is 0.75, we can also increase 
		//Hashtable h = new Hashtable(15, (float)0.95);
		//Hashtable<Integer, String> t = new Hashtable();
		
		ht.put(101, "Hello");
		ht.put(102,  "Hi");
		ht.put(103, "How are you");
		ht.put(104,  "good");
		ht.put(105, "had");
		ht.put(105,  "had");
		
		System.out.println(ht.isEmpty());// returns booleanvalue 
		System.out.println(ht.get(ht));
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.entrySet());
		
		Set p= ht.keySet();
		
		Iterator it = p.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Object m: ht.keySet()) {
			System.out.println(m+ " "+ht.get(m));
		
		}
		
		for(Map.Entry entry : ht.entrySet()) {
			System.out.println(entry+ " "+ entry.getValue());
		}
		
		}
	
	
		
		
		
		

	}


