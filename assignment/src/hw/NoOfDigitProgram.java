package hw;

public class NoOfDigitProgram {

	public static void main(String[] args) {
		// 
		int num=12345465, count=0;
		while(num != 0) {
			num = num/10;
			count++;
			
		}
		System.out.println("Number of digit is: "+count);
	}

}
