package com.java.training.exercise26.parkedbike;

import java.util.Calendar;

import com.java.training.exercise25.bike.Bike;

public class ParkedBike extends Bike {
	
	private Calendar parkedDate;
	private Calendar deParkedDate;
	
	public ParkedBike(Calendar  parkedDate, Calendar deParkedDate) {
		super();
		this.parkedDate = parkedDate;
		this.deParkedDate = deParkedDate;
	}

	public Calendar getParkedDate() {
		return parkedDate;
	}

	public void setParkedDate(Calendar parkedDate) {
		this.parkedDate = parkedDate;
	}

	public Calendar getDeParkedDate() {
		return deParkedDate;
	}

	public void setDeParkedDate(Calendar deParkedDate) {
		this.deParkedDate = deParkedDate;
	}
	
	
	
}
