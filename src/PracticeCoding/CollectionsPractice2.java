package PracticeCoding;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsPractice2 {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(0, "StudentName");
		l.add(1, "Age");
		l.add(2, "rollno");
		l.add(3, "address");
		System.out.println(l);
		
		l.addFirst("honey");
		l.addLast("bread");
		System.out.println(l);
		
		l.getFirst();
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.remove(0));
		System.out.println(l);
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

 		

	}

}
