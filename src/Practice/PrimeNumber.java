package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		n = scan.nextInt();
		if(n%2==0) {
			System.out.println("given number is even number");
		}else {
			System.out.println("given number is not prime");
		}

	}

}
