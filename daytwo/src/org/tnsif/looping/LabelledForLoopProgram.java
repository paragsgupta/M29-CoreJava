//Program to demonstrate label for loop
package org.tnsif.looping;

public class LabelledForLoopProgram {

	public static void main(String[] args) {
		//label name it can be any name
		outer:				
			for(int i=1; i<=5; i++)
			{
				System.out.println();
				//label name it can be any name
				inner:
					for(int j=1; j<=5; j++)
					{
						if(j==4)
							continue;
						
						System.out.print(j+" ");
					}
			}
		

	}

}
