package PracticeCoding;

public class GarbageCollector{
	
	public void finalize() {
		System.out.println("collected the unreferenced variable");
		
	}


	public static void main(String[] args) {
		
		GarbageCollector gb1 = new GarbageCollector();
		GarbageCollector gb2 = new GarbageCollector();
		GarbageCollector gb3 = new GarbageCollector();
		
		gb1 = null;//unreferenced object
		
		gb2 =  gb3; //unused object , object gb2 is referenced to gb3, gb3 is unused
		
		new GarbageCollector();// anonymous object 
	
		System.gc();
	
					
		}

	}


