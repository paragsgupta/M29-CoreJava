//Program to demonstrate nested Interface
/*Nested interface is an interface , there will be an another interface*/

package org.tnsif.interfacedemo;

public interface OuterInterface {
	
	int sum();
	
	interface InnerInterface{
		String concate();
	}

}
