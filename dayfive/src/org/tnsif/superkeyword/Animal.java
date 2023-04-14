package org.tnsif.superkeyword;

public class Animal {	
		//Private data members
		public String animalType="wild";
		public int noOfLegs=2;
		
		public void display()
		{
			System.out.println("Animal Type: "+animalType);
			System.out.println("No. of Legs are: "+noOfLegs);
		}
 
		

		@Override
		public String toString() {
			return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
		}

		
}
