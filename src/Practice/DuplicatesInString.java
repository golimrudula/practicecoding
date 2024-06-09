package Practice;

public class DuplicatesInString {

	public static void main(String[] args) {
		String str ="MMRuDuLAGOOLIL";
		char[] p =str.toCharArray();
		int g=p.length;
		int count =0;
		System.out.println("duplicate letters are");
		for(int i= 0; i<g; i++) {
			for (int j=i+1; j<g; j++) {
				if(p[i]==p[j]) {
								System.out.print(p[j]);
								

				}				

				
			}			

		}

	}

}
