package com.htc.dec24;

public class Bike {
	
	private String bikeRegNo;
	private String bikeName;
	private int maxSpeed;
	private int currentSpeed;
	private int currentGear;
	/**
	 * 
	 */
	public Bike() {
		super();
	}
	/**
	 * @param bikeRegNo
	 * @param bikeName
	 * @param maxSpeed
	 * @param currentSpeed
	 * @param currentGear
	 */
	
	public Bike(String bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}
	public String getBikeRegNo() {
		return bikeRegNo;
	}
	public void setBikeRegNo(String bikeRegNo) {
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
		result = prime * result + ((bikeRegNo == null) ? 0 : bikeRegNo.hashCode());
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
		if (bikeRegNo == null) {
			if (other.bikeRegNo != null)
				return false;
		} else if (!bikeRegNo.equals(other.bikeRegNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bike [bikeRegNo=" + bikeRegNo + ", bikeName=" + bikeName + ", maxSpeed=" + maxSpeed + ", currentSpeed="
				+ currentSpeed + ", currentGear=" + currentGear + "]";
	}

	public Bike applyBreak()
	{
		Bike b= new Bike();
		b.setCurrentSpeed(0);
		b.setCurrentGear(1);
		return b;
	}
	
	public Bike accelerate(int speed)
	{
		Bike b = new Bike();
		if(speed < 0)
		{
			int cSpeed = this.currentSpeed+speed;
			b.setCurrentSpeed(cSpeed);
			b.setCurrentGear(this.currentGear-1);
			return b;
		}
		else
		{
			if(speed>0 || speed<10)
				b.setCurrentGear(1);
			    b.setCurrentSpeed(speed);
			if(speed>11 || speed<20)
				b.setCurrentGear(2);
			    b.setCurrentSpeed(speed);
			if(speed>21 || speed<40)
				b.setCurrentGear(3);
			    b.setCurrentSpeed(speed);
			if(speed>40)
				b.setCurrentGear(4);
			    b.setCurrentSpeed(speed);
			return b;
		}
	}
}
