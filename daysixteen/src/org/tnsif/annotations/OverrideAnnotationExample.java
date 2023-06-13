package org.tnsif.annotations;
//parent class
class Car
{
	
	public void speed(int speed)
	{
		System.out.println("Speed is : "+speed+"km/hr");
	}
}

//child class
//child class is inheriting the properties of Car class OR parent class

class Lamborghini extends Car
{
	/*below annotation ensures that child class method
	 * is inheriting the properties of parent class */
	@Override
	//it should be speed(int speed)
	//if we do Speed(int speed) it will show an error
	public void speed(int speed)
	{
		System.out.println("Speed is : "+speed+"km/hr");
	}
	
}
public class OverrideAnnotationExample {

	public static void main(String[] args) {
		
		Lamborghini l=new Lamborghini();
		l.speed(90);

	}

}











