package org.tnsif.stringsprogram;

public class StringBufferExample {

	public static void main(String[] args) {
		//
		StringBuffer str1=new StringBuffer("");
		System.out.println(str1.capacity()); //by default empty string length size is 16
		
		StringBuffer str2=new StringBuffer("Parag");
		System.out.println(str2.capacity()); //by default length + string length
		
		System.out.println(str2.charAt(2));

	}

}
