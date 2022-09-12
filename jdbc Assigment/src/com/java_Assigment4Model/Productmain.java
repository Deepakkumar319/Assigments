package com.java_Assigment4Model;


import java.util.List;

import com.java_Assigment4.DAOimpl.Productimpl;

public class Productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setPrdId(1001);
		p.setPrdName("RoyalEnfield");
		p.setPrdPrice(9000);
			
			Productimpl p1 = new Productimpl();
			List<Product> a1=p1.getdata();
			System.out.println(a1);

	}

}