package sumofelementinrange;

import java.util.Arrays;
import java.util.Scanner;

public class sumofelm {
	public static void main(String[] args) {
		System.out.println("Enter array size ");
	      try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			  int ar[] = new int [n];
			  int sum = 0;
			  System.out.println("Enter the array elements ");

			  for(int i=0; i<n; i++){
			     ar[i] = s.nextInt();
			     sum = sum +ar[i];
			  }
			  System.out.println("Elements of the array are: "+Arrays.toString(ar));
			  System.out.println("Sum of the elements of the array ::"+sum);
		}

}

}
