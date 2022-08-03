package multiplication;

import java.util.Scanner;

public class matrixmultiply {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int m1,n1, m2, n2, sum = 0, i, j, k;
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the No of rows and columns of first matrix");
	      m1 = in.nextInt();//m1=row of matrix 1
	      n1 = in.nextInt();//n1=column of matrix 1
	      int first[][] = new int[m1][n1];
	      System.out.println("Enter elements of first matrix");
	      for (i = 0; i < m1; i++) 
	         for (j = 0; j < n1; j++)
	            first[i][j] = in.nextInt();
	      System.out.println("Enter the No of rows and columns of second matrix");
	      m2 = in.nextInt();//m2=row of matrix 2
	      n2 = in.nextInt();//n2=column of matrix 2
	      if (n1 != m2)
	         System.out.println("The matrices can't be multiplied with each other.");
	      else
	      {
	         int second[][] = new int[m2][n2];
	         System.out.println("Enter elements of second matrix");
	         for (i = 0; i < m2; i++)
	            for (j = 0; j < n2; j++)
	               second[i][j] = in.nextInt();
	         int multiply[][] = new int[m1][n2];
	         for (i = 0; i < m1; i++)
	         {
	            for (j = 0; j < n2; j++)
	            {  
	               for (k = 0; k < m2; k++)
	               {
	                  sum = sum + first[i][k]*second[k][j];
	               }
	               multiply[i][j] = sum;
	               sum = 0;
	            }
	         }
	         System.out.println("Product of the matrices:");
	         for (i = 0; i < m1; i++)
	         {
	            for (j = 0; j < n2; j++)
	               System.out.print(multiply[i][j]+"\t");
	            System.out.print("\n");
	         }
	      }

	}

}
