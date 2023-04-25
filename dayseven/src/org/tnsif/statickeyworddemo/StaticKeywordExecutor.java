
//Driver Class
package org.tnsif.statickeyworddemo;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		   System.out.println(Employee.companyName);//without creating the object we will get the output
		   
		   Employee e=new Employee(101,"Shiwani Ma'am");
		   System.out.println(e);
		   
		   Employee e1=new Employee(101,"Parag Gupta");
		   System.out.println(e1);
		   
		   Customer.display();
		   Customer c=new Customer();
		   System.out.println(c);
			
	}

}
