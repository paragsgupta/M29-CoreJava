package org.tnsif.arrays;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		
		// Run-time array
		
		System.out.println("Enter the no. of elements: ");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0; i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int itr:arr)
		{
			System.out.println("Array elements are: "+itr);
		}

	}

}
