package com.htc.dec24;

public class BikeTest {

	public static void main(String[] args) 
	{
		Bike b = new Bike("AP09 CW 4454","TVS JUPITER",100,40,2);
		Bike b1 = b.applyBreak();
		System.out.println("Bike current speed is: " +b1.getCurrentSpeed());
		System.out.println("Bike current gear is: " +b1.getCurrentGear());
		Bike b2=b.accelerate(-5);
		System.out.println("Bike current speed is: " +b2.getCurrentSpeed());
		System.out.println("Bike current gear is: " +b2.getCurrentGear());
		
	}

}
