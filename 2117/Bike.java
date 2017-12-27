package com.htc.practice.excecises;

import java.util.Date;
import java.util.TreeSet;

import javax.xml.crypto.Data;

public class Bike {
	
	int bikeRegNo;
	String bikeName;
	int maxSpeed;
	int currentSpeed;
	int currentGear;



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



	public Bike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}

	public void applyBreak() {
		currentSpeed=0;
		this.setCurrentGear(1);	
	}
	
	public void accelerate(int speed) {
		if(speed>0) {
			currentSpeed= currentSpeed+speed;
			gearChange(currentSpeed);
		}else {
			currentSpeed = currentSpeed-speed;
			gearChange(currentSpeed);
		}
	}
	
	public void gearChange(int s) {
		if(0<=this.getCurrentSpeed() && this.getCurrentSpeed()<10) {
			this.setCurrentGear(1);			
		}else if(11<=this.getCurrentSpeed() && this.getCurrentSpeed()<20) {
			this.setCurrentGear(2);	
		}else if(21<=this.getCurrentSpeed() && this.getCurrentSpeed()<40) {
			this.setCurrentGear(3);	
		}else {
			this.setCurrentGear(4);	
		}
	}
	
	class ParkedBike{
		Date prakedDate;
		Date deParkedDate;
		
	}
	
	class ParkingStation{
		TreeSet<String> station = new TreeSet<String>();
		
		public TreeSet<String> getStation() {
			return station;
		}
		public void setStation(TreeSet<String> station) {
			this.station = station;
		}
		public ParkingStation(TreeSet<String> station) {
			super();
			this.station = station;
		}
		public void parkBike() {
			station.add(getBikeName());
		}
		public void deParkBike() {
			station.remove(getBikeName());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Bike bike = new Bike(123,"Honda",200,20,2);
	bike.accelerate(20);
	System.out.println("the current speed of bike is"+bike.getCurrentSpeed());
	System.out.println("the current gear of bike is"+bike.getCurrentGear());
	bike.applyBreak();
	System.out.println("After applying break the current speed of bike is"+bike.getCurrentSpeed());
	System.out.println("After applying break the current gear of bike is"+bike.getCurrentGear());

	//park the bike
	//??????????????????????????????????????????????????????????????????????????????????
  
	//ParkingStation PK = new ParkingStation(null);
	
	
	}

}
