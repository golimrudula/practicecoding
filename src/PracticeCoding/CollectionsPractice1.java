package PracticeCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice1 {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList();
		
		obj.add("Mrudula");
		obj.add("goli");
		obj.add("jala");
		obj.add("bola");
		
		System.out.println(obj);
		
		obj.remove("Mrudula");
		System.out.println(obj);
		
		ArrayList<String> obj2 = new ArrayList();
		
		obj2.add("vihaan");
		obj2.add("vidhur");
		
		obj.addAll(obj2);
		System.out.println(obj);	
		
		obj.add(03, "anusha");
		
		System.out.println(obj);
		
		obj.clone();
		System.out.println(obj);	
		
		System.out.println(obj.size());
		System.out.println(obj.get(3));
		System.out.println(obj.remove(0));
		System.out.println(obj);
		System.out.println(obj.contains("bola"));
		System.out.println(obj.isEmpty());
		Collections.sort(obj);
		System.out.println(obj);
		
		ArrayList<Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(35);
		System.out.println(al);
		al.add(2, 25);
		System.out.println(al);
		
		ArrayList m = new ArrayList();
		m.add(50);
		m.add("hello");
		m.add(15.5);
		m.add(true);
		System.out.println(m);
		System.out.println(m.get(3));
		m.remove(0);
		System.out.println(m);
		m.set(0, "hi");
		System.out.println(m);
		
		//print elements in array using for loop
		for(int i=0; i<m.size(); i++) {
			System.out.println(m.get(i));
		}
		//print elements in array using for each loop
		for(Object e: m) {
			System.out.println(e);
		}
		
		//print elements using iterator
		
		Iterator it = m.iterator();
		while(it.hasNext()){
			System.out.println(it.next());	
		}
		
		//add group of elements into another empty array list
		
		ArrayList dup = new ArrayList();
		
		ArrayList dup_2 = new ArrayList();
		
		dup_2.add("bolo");
		dup_2.add("call");
		dup_2.add("polo");
		
		System.out.println(dup_2);
		
		dup.addAll(dup_2);
		
		System.out.println(dup);
		
		Collections.sort(dup_2);
		
		
		
		
		
		
		


	


	}

}
