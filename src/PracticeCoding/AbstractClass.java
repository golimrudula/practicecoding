package PracticeCoding;

public class AbstractClass {

	public static void main(String[] args) {
		B b = new B();
		b.display();
		b.print();
		b.print1();
	}
}
	 abstract class Q {
		int a;
		 
		abstract public void print();
		
		public void print1() {
			System.out.println("hello");
		}
	 }	
	 
		class B extends Q{
			public void display() {
				System.out.println("hi");
			}
				public void print() {

					System.out.println("go");
				}
			
			
			
		}
