//program to demonstrate on custom exception

package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		try {
		if(id.equals("paragsgupta")&&password.equals("pass123"))
		{
			System.out.println("Credentials Matched!");
		}
		else
		{
			throw new LoginCredentials("invalid credential");
		}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception handled");
		}

	}

}
