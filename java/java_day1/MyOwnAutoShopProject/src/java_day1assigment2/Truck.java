package java_day1assigment2;

public class Truck extends Car {
	int weight;
	Truck(int Speed,double RegularPrice,String Color,int weight){
		super(Speed,RegularPrice,Color);
		this.weight=weight;
		
	}
	public double  getSalePrice(int weight) {
		if(weight>2000) 
			return 0.1*100;
			else
			return 0.2*200;
		
	}
}
