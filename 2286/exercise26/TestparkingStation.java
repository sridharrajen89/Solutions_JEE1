package com.java.training.exercise26.parkedbike;

import java.util.Calendar;

public class TestparkingStation {

	public static void main(String[] args) throws DuplicateBikeParkedException, ParkedBikeNotFound {

		ParkingStation parkingStation = new ParkingStation();
		Calendar parkedDate = Calendar.getInstance();
		Calendar deParkedDate = Calendar.getInstance();
		parkedDate.set(2017, 12, 20);
		deParkedDate.set(2017, 12, 23);
		ParkedBike parkedBike = new ParkedBike(parkedDate,deParkedDate);
		ParkedBike parkedBike1 = new ParkedBike(parkedDate,deParkedDate);
		//DaysParked daysparked1 = new DaysParked();
		try {
			
			parkedBike.setBikeName("Passion");
			parkedBike.setBikeRegNo(2017);
			parkedBike1.setBikeName("Pulsar");
			parkedBike1.setBikeRegNo(2018);
			//Add first bike directly in map
			parkingStation.parkedBikeMap.put(2017, parkedBike);
			//Add bike to parkedmap via method
			parkingStation.parkBike(parkedBike1);
			System.out.println("New Bike Parked");
			System.out.println(parkingStation.deParkBike(parkedBike));
		
		}
		
		catch (DuplicateBikeParkedException dpe){
			
			System.out.println(dpe.getErrorMessage());
		}
			
	
		/*catch (ParkedBikeNotFound bnf){
			
			System.out.println(bnf.getErrorMessage());
			
			
		}*/
		
		/*catch (Exception e){
			
			System.out.println("Exception thrown");
			
			
		}*/
		
		
	
	
	}

}
