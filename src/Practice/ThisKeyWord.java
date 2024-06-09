package Practice;

class Parent {
	
	int x =10;
	
	public void A() {
	 int x =20;
	 System.out.println(x);
	}	
	
	public void B() {
		int y=10;
		System.out.println(y);
	}
}	
   class Child extends Parent{
	  
	  public void C() {
		  int k=10;
		  System.out.println(k);
	  }
	   public void D() {
		  int m=10;
		  System.out.println(m);
	  }
  } 
  public class ThisKeyWord{
	  
	  public static void main(String[] args) {
		  
		  Child c= new Child();
		  c.A();
		  c.B();
		  c.C();
		  c.D();
	  }
  }

