package com.htc.dec24;

public class ParkedBike extends Bike
{
	private String bikeRegNo;
	private String parkedDate;
	private String deParkedDate;
	private double parkingCharges;
	/**
	 * @param bikeRegNo
	 * @param parkedDate
	 * @param deParkedDate
	 * @param parkingCharges
	 */
	public ParkedBike(String bikeRegNo, String parkedDate, String deParkedDate, double parkingCharges) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.parkedDate = parkedDate;
		this.deParkedDate = deParkedDate;
		this.parkingCharges = parkingCharges;
	}
	public String getBikeRegNo() 
	{
		return bikeRegNo;
	}
	public void setBikeRegNo(String bikeRegNo) {
		this.bikeRegNo = bikeRegNo;
	}
	public String getParkedDate() {
		return parkedDate;
	}
	public void setParkedDate(String parkedDate) {
		this.parkedDate = parkedDate;
	}
	public String getDeParkedDate() {
		return deParkedDate;
	}
	public void setDeParkedDate(String deParkedDate) {
		this.deParkedDate = deParkedDate;
	}
	public double getParkingCharges() {
		return parkingCharges;
	}
	public void setParkingCharges(double parkingCharges) {
		this.parkingCharges = parkingCharges;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bikeRegNo == null) ? 0 : bikeRegNo.hashCode());
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
		if (bikeRegNo == null) {
			if (other.bikeRegNo != null)
				return false;
		} else if (!bikeRegNo.equals(other.bikeRegNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ParkedBike [bikeRegNo=" + bikeRegNo + ", parkedDate=" + parkedDate + ", deParkedDate=" + deParkedDate
				+ ", parkingCharges=" + parkingCharges + "]";
	}
	
}
