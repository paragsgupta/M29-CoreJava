package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopProgram {

	public static void main(String[] args) {
		// while loop
		int i=1;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value of N: ");
		int N=s.nextInt();
		while(i<=N)
		{
			System.out.print(i+" ");
			i++;
		}

	}

}
