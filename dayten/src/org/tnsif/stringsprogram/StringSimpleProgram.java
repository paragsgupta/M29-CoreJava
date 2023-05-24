package org.tnsif.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		//using string literal
		String str1="Parag";
		System.out.println("Using string literal: "+str1);
		
		//using new keyword
		String str2=new String("Parag");
		System.out.println("Usinf new keyword: "+str2);
		
		/*when the string is created using new keyword and both
		 *  the string are same it will create a memory for that
		 *  string and hence using == we will get it as different(false)*/
		
		/*in equals to method it will check the both contents not the memory*/
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str2));
		
		String str3=pawan
		System.out.println();
	}

}
