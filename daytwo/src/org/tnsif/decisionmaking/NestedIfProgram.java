package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfProgram {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		if(num>0)
		{
			if(num<0)
			{
				System.out.println("non zero");
			}
			else
			{
				System.out.println("zero");
			}
		}
		else
		{
			System.out.println("either zero / non zero");
		}
	}

}
