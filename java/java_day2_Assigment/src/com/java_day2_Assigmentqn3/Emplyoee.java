package com.java_day2_Assigmentqn3;

public class Emplyoee {
	 public static void calSal(int empSal) throws MyempException{
		 if(empSal<100000)
			 throw new MyempException("salary cannot ne less than 100000");
		 else
			 System.out.print("Salary is"+empSal);

	 }
		public static void main(String[] args) throws MyempException {
			// TODO Auto-generated method stub
			calSal(2000);
		}

	}