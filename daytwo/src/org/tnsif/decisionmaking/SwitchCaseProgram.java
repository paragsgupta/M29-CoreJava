package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter song input");
		int songInput=s.nextInt();
		
		switch(songInput)
		{
		case 1:
			System.out.println("Calm Down");
			break;
		case 2:
			System.out.println("Perfect");
			break;
		case 3:
			System.out.println("Let me Down Slowly");
			break;
		case 4:
			System.out.println("Mallem Song");
			break;
		default:
			System.out.println("Oops! Invalid Input");
			
		}
		
	}

}
