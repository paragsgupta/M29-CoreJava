//program to demonstrate on Arithmetic Exception
package org.tnsif.exceptiondemo;

import java.util.Scanner;

public class ArithmaticExceptonExample {

	public static void main(String[] args) {

		System.out.println("Enter the value for x and y: ");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//int z=x/y;
		
		//try block contains exception code
		try {
		System.out.println(x/y);
		}
		
		//catch block contains exception handle
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);
		}
		
		finally
		{
			System.out.println("finally block is executed");
		}
		
		

	}

}
