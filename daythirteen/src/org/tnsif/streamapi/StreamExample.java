//Program to demonstrate on stream API
package org.tnsif.streamapi;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//Stream<> <--- wrapper class object
		Stream<Integer>s1=Stream.of(11,28,78,90);
		//System.out.println(s1);
		s1.forEach((i)->System.out.print(i+" "));// forEach() <--- it is like a enhanced for loop
		
	}

}
