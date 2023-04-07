package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseProgram {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner s=new Scanner (System.in);
		 
		 System.out.println("Enter the age and weight of Donor");
		 
		 int age=s.nextInt();
		 int weight=s.nextInt();
		 
		 if(age>18 && weight>50)
		 {
			 System.out.println("Eligible to donate the blood");
		 }
		 else
		 {
			 System.out.println("Not eligible to donate the blood");
		 }
	}

}
