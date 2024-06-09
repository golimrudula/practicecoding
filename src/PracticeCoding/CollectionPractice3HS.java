package PracticeCoding;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionPractice3HS {

	public static void main(String[] args) {
		HashSet hs = new HashSet(100, (float)0.95);// load factor is specified with the datatype as float
		hs.add("mrudula");
		hs.add("123");// supports hetrogenous data	
		hs.add("mrudula");//no duplicates allowed
		hs.add("null");// null values are accepted	
		System.out.println(hs);//insertion order not preserved
		
		for(Object m: hs)// for each loop
		 {
			System.out.println(m);
			
		}		
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet set1 = new HashSet();
		
		HashSet s = new HashSet();
		s.add("as");
		s.add("man");
		s.add("bad");
		
		set1.add("as");
		set1.add("man");
		set1.add("pot");
		
		set1.addAll(s);//union
		System.out.println(set1);
		
		set1.retainAll(s);//intersection
		System.out.println(set1);

		
		System.out.println(set1.containsAll(s));//subset
		

	
	}
	
	
	

	
	
}
