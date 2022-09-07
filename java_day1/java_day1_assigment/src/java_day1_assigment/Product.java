package java_day1_assigment;

public class Product {
	int Product_ID;
	String Product_Name;
	double Product_Price;

	public double Proprice(double Product_Price ) {
		double p= Product_Price *+ Product_Price;
		return p;
				
	}

	public static void main(String[] args) {
		Product p =new Product();
		p.Product_ID=1551;
		p.Product_Name="Fan";
		System.out.println("Product_ID:"+p.Product_ID);
		System.out.println("Product_Name:"+p.Product_Name);
		System.out.println("Gst: \t"+p.Proprice(10));

	}

}
