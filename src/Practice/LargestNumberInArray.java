package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArray {//Using Collectins class and ArrayList 

	public static void main(String[] args) {
		int a[] = {12, 15,18,19};
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0; i<a.length; i++) {
			list.add(a[i]);
		}
		System.out.println(Collections.max(list));
			
		
	}
}
