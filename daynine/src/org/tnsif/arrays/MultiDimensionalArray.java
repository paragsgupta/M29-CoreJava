//Program to demonstrate on multidimensional array
package org.tnsif.arrays;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int arr[][]=new int[2][3];	//(outer loop)2 blocks contains (inner loop)3 values
		Scanner s=new Scanner(System.in);
		
		//for taking the values
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		//for printing
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); //for next line
		}
		

	}

}
