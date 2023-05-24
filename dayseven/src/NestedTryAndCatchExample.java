import java.util.Scanner;

//program to demonstrate on nested try and catch 
//in this we use 

public class NestedTryAndCatchExample {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value os x and y: ");
		
		int x=s.nextInt();
		int y=s.nextInt();
		int arr[]=new int[] {11,22,33};
		
		try 
		{
			try 
			{
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception handled "+e);
			}
			
			try 
			{
				System.out.println(x/y);
			}
			catch(ArithmeticException e) 
			{
				System.out.println("Exception handled "+e);
			}
		
	}
	finally
	{
		System.out.println("Finaly block");
	}
	}
	}