package java_day1assigment2;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sadan s=new Sadan(150,500000,"white");
		Ford f = new Ford(33,80000,"black",5000);
		Ford f1 = new Ford(33,9000,"blue",6000);
		System.out.println("Price of sedan Car:₹\t"+s.getSalePrice(10));
		System.out.println("Price of first ford car:₹\t"+f.getSalePrice());
		System.out.println("Price of second ford car:₹\t"+f1.getSalePrice());

	}

}
