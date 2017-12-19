package com.htc.corejava.trainingexcerise.week1;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
class Batch implements Serializable {

	private int batchCode;
	private String startdate;
	private String enddate;
	Trainee[] trainee = null;
	
	public Batch () {
		// TODO Auto-generated constructor stub
		batchCode = 0;
		startdate = "NULL";
		enddate = "NULL";
	}
	
	public Batch (int batchCode, String startdate, String enddate, Trainee[] trainee ) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainee = trainee;
	}

	public int getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public Trainee[] getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee[] trainee) {
		this.trainee = trainee;
	}

	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainee="
				+ Arrays.toString(trainee) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchCode;
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
		return true;
	}
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException{
		int traineeFound = 0;
		int traineeIndex = 0;
		for(int i = 0; i < trainee.length; i++) {
			if (trainee[i].getTraineeId() == traineeId) {
				traineeFound = 1;
				traineeIndex = i;
			}
		}
		if (traineeFound != 1)
			throw new TraineeNotFoundException("Trainee not found for given id: "+traineeId);
		else
			return trainee[traineeIndex];
	}
	public Trainee[] getTrainees(String gender) {
		int genCount=0;
		for(int i = 0; i < trainee.length; i++) {
			if (trainee[i].getGender() == gender) 
				genCount++;
		}
		if (genCount == 0)
			return null;
		else {
			Trainee[] genTrainee = new Trainee[genCount];
			int j = 0;
			for(int i = 0; i < trainee.length; i++) {
				if (trainee[i].getGender() == gender) {
					genTrainee[j]= trainee[i];
					j++;
				}
			}
			return genTrainee;
		}
	}
}
