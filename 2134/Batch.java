package com.htc.exercices;

import java.util.Date;

public class Batch extends Trainee {
	public String batchCode;
	public Date startDate;
	public Date endDate;
	public Trainee trainee[];
	
	public Batch(String batchCode, Date startDate, Date endDate, Trainee[] trainee) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainee = trainee;
	}
	
	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
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
	public Trainee[] getTrainee() {
		return trainee;
	}
	
	public Trainee getTrainee(int traineeId) {
		for(int i = 0; i < trainee.length;i++) {
			if(traineeId == trainee[i].traineeId)
			return trainee[i];
		}
		return null;
		
	}
	
	public Trainee[] getTrainees(String gender) {
		Trainee traineeFnd[] = new Trainee[trainee.length];
		int j = 0;
		for(int i=0;i < trainee.length;i++) {
			if(trainee[i].gender.equalsIgnoreCase(gender)) {
				traineeFnd[j] = trainee[i];
				j++;
			}
		}		
		return traineeFnd;
	}
	
	public void setTrainee(Trainee[] trainee) {
		this.trainee = trainee;
	}
	
}
