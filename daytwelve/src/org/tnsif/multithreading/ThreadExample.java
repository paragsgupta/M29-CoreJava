//program to demonstrate thread
package org.tnsif.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		//returns a reference to the currently executing thread object;
		Thread t=Thread.currentThread();
		System.out.println("Current Thread: "+t);

	}

}

//o/p:Current Thread: Thread[main,5,main]
//threadName | priority | threadName
