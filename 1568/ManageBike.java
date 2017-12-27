/**
 * 
 */
package com.htcinc.weektwo;

import java.util.*;

/**
 * @author Sree
 *
 */

class ParkedBike extends Bike{
	    private Date parkedDate;
		private Date deParkedDate;
		/**
		 * @param bikeRegNo
		 * @param bikeName
		 * @param maxSpeed
		 * @param currentSpeed
		 * @param currentGear
		 * @param parkedDate
		 * @param deParkedDate
		 */
		public ParkedBike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear,
				Date parkedDate, Date deParkedDate) {
			super(bikeRegNo, bikeName, maxSpeed, currentSpeed, currentGear);
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
		 * @return the deParkedDate
		 */
		public Date getDeParkedDate() {
			return deParkedDate;
		}
		/**
		 * @param parkedDate the parkedDate to set
		 */
		public void setParkedDate(Date parkedDate) {
			this.parkedDate = parkedDate;
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

public class BikeManage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}