package com.java.training.exercise26.parkedbike;

import java.util.Calendar;
import java.util.HashMap;

public class ParkingStation {

	HashMap<Integer, ParkedBike> parkedBikeMap = new HashMap <Integer, ParkedBike>(); 


	public boolean parkBike(ParkedBike parkedBike) throws DuplicateBikeParkedException {

		if (parkedBikeMap.get(parkedBike.getBikeRegNo())!= null) {

			throw new DuplicateBikeParkedException("Bike already parked!");
		}

		else {

			parkedBikeMap.put(2, parkedBike);

			return true;
		}

	}

	public long deParkBike(ParkedBike parkedBike) throws ParkedBikeNotFound {

		if (parkedBikeMap.get(parkedBike.getBikeRegNo()) != null) {
			
			long parkedDays= daysParked(parkedBike.getParkedDate(),parkedBike.getDeParkedDate());
			long parkingAmount = parkedDays*5;
			parkedBikeMap.remove(2, parkedBike);

			return parkingAmount;	
		}

		else {

			throw new ParkedBikeNotFound("Bike Not Found!");
		}
	}
	
	//method to calculate differenc ein the days parked
	
	 private long daysParked(Calendar calendarFrom,Calendar calendarTo) {
		    
		    long miliSecondForDate1 = calendarFrom.getTimeInMillis();
		    long miliSecondForDate2 = calendarTo.getTimeInMillis();
		    long diffInMilis = miliSecondForDate2 - miliSecondForDate1;
		    long diffInDays = diffInMilis / (24 * 60 * 60 * 1000);
		    
		    return diffInDays;
		}
}
