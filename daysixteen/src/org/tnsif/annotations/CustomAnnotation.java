package org.tnsif.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//this is the custom annotation
//in this method used elements is by default abstract
//here we can not create object for any interface
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom
{
	//abstract method
	String print();
	float percentage();
}
class implementableClass
{
	@Custom(print="Parag", percentage=72.96f)
	public void display()
	{
		System.out.println("Hey, welcome to TNS program!!!");
	}
}

//Driver class
public class CustomAnnotation {

	public static void main(String[] args) throws Exception, SecurityException {
		
		implementableClass i=new implementableClass();
		i.display();
		
		//there is one method class 
		
		Method m=i.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.percentage());
		

	}

}
