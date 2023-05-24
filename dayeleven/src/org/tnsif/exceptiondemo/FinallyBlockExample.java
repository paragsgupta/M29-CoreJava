//program to demonstrate finally keyword where it will not execute
package org.tnsif.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		//array declaration and initialization
		int arr[]=new int[] {101, 33, 78};
		System.out.println("Array is: ");
		
		try {
			/*when we call System.exit(0), it means no any further
			 * statement is executed*/
			
//			System.exit(0);
			System.out.println(arr[3]);
			

		}
		catch(Exception e) {
			System.out.println("Exception handled "+e);
			
		}
		finally {
			/*when finally block is contains exception code */
			System.out.println(13/0); // <---- this is an exception code
			System.out.println("Finally Block");
		}

	}

}
