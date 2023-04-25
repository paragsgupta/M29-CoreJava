
/*
 *program to demonstrate static block and static method
 */
package org.tnsif.statickeyworddemo;

public class Customer {
	
	//non-static data member
	private String name;
	
	//static data member
	
	private int custId;
	
	private static String companyName;	
	
	//static block
	//static block is used to initialize static variable only
	static
	{
		//we can not use non-static variable inside the static block
		
		//name="Parag";
		
		companyName="Myntra";
	}

	public Customer() {
		System.out.println("Default Constructor");
		custId++;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}
	
	static void display()
	{
		System.out.println(" Companyname: "+companyName);
	}
	
	
	
	
}






