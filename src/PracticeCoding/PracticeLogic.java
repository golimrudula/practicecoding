package PracticeCoding;

import java.util.Scanner;

public class PracticeLogic {
	public static void main(String[] args) {
		
		String name = "Mrudula";
		int n= name.length();
		for(int i=n; i>0; i--) {
			System.out.print(name.charAt(i-1));
		}
	}
}


