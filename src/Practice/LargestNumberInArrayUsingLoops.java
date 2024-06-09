package Practice;

public class LargestNumberInArrayUsingLoops {

	public static void main(String[] args) {
		int b[] = { 55, 80, 95, 1, 7, 85, 76 };
		int max = b[0];
		for (int i = 1; i <= b.length - 1; i++) {
			if (b[i] > max) {
				max = b[i];
				
			}	
		}
		System.out.println(max);
	}

}
