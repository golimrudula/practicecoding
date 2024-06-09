package PracticeCoding;

public class Test1 {

	public static void main(String[] args) {
		M obj = new M();
		obj.display2();
		obj.display5();
		obj.display3();
	}
}	
	class P{
		int a=10;
		void display5() {
			System.out.println(a);
	}
	 void display4() {
		 System.out.println("hello");
	 }
	 
	 }
	class M extends P{
		
		int a=20;
		void display2() {
			System.out.println(super.a);
			super.display4();
		}
		void display3() {
			System.out.println("hello");
			
		}	
	}


