package com.htc.excercise1;

import java.io.Serializable;
import java.util.Arrays;

public class Batch extends Trainee implements Serializable {
	
	private int batchCode;
	private String startDate;
	private String endDate;
//	Trainee trainee = new Trainee();
	Trainee[] trainee = new Trainee[10];
//	Trainee[] trainee;
	
	//Default constructor
	public Batch() {
		super();
		batchCode = 0;
		startDate = "";
		endDate = "";
/*		for(int i=0; i<10; i++)
			trainee[i] = new Trainee(); */
	} 

	//Overload constructor
	public Batch(int batchCode, String startDate, String endDate) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
	} 
	
	//Setter and Getters
	public int getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	//hashCode method override
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batchCode;
		return result;
	}

	//equals method override
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		if (batchCode != other.batchCode)
			return false;
		return true;
	}

	//toString method override
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainee="
				+ Arrays.toString(trainee) + "]";
	}

	public Trainee getTrainee(int traineeId) {
		for(int i=0; i<10; i++)
		{
			if(trainee[i].getTraineeId() == traineeId)
				return trainee[i];
		} 
		return null;
	}
	
	public Trainee[] getTrainees(String gender) {
		Trainee[] traineeResult = new Trainee[10];
		int j = 0;
		for (int i=0; i<10; i++)
		{
			if (trainee[i].getGender()==gender)
			{
				traineeResult[j] = trainee[i];
				j = j + 1;
			}
		}
			
		return traineeResult;
	} 
}
