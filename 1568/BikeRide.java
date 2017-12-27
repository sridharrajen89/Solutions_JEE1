/**
 * 
 */
package com.htcinc.weektwo;

import java.util.*;

/**
 * @author Sree
 *
 */

class Bike{
	
	private int bikeRegNo;
  	private String bikeName;
  	private int maxSpeed;
  	private int currentSpeed;
  	private int currentGear;
	/**
	 * @param bikeRegNo
	 * @param bikeName
	 * @param maxSpeed
	 * @param currentSpeed
	 * @param currentGear
	 */
	public Bike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}
	/**
	 * @return the bikeRegNo
	 */
	public int getBikeRegNo() {
		return bikeRegNo;
	}
	/**
	 * @param bikeRegNo the bikeRegNo to set
	 */
	public void setBikeRegNo(int bikeRegNo) {
		this.bikeRegNo = bikeRegNo;
	}
	/**
	 * @return the bikeName
	 */
	public String getBikeName() {
		return bikeName;
	}
	/**
	 * @param bikeName the bikeName to set
	 */
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * @return the currentSpeed
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	/**
	 * @param currentSpeed the currentSpeed to set
	 */
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	/**
	 * @return the currentGear
	 */
	public int getCurrentGear() {
		return currentGear;
	}
	/**
	 * @param currentGear the currentGear to set
	 */
	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bikeRegNo;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bike [bikeRegNo=" + bikeRegNo + ", bikeName=" + bikeName + ", maxSpeed=" + maxSpeed + ", currentSpeed="
				+ currentSpeed + ", currentGear=" + currentGear + "]";
	}
	
	public void applyBreak() {
			setCurrentSpeed(0);
			setCurrentGear(1);
		}

	public void accelerate(int speed) {
			int newSpeed = currentSpeed + speed;
			
			if (newSpeed < 0) 
				setCurrentSpeed(0);
			else if (newSpeed < maxSpeed)
				setCurrentSpeed(newSpeed);
			else
				setCurrentSpeed(maxSpeed);
			
			if (currentSpeed <= 0)
				setCurrentGear(0);
			else if (currentSpeed > 0 && currentSpeed <= 10)
				setCurrentGear(1);
			else if (currentSpeed > 11 && currentSpeed <= 20)
				setCurrentGear(2);
			else if (currentSpeed > 21 && currentSpeed <= 40)
				setCurrentGear(3);
			else if (currentSpeed > 40)
				setCurrentGear(4);
		}
}


public class BikeRide {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike myBike = new Bike (99999,"Kawasaki",140,80,4);
  		System.out.println(myBike);
  		myBike.accelerate(4);
  		System.out.println(myBike);
  		myBike.applyBreak();
  		System.out.println(myBike);
  		myBike.accelerate(-2);
  		System.out.println(myBike);

	}

}
