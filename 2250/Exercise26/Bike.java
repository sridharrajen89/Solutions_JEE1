package com.java.exercise2;

public class Bike {

	int bikeRegNo;
	String bikeName;
	int maxSpeed;
	int currentSpeed;
	int currentGear;
	
	//Overloaded constructors
	public Bike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}

	//Getter and Setter
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

	//hashCode and Equals
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

	//toString()
	@Override
	public String toString() {
		return "Bike [bikeRegNo=" + bikeRegNo + ", bikeName=" + bikeName + ", maxSpeed=" + maxSpeed + ", currentSpeed="
				+ currentSpeed + ", currentGear=" + currentGear + "]";
	}
	
	//applyBreak method
	public void applyBreak()
	{
		setCurrentSpeed(0);
		setCurrentGear(1);
	}
	
	//accelerate method
	public void accelerate(int speed)
	{
		if(speed<0)
		{
			setCurrentSpeed(getCurrentSpeed() - speed);
		}else {
			setCurrentSpeed(getCurrentSpeed() + speed);
			if(isBetween(getCurrentSpeed(),0,10)) 
			{
				setCurrentGear(1);
			}else if(isBetween(getCurrentSpeed(),10,20)) 
			{
				setCurrentGear(2);
			}else if(isBetween(getCurrentSpeed(),20,30)) 
			{
				setCurrentGear(3);
			}else if(getCurrentSpeed()>=40)
			{
				setCurrentGear(4);
			}
			
		}

	}

//isBetween method
	public boolean isBetween(int x,int y,int z)
	{
	return y<=x && x<=z;
	}

}
