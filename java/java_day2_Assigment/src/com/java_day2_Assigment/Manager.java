package com.java_day2_Assigment;

class Manager extends Employee{ 
	double MangerSal;
	//Manager(){}
	Manager(int empId,String empName,double empSal){
		super(empId,empName,empSal);
	}
	public double Cal() {
		MangerSal =empSal*20;
		return MangerSal ;

	}
	public void  dispManger() {
		System.out.println("emplyoo id"+empId+"name"+empName);
		System.out.println("Salary of Manager"+MangerSal);
	}

}

