//Program to demonstrate on Thread life-cycle
package org.tnsif.multithreading;

public class ThreadLifeCycleExample extends Thread{
	public void run()
	{
		/*
		 * Tests if this thread is alive. A thread is alive if it hasbeen started and has not yet died.
Returns:true if this thread is alive; false otherwise.*/
		System.out.println("Is thread alive? : "+this.isAlive());
		int x=0;
		while(x<3) 
		{
			x++;
			System.out.println("X is : "+x);
		}
		try 
		{
			
			sleep(500);
			System.out.println("Is thread alive for sleep? : "+this.isAlive());
		}
		catch (InterruptedException e)
		{
			System.out.println("Thread interrupted.....");
		}
	}
	public static void main(String[] args) {
		
		ThreadLifeCycleExample t=new ThreadLifeCycleExample();
		System.out.println("Before starting a thread: Is thread alive?"+t.isAlive());
		t.start();

	}

}
