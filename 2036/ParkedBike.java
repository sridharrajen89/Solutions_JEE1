package test.com;

import java.util.List;

public class ParkedBike extends Bike{
	private String parkedDate;
	private String deParkedDate;

//Default constructor
	public ParkedBike() {
		this.parkedDate = null;
		this.deParkedDate = null;
		
	}
//overloaded constructor
	public ParkedBike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear,
			String parkedDate, String deParkedDate) {
		super(bikeRegNo, bikeName, maxSpeed, currentSpeed, currentGear);
		this.parkedDate = parkedDate;
		this.deParkedDate = deParkedDate;
	}

//Getters and setters
	public String getParkedDate() {
		return parkedDate;
	}

	public String getDeParkedDate() {
		return deParkedDate;
	}

	public void setParkedDate(String parkedDate) {
		this.parkedDate = parkedDate;
	}

	public void setDeParkedDate(String deParkedDate) {
		this.deParkedDate = deParkedDate;
	}
	
	
}
	
