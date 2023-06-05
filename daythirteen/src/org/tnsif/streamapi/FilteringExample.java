//Program to demonstrate on Filtering
package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		//"->"   <--- this is lmbda expression 
		List<String>obj=Arrays.asList("Parag","pawan","abhijeet","Parag");
		obj.stream().filter((i->i.length()>5)).forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().limit(2).forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().skip(2).forEach((i)->System.out.print(i+" "));
		
		
	}

}
