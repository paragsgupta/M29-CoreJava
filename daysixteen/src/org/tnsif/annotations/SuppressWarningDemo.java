package org.tnsif.annotations;
import java.util.Set;
import java.util.TreeSet;
public class SuppressWarningDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s=new TreeSet();
		s.add(12);
		s.add(12);
		s.add("Parag");
		System.out.println(s);
		
	}

}
