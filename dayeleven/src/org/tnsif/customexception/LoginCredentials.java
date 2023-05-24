//program to demonstrate on custom exception
package org.tnsif.customexception;

//to create a custom exception we need to extend an exception class
@SuppressWarnings("serial")
public class LoginCredentials extends Exception {
	
	private String str1;

	//parameterized constructor
	public LoginCredentials(String str1) {
		super();
		this.str1 = str1;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str1=" + str1 + "]";
	}
	
	
	
	
}
