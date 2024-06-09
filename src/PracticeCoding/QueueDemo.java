package PracticeCoding;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add(20);
	    q.add(80);
		q.add(30);//hetrogenous data not allowed
		q.offer(60);//adding elements
		
		System.out.println(q);
		
		System.out.println(q.element());//returns header element and throws exception when queue is empty
		System.out.println(q.peek());
		q.poll();//remove header element
		System.out.println(q);
		q.retainAll(q);
		System.out.println(q);
		
		LinkedList l = new LinkedList();
		l.poll();
		


		

	}

}
