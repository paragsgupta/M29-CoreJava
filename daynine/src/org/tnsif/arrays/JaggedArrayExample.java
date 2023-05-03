package org.tnsif.arrays;

import java.util.Scanner;

public class JaggedArrayExample {

	public static void main(String[] args) {
		// in jagged array inside array size is different
		
		int arr[][]=new int[2][];
		Scanner s=new Scanner(System.in);
		//for 1st block outside array, we take 3 elements
		arr[0]=new int[3];
		
		//for 2nd block outside array, we take 2 elements
		arr[1]=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
