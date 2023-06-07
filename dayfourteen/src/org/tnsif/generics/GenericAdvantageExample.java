//Program to demonstrate on Generic Advantage
package org.tnsif.generics;
import java.util.ArrayList;
import java.util.List;
public class GenericAdvantageExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//1. Type-Safety
		List<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(15);
		System.out.println(list);
		
		//2. Before Generic, Type-casting is allowed
		@SuppressWarnings("rawtypes")
		ArrayList arr1=new ArrayList();
		arr1.add("St.John");
		System.out.println(arr1);
		String str=(String)arr1.get(0);
		System.out.println(str);
		
		//3. In Generic, Type-casting is not necessary
		ArrayList<String> arr2=new ArrayList<>();
		arr2.add("St.John");
		System.out.println(arr1);
		String str1=arr2.get(0);
		System.out.println(str1);
	}

}
