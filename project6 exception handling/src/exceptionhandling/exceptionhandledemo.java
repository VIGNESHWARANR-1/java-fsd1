package exceptionhandling;

import java.util.Scanner;

public class exceptionhandledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter first num :");
			int a =sc.nextInt();
			System.out.println("enter second num :");
			int b =sc.nextInt();
			int result = a/b;
			System.out.println(result);
		}catch(ArithmeticException ae) {
			System.out.println("enter valid input");
		}	

	}

}
