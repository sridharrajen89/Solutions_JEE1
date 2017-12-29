package test.com;

import java.util.*;


public class Bike {
	private int bikeRegNo;
	private String bikeName;
	private int maxSpeed;
	private int currentSpeed;
	private int currentGear;

//default constructor
	public Bike() {
		this.bikeRegNo = 0;
		this.bikeName = "NULL";
		this.maxSpeed = 0;
		this.currentSpeed = 0;
		this.currentGear = 0;
		
	}	
//overloaded constructor
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
	public String getBikeName() {
		return bikeName;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public int getCurrentGear() {
		return currentGear;
	}
	public void setBikeRegNo(int bikeRegNo) {
		this.bikeRegNo = bikeRegNo;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bikeName == null) ? 0 : bikeName.hashCode());
		result = prime * result + bikeRegNo;
		result = prime * result + currentGear;
		result = prime * result + currentSpeed;
		result = prime * result + maxSpeed;
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
		if (bikeName == null) {
			if (other.bikeName != null)
				return false;
		} else if (!bikeName.equals(other.bikeName))
			return false;
		if (bikeRegNo != other.bikeRegNo)
			return false;
		if (currentGear != other.currentGear)
			return false;
		if (currentSpeed != other.currentSpeed)
			return false;
		if (maxSpeed != other.maxSpeed)
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
		setCurrentGear(1);
		
			
	}
	
	public void accelerate (int speed) {
		
		int newSpeed=currentSpeed + speed;
		
		setCurrentSpeed(newSpeed);
		
		if (currentSpeed<=0)
			setCurrentGear(0);
		else if (currentSpeed>0 && currentSpeed<=10) 
			setCurrentGear(1);
		else if (currentSpeed>10 && currentSpeed<=20)
			setCurrentGear(2);
		else if (currentSpeed>20 && currentSpeed<=40)
			setCurrentGear(3);
		else if (currentSpeed>40)
			setCurrentGear(4);
		
		
	}
}
		


