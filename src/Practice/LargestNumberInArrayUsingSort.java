package Practice;

import java.util.Arrays;

public class LargestNumberInArrayUsingSort {

	public static void main(String[] args) {
		int arr[]= {25, 96, 35, 42, 10, 15};
		int p=arr.length;
		Arrays.sort(arr);
		System.out.println(arr[p-2]);
		
		
	
}
}


