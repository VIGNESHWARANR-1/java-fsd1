package findelement;

import java.util.Arrays;

public class Fourthshortestelm {
	public static int kthSmallest(Integer[] arr,int k){
		Arrays.sort(arr);
		return arr[k - 1];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 4;
        System.out.print("4'th smallest element is " + kthSmallest(array, k));

	}

}
