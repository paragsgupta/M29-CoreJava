package org.tnsif.methodoverriding;

public class RBI {
	public float getInterestRate() 
	{
		
		return 8.3f;
	
	}
}

//child class
class HDFC extends RBI {
	public float getInterestRate()//zero parameter passed 
	{
		System.out.println(super.getInterestRate());
		return 12.5f;
	
	}

}