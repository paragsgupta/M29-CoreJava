package org.tnsif.statickeyworddemo;

public class Employee {
	//to save memory (reduce redundancy)
	//non-static private data members
	private int empID;
	private String empName;
	
	//static data member
	static String companyName="TND India Foundation";
	
	//parameterized constructor
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	

}
