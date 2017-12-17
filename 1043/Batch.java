/**
 * 
 */
package com.test;

import java.util.Arrays;
import java.util.Date;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Ramkey_IBM_PC
 * Create a class 'Batch', with batchCode, startdate, enddate and Trainee[] as fields.  
 * Create the following overloaded methods in the 'Batch' class 
 * public Trainee getTrainee(int traineeId) thows TraineeNotFoundException  --> Exception is not covered yet
 * public Trainee[] getTrainees(String gender) 
 */
public class Batch implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int batchCode;
	private Date startdate;
	private Date enddate;
	private Trainee Trainee[];
	/**
	 * Default Constructor
	 */
	public Batch() {
		super();
		this.batchCode = 0;
		this.startdate = null;
		this.enddate = null;
		Trainee = null;
	}
	/**
	 * Overloaded Constructor
	 * @param batchCode
	 * @param startdate
	 * @param enddate
	 * @param trainee
	 */
	public Batch(int batchCode, Date startdate, Date enddate, com.test.Trainee[] trainee) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		Trainee = trainee;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchCode;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		if (batchCode != other.batchCode)
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", Trainee="
				+ Arrays.toString(Trainee) + "]";
	}
	/**
	 * @return the batchCode
	 */
	public int getBatchCode() {
		return batchCode;
	}
	/**
	 * @param batchCode the batchCode to set
	 */
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	/**
	 * @return the startdate
	 */
	public Date getStartdate() {
		return startdate;
	}
	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	/**
	 * @return the enddate
	 */
	public Date getEnddate() {
		return enddate;
	}
	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	/**
	 * @return the trainee
	 */
	public Trainee[] getTrainee() {
		return Trainee;
	}
	/**
	 * @param trainee the trainee to set
	 */
	public void setTrainee(Trainee[] trainee) {
		Trainee = trainee;
	}
	
	public Trainee getTrainee(int traineeId) {
		for (int i=0;i<Trainee.length;i++) {
			if (Trainee[i].getTraineeId() == traineeId) 
			  return Trainee [i];
			}
		return null;
	}
	
	public Trainee[] getTrainees(char gender)  {
	// Question - Is there a way to re dimension the array size?	
		Trainee [] traineeInSameGender = new Trainee [Trainee.length];
		int j = 0;
		for (int i=0;i<Trainee.length;i++) {
			if (Trainee[i].getGender() == gender) {
				traineeInSameGender [j] = Trainee [i];
				j++;
			}
		}
		for (int i=j;i<Trainee.length;i++) {
			System.out.println(i);
			traineeInSameGender [i] = null;
		}

		return traineeInSameGender;
	}

	public static void main(String[] args) {
		Date d1 = null;
		Date d2 = null;
		
		Trainee t1 = new Trainee(100, "Anamika", "309-111-2222", "test@gmail.com", 'F', 30);
		Trainee t2 = new Trainee(101, "Balu", "248-333-4444", "test@msn.com", 'M', 35);
		Trainee t3 = new Trainee(102, "Charlie", "217-555-6666", "test@hotmail.com", 'M', 25);
		Trainee t4 = new Trainee(103, "Devi", "405-777-8888", "test@yahoo.com", 'F', 40);
		Trainee t5 = new Trainee(104, "Edward", "733-999-4444", "test@rediffmail.com", 'M', 20);

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
		Trainee [] traineeList = {t1,t2,t3,t4,t5};
		
		String pattern = "MM/dd/yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
	    try {
	      d1 = format.parse("12/12/2017");
	      d2 = format.parse("01/26/2018");
	     } catch (ParseException e) {
	      e.printStackTrace();
	    }
		Batch b1 = new Batch (001, d1, d2, traineeList);
		
		System.out.println(b1);
		System.out.println(b1.getTrainee(107));
		System.out.println(b1.getTrainee(103));
		Trainee [] traineeGenderList = b1.getTrainees('M');
		System.out.println(traineeGenderList.length);
		for (int i=0;(i<traineeGenderList.length & traineeGenderList[i] != null);i++) {
			System.out.println(traineeGenderList[i]);
		}
		
	}

}
