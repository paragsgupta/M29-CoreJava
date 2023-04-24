
//Driver Class

package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingExample m1=new MethodOverloadingExample();
		System.out.println(m1.multiplication(12.5f, 3.0f));
		System.out.println(m1.multiplication(1.5f, 4));
		System.out.println(m1.multiplication(12, 31.0f));
		System.out.println(m1.multiplication(2, 3));
		
	}

}
