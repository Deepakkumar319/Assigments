package java_day1_assigment;

public class Tshirt {
	String color;
	String material;
	String design;
	Tshirt (String color, String material, String design){
		this.color=color;
		this.material=material;
		this.design=design;
	}
	public void small() {
		System.out.println("T-shirt of size small : "+color+"\t"+material+"\t"+design);
	}
	public void large() {
	System.out.println("T-shirt of size Large : "+color+"\t"+material+"\t"+design);
	}
	public void x_large() {
		System.out.println("T-Shirt of size Extra Large : "+color+"\t"+material+"\t"+design);

	}

	public static void main(String[] args) {
		Tshirt Small =new Tshirt("Blue","polyster","Stripes");
		Tshirt large =new Tshirt("Orange","Khadi","Checks");
		Tshirt x_large =new Tshirt("Black","Cotton","lines");
		
		Small.small();
		large.large();
		x_large.x_large();

	}

}
