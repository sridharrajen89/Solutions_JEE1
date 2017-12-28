package com.htc.exercise2526;
import java.util.Date;

class ParkedBike extends Bike{
	private Date parkedDate;
	private Date deParkedDate;
	
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

	public ParkedBike() {
		super();
		this.parkedDate = null;
		this.deParkedDate = null;

	}

}
