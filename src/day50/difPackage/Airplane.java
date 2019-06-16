package day50.difPackage;

import day50.Vehicle;

public class Airplane extends Vehicle{
	
		int wingCount;
		public static void main (String[] args) {
			Airplane a1=new Airplane("boeing", "737", 2020,4);
			System.out.println(a1);
		}
		
		public Airplane(String brand,String model,int year,int wingCount) {
			//super();//this does not work 
			//we already have functionality to set these 3 fields value
			//so we are just using super class constructor to set these value
			super(brand,model,year);
			//could we have done it without super
			setBrand(brand);		this.setModel(model);		this.year=year;			
			this.wingCount = wingCount;
			Vehicle v1=new Vehicle("f35", "730", 2021);
			System.out.println(v1);
			
			
		}
		public int getWingCount() {
			return wingCount;
		}
		public void setWingCount(int wingCount) {
			this.wingCount = wingCount;
		}
		@Override
		public String toString() {
			return "Airplane [wingCount=" + wingCount + ", year=" + year + ", Brand()=" + getBrand() + ", Model()="
					+ getModel() + "]";
		}

}
