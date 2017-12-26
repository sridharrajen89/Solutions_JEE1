package com.java.exercise2;

import java.util.ArrayList;
import java.util.Date;

public class ParkedBike extends Bike{
	Date parkedDate;
	Date deParkedDate;
	
	//Constructor
	public ParkedBike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear, Date parkedDate,
			Date deParkedDate) {
		super(bikeRegNo, bikeName, maxSpeed, currentSpeed, currentGear);
		this.parkedDate = parkedDate;
		this.deParkedDate = deParkedDate;
	}

	//Getter and Setter
	public Date getParkedDate() {
		return parkedDate;
	}

	public void setParkedDate(Date parkedDate) {
		this.parkedDate = parkedDate;
	}

	public Date getDeParkedDate() {
		return deParkedDate;
	}

	public void setDeParkedDate(Date deParkedDate) {
		this.deParkedDate = deParkedDate;
	}
	
	//toString

	@Override
	public String toString() {
		return "ParkedBike [parkedDate=" + parkedDate + ", deParkedDate=" + deParkedDate + "]";
	}	

}
