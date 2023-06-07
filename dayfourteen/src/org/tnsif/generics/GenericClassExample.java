//Program to demonstrate on Generic class
package org.tnsif.generics;
//Generic Class
class GenericClass<T> {
	
	T x;
	void print(T x)
	{
		this.x=x;
	}
	T accept()
	{
		return x;
	}
}
//driver class
public class GenericClassExample {

	public static void main(String[] args) {
		GenericClass<String>obj=new GenericClass<>();
		obj.print("Parag");
		System.out.println(obj.accept());

	}

}
