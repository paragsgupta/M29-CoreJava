//Program to demonstrate on Map operation
package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {
		//using collection
		List<String>obj=Arrays.asList("Parag","pawan","abhijeet");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));

	}

}
