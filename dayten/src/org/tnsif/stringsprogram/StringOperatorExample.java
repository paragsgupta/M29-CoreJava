
//program to demonstrate on string built in function
package org.tnsif.stringsprogram;

import java.util.Scanner;

public class StringOperatorExample {

	public static void main(String[] args) {
		//using new keyword
		//and also cheking inbuilt function
		String str1=new String("Parag");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('g'));
		
		System.out.println(str1.hashCode());
		System.out.println(str1.concat("gupta"));
		System.out.println(str1+"gupta");

	}

}
