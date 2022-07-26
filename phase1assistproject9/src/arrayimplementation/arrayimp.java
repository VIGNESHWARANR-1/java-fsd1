package arrayimplementation;

import java.util.Scanner;

public class arrayimp {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
	    int k;
	    System.out.println("Enter the num:");
	    try (Scanner sc = new Scanner(System.in)) {
			k = sc.nextInt();
		}
	    boolean found = false;
	    for (int n : num) {
	      if (n == k) {
	        found = true;
	        break;
	        }
	    }
	    if(found)
	      System.out.println("The value " + k + " is found.");
	    else
	      System.out.println("The value " + k + " is not found.");
	}

}
