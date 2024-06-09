package Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String a="ABA";
		char[] p=a.toCharArray();
		int q=p.length;
		String reverse="";
		for(int i=q-1; i>=0; i--) {
			reverse = reverse+p[i];
		if(a.equalsIgnoreCase(reverse)) {
			System.out.println("given string is a palindrome");
		}
			}
		

	}

}
