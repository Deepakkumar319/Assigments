package com.java_day2_Assigment;

public class EmpMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester T =new Tester(121,"Likhit",3000);
		Manager e1 = new Manager(122,"Ram",333);
		Developer d= new Developer(123,"Vinay",2000);
		e1.Cal();
		e1.dispManger();
		d.devSalary();
		d.disDev();
		T.salCal(1000);
		T.display();

		}

}
