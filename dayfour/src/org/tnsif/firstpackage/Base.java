package org.tnsif.firstpackage;

public class Base {
	/*
	 declaring all the access specifier with variable
	 */
	int varDefault=10;
	public String varPublic="John";
	private int varPrivate=1221;
	protected float varProtected=34800.50f;
	
	
	/*
	 declaring all the access specifier with method
	 */
	
	void methodDefault()
	{
		System.out.println("Default access method: "+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access method: "+varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access method: "+varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access method: "+varProtected);
	}
	
}






