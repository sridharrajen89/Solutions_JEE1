package com.core.java;

import java.util.*;

/**
 * @author Radhika
 * Write a class ParkedBike which is a subclass of Bike (A class written above) with  following fields 
 * parkedDate   deParkedDate   
 *
 */
  
	class ParkedBike extends Bike{
		private Date parkedDate;
		private Date deParkedDate;
		
		/**
		 * 
		 */
		public ParkedBike() {
			super();
			this.parkedDate = null;
			this.deParkedDate = null;
		}

		/**
		 * @param bikeRegNo
		 * @param bikeName
		 * @param maxSpeed
		 * @param currentSpeed
		 * @param currentGear
		 */
		public ParkedBike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
			super(bikeRegNo, bikeName, maxSpeed, currentSpeed, currentGear);
			this.parkedDate = null;
			this.deParkedDate = null;
		}


		/**
		 * @param parkedDate
		 * @param deParkedDate
		 */
		public ParkedBike(Date parkedDate, Date deParkedDate) {
			super();
			this.parkedDate = parkedDate;
			this.deParkedDate = deParkedDate;
		}

		/**
		 * @return the parkedDate
		 */
		public Date getParkedDate() {
			return parkedDate;
		}

		/**
		 * @param parkedDate the parkedDate to set
		 */
		public void setParkedDate(Date parkedDate) {
			this.parkedDate = parkedDate;
		}

		/**
		 * @return the deParkedDate
		 */
		public Date getDeParkedDate() {
			return deParkedDate;
		}

		/**
		 * @param deParkedDate the deParkedDate to set
		 */
		public void setDeParkedDate(Date deParkedDate) {
			this.deParkedDate = deParkedDate;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "ParkedBike [parkedDate=" + parkedDate + ", deParkedDate=" + deParkedDate + "]";
		}
		
 }

/**
 * @author Ramkey_IBM_PC
 *
 */
public class BikeSubEx26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ParkedBike lazyBike = new ParkedBike ();

	}

}
