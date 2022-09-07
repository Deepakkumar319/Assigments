package java_day1assigment2;

public class Car {
	int Speed;
	double RegularPrice;  
	String Color;
	
	public Car(int Speed, double RegularPrice, String Color){
		this.Speed=Speed;
		this.RegularPrice=RegularPrice;
		this.Color=Color;
	}
	
	public double getSalePrice() {
		return RegularPrice ;
		}

}
