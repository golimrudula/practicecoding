package Practice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Mrudula";
		int n = str.length();
		for(int i=n; i>0; i--) {
			System.out.print(str.charAt(i-1));
		}

	}

}
