//program to demonstrate on user-input value
package org.tnsif.userinputdemo;
import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter your Salary: ");
		float salary=s.nextFloat();
//		double salary=s.nextDouble();
		
		System.out.print("Enter your Name: ");
		String name=s.next();
		s.nextLine(); //To print whole sentence
		
		System.out.print("Enter your Name1: ");
		String name1=s.nextLine();
		
		System.out.print("Enter your Character: ");
		char ch=s.next().charAt(1);
		
		System.out.println("Salary is : "+salary);
		System.out.println("Name is : "+name);
		System.out.println("Name1 is : "+name1);
		System.out.println("Character is : "+ch);
		s.close();
	}

}
