package com.htc.Exc2;

public class TestBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike B = new Bike(100,"Honda",80,20,2);
		System.out.println("Current Speed " + B.getCurrentSpeed()+ "  Gear " + B.getCurrentGear());
		B.accelerate(20);
		System.out.println("Accelerate 20 : Speed " + B.getCurrentSpeed()+ "  Gear " + B.getCurrentGear());
		B.applyBreak();
		System.out.println("Applied Brake : Speed " + B.getCurrentSpeed()+ "  Gear " + B.getCurrentGear());
		B.accelerate(40);
		System.out.println("Accelerate 40 : Speed " + B.getCurrentSpeed()+ "  Gear " + B.getCurrentGear());
		B.accelerate(-20);
		System.out.println("Decelerate 20 : Speed " + B.getCurrentSpeed()+ "  Gear " + B.getCurrentGear());
	}

}
