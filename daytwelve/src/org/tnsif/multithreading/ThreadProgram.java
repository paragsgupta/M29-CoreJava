//program to demonstrate thread
package org.tnsif.multithreading;

public class ThreadProgram extends Thread{
	
	
	public  void run()
	{
		System.out.println("Thread is in the running state");
	}
	
	
	
	
	public static void main(String[] args) {

		ThreadProgram t=new ThreadProgram();
		t.start();
		
		
		 /*
		  * if thread is in the starting and running state we can't
		  * start again
		  * */
		//t.start();	<---- this is the second call for thread that we can't
	}

}
