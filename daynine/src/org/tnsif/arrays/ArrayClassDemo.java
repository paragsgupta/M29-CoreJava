//Program to demonstrate on Arrays class
package org.tnsif.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		//array initialization
		int array[]= {12,67,54,90,87,40};
		
		//using Arrays class
		System.out.println(Arrays.toString(array));			//"Array." is predefined
		
		//sorting the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
	}

}
