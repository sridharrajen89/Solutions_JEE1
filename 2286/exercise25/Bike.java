package com.java.training.exercise25.bike;

public class Bike {
	
	 private int bikeRegNo;
	 private String bikeName;
	 private int maxSpeed;
	 private int currentSpeed;
	 private int currentGear;
	
	 public Bike() {
		super();
	}
	 
	 public Bike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
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

	@Override
	public String toString() {
		return "Bike [bikeRegNo=" + bikeRegNo + ", bikeName=" + bikeName + ", maxSpeed=" + maxSpeed + ", currentSpeed="
				+ currentSpeed + ", currentGear=" + currentGear + "]";
	}
	 
	 
	public void applyBrake() {
		
		this.setCurrentSpeed(0);
		this.setCurrentGear(1);
	}

	public void accelerate(int speed) throws MaxSpeedLimitReachedException {
		
		if (speed>0)
			{
			currentSpeed = currentSpeed + speed;
			if (currentSpeed>120)
				throw new MaxSpeedLimitReachedException("Bike Maximum Speed Limit Reached");
			}
		else
		{
			currentSpeed =currentSpeed - speed;
		}
		
		if(this.currentSpeed<=10 ) {
			this.setCurrentGear(1);
			}
		else if(this.currentSpeed <= 20) {
			this.setCurrentGear(2);
		}
			
		else if(this.currentSpeed <= 40) {
			this.setCurrentGear(3);
		}
		else if(this.currentSpeed > 40) {
			this.setCurrentGear(4);
		}
	}
	
	
	
}
