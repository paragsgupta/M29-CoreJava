//program to Demonstrate on simple array program
package org.tnsif.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//compile-time declaration
		int arr[]= {12,6,90,67};
		//System.out.println(arr[4]); here we will get error that because it not present in the array
		
		//System.out.println(arr[1]);
		
		
		//for printing all the Array elements
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
		
	}

}
