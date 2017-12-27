package com.htcinc.oops.day10;

public class Bike {
	
	 private int bikeRegNo;
	 private String bikeName;
	 private int maxSpeed;
	 private int currentSpeed;
	 private int currentGear;
	 
	 public Bike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}

	public Bike(int bikeRegNo, String bikeName, int maxSpeed) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
		this.currentGear = 1;
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

	

	@Override
	public String toString() {
		return "Bike [bikeRegNo=" + bikeRegNo + ", bikeName=" + bikeName + ", maxSpeed=" + maxSpeed + ", currentSpeed="
				+ currentSpeed + ", currentGear=" + currentGear + "]";
	}
	 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bikeRegNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		if (bikeRegNo != other.bikeRegNo)
			return false;
		return true;
	}

	public void applyBreak() {
		 //Reducing currentSpeed to 0 and currentGear to 1  
		this.currentSpeed = 0;
		this.currentGear = 1;	 
	}
	
	public void accelerate(int speed) {
		 /*
		 It should increase or decrease the speed based on the parameter.  
		 (For example if parameter speed is positive number, it should increase 
		 the speed else it should  decrease the speed by parameter value).
		 */ 
		this.currentSpeed=speed;
		
		if (this.currentSpeed >= 0 && this.currentSpeed <= 10)
			this.currentGear=1;
		else if (this.currentSpeed > 11 && this.currentSpeed <= 20)
			this.currentGear=2;
		else if (this.currentSpeed > 21 && this.currentSpeed <= 40)
			this.currentGear=3;
		else if (this.currentSpeed > 40)
			this.currentGear=4;
			 
	}
	 
	 
}
