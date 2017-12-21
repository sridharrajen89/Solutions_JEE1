package com.htcinc.oops;

import java.util.Arrays;
import java.util.Date;
import java.io.Serializable;

/*
1. Create an Entity class 'Trainee', with traineeId, traineeName, contactNo, email,   gender, age as fields.    
Create a class 'Batch', with batchCode, startdate, enddate and Trainee[] as fields.  
Create the following overloaded methods in the 'Batch' class 

public Trainee getTrainee(int traineeId) throws TraineeNotFoundException  
public Trainee[] getTrainees(String gender)

 */
public class Batch implements Serializable{

	private static final long serialVersionUID = 7344572567319256378L;
	
	private int batchCode;
	private Date startDate;
	private Date endDate;
	private Trainee [] trainee;
	
	
	public Batch(int batchCode, Date startDate, Date endDate, Trainee[] trainee) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainee = trainee;
	}
	

	public Trainee getTrainee(int traineeId) {
		for (int i=0; i < trainee.length;i++) {
			if (trainee[i].getTraineeId() == traineeId) {
				return trainee[i];
			}
		}
		return null;
	}

	
	public Trainee[] getTrainees(String gender) {
		Trainee [] temp=null;
		int j=0;
		for (int i=0; i < trainee.length;i++) {
			if (trainee[i].getGender().equalsIgnoreCase(gender)) {
				temp[j]=trainee[i];
				j++;
			}
		}
		return temp;
	}

	public int getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainee="
				+ Arrays.toString(trainee) + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		//int result = 1;
		//Updating result to have the value of batchCode as batchCode would be a unique number
		int result = batchCode;
		result = prime * result + batchCode;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + Arrays.hashCode(trainee);
		return result;
	}


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
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (!Arrays.equals(trainee, other.trainee))
			return false;
		return true;
	}



}
