package com.htc.Exc2;

public class Bike {

	private int bikeRegNo;
	private String bikeName;
	private int maxSpeed;
	private int currentSpeed;
	private int currentGear;
	
	public Bike() {
		super();
		this.bikeRegNo = 0;
		this.bikeName = null;
		this.maxSpeed = 0;
		this.currentSpeed = 0;
		this.currentGear = 0;
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

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}	@Override
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

	public void applyBreak() {
		setCurrentSpeed(0);
		setCurrentGear(0);
	}
	
	public void accelerate(int speed) {
		
	int speed1 = currentSpeed + speed;
	if (speed1 < 0) 
	setCurrentSpeed(0);
	else if (speed1 > maxSpeed)
	setCurrentSpeed(maxSpeed);
	else setCurrentSpeed(speed1);

	if(currentSpeed <= 0)
		setCurrentGear(0);
	else if (currentSpeed > 0 && currentSpeed <= 10)
		setCurrentGear(1);
	else if (currentSpeed > 10 && currentSpeed <= 20)
		setCurrentGear(2);
	else if (currentSpeed > 20 && currentSpeed <= 30)
		setCurrentGear(3);
	else if (currentSpeed > 30 && currentSpeed <= 40)
		setCurrentGear(4);
	}
}
