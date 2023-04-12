//driver Class
package org.tnsif.classandobject;

import java.util.Scanner;

public class CunstroctorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int id;
		String city,name;
		
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		
		s.nextLine();
		
		System.out.println("Enter the Customer Name: ");
		name=s.nextLine();
		
		System.out.println("Enter the Customer City: ");
		city=s.nextLine();
		
		//object creation
		Customer c=new Customer();
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		
		//call to toString() method
		System.out.println(c);
		
		//second method to print the data
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		
		s.nextLine();
		
		System.out.println("Enter the Customer Name: ");
		name=s.nextLine();
		
		System.out.println("Enter the Customer City: ");
		city=s.nextLine();
		
		//parameterized method
		Customer c1=new Customer(id,name,city);
		System.out.println(c1);

	}

}
