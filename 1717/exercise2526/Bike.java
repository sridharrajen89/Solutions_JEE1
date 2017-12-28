package com.htc.exercise2526;

public class Bike {
	private int bikeRegNo;
	private String bikeName;
	private int maxSpeed;
	private int currentSpeed;
	private int currentGear;

	public Bike() {
		super();
		this.bikeRegNo = 0;
		this.bikeName = "";
		this.maxSpeed = 0;
		this.currentSpeed = 0;
		this.currentGear = 0;
	}
	
	public int getBikeRegNo() {
		return bikeRegNo;
	}

	public void setBikeRegNo(int bikeRegNo) {
		this.bikeRegNo = bikeRegNo;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public void applyBreak() {
		this.setCurrentSpeed(0);
		this.setCurrentGear(1);

	}
	
	public void accelerate(int speed) {
		int newSpeed = this.currentSpeed + speed;
		if (newSpeed < 0) 
			newSpeed = 0;
		else if (newSpeed > this.maxSpeed)
			newSpeed = this.maxSpeed;
		
		this.setCurrentSpeed(newSpeed);
		
		int gear = newSpeed/10;
		if (gear > 4) 
			gear = 4;
	
		this.setCurrentGear(gear);
	}
}
