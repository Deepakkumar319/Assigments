package com.java_day2_Assigmentqn4;

public  abstract class Employee {
	int empid;
	String empName;
	double basicPay;
	int noOfLeaves;

	Employee(int empid, String empName, double basicPay,int noOfLeaves){
		this.empid=empid;
		this.empName=empName;
		this.basicPay=basicPay;
		this.noOfLeaves=noOfLeaves;
	}

	public  abstract double calSalary();


}
