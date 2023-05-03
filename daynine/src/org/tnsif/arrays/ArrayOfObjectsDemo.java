//Program to demonstrate array of object class 
package org.tnsif.arrays;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		//array of customer class
		Customer[] arr=new Customer[2];
		
		arr[0]=new Customer(23456,"Parag");
		arr[1]=new Customer(15465,"Pramod");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}

	}

}
