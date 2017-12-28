package com.htc.exercise2526;

import java.util.ArrayList;
import java.util.Date;

public class ParkingStation {
	private ArrayList<ParkedBike> parkedBikes =new ArrayList<ParkedBike>();
	private int parkingTicketNo;

	public ArrayList<ParkedBike> getParkedBikes() {
		return parkedBikes;
	}

	public void setParkedBikes(ArrayList<ParkedBike> parkedBikes) {
		this.parkedBikes = parkedBikes;
	}
	
	public ParkingStation() {
		super();
		this.parkedBikes =new ArrayList<ParkedBike>();
		this.parkingTicketNo = 0;
	}
	
	public  boolean parkBike(ParkedBike bikeToAdd) {
		bikeToAdd.setParkedDate(new Date());
		this.parkedBikes.add(bikeToAdd);
		return true;
	}
	
	public  int deParkBike(ParkedBike bikeToRemove) {
		//search and remove
		this.parkedBikes.remove(bikeToRemove);
		bikeToRemove.setDeParkedDate(new Date());
		//int days = calculate date difference 
		//fee= days * 5
		//return fee;
		return 5;
	}
}
