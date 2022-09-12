package java_day1assigment2;
	public class Sadan extends Car {
		int length;
		Sadan(int Speed,double RegularPrice,String Color){
			super(Speed, RegularPrice, Color);
		}
		public double getSalePrice(int length ) {
			
			if(length > 20)
				
				return super.getSalePrice()-5/100;
			else
				return super.getSalePrice()-10/100;
		}

}
