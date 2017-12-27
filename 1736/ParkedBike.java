package com.htcinc.oops.day10;

import java.util.Date;

public class ParkedBike extends Bike {
	private Date parkedDate;
	private Date deParkedDate;

	public ParkedBike(int bikeRegNo, String bikeName, int maxSpeed) {
		super(bikeRegNo, bikeName, maxSpeed);
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "ParkedBike [parkedDate=" + parkedDate + ", deParkedDate=" + deParkedDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((deParkedDate == null) ? 0 : deParkedDate.hashCode());
		result = prime * result + ((parkedDate == null) ? 0 : parkedDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkedBike other = (ParkedBike) obj;
		if (deParkedDate == null) {
			if (other.deParkedDate != null)
				return false;
		} else if (!deParkedDate.equals(other.deParkedDate))
			return false;
		if (parkedDate == null) {
			if (other.parkedDate != null)
				return false;
		} else if (!parkedDate.equals(other.parkedDate))
			return false;
		return true;
	}
	
	
	

}
