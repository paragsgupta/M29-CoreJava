//program to demonstrate on object class
package org.tnsif.objectclassdemo;

class Sample
{
	
}
class Demo
{	
	//this is the Constructor
	Demo()
	{	
		//we have allocate the resource
		System.out.println("Inside Constructor");
	}
	
	protected void finalize();
	{
		System.out.println("In finalize method");
	}
}



public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		
		Demo d=new Demo();
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		
		Object obj=new Object();
		System.out.println(obj.getClass());
	}

}
