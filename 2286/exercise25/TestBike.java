package com.java.training.exercise25.bike;

public class TestBike {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		try 
		{
		bike.setBikeRegNo(101);
		bike.setBikeName("Passion");
		bike.setCurrentSpeed(1);
		bike.setCurrentGear(2);
		bike.accelerate(21);
		System.out.println("Current Speed  " + bike.getCurrentSpeed()+ " Gear:" + bike.getCurrentGear());
		bike.applyBrake();
		System.out.println("Speed after Brake  "+ bike.getCurrentSpeed()+ " Gear:" + bike.getCurrentGear());
		}
		catch(MaxSpeedLimitReachedException maxSpeed)
		{
			System.out.println(maxSpeed.getERROR_MSG());
		}
		finally
		{
			bike = null;
		}
		
	}

}
