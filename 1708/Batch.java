package com.htc.CoreJavaExercise;
import java.util.*;
public class Batch {
private String batchCode;
private Date batchStartDate;
private Date batchEndDate;
public Trainee trainee[];
public Batch(String batchCode, Date batchStartDate, Date batchEndDate, Trainee[] trainee ) {
	super();
	this.batchCode = batchCode;
	this.batchStartDate = batchStartDate;
	this.batchEndDate = batchEndDate;
	this.trainee = trainee;
}

public Trainee getTrainee (int traineeID) throws TraineeNotFoundException {
	return null;
	}
public Trainee[] getTrainee(String traineeGender) {
	return trainee;
}
		

// TODO Auto-generated constructor stub

public static void main(String[] args) {
/*	System.out.println("Trainee Not Found Exception"); */
	
	}

}

