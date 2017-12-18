package com.htc.oops;

import java.io.Serializable;
import java.util.Arrays;

public class Batch extends Trainee implements Serializable {

	private int batchCode;
	private String startDate;
	private String endDate;
	Trainee[] trainee = new Trainee[10];

	public Batch() {
		super();
		batchCode = 0;
		startDate = "";
		endDate = "";
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
	
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainee="
				+ Arrays.toString(trainee) + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batchCode;
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
		Batch other = (Batch) obj;
		if (batchCode != other.batchCode)
			return false;
		return true;
	}
}
