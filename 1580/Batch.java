package com.htc.week1;
import java.util.Date;

public class Batch {
	
private	int batchCode;
private	Date startDate;
private	Date endDate;
public	Trainee trainee[];
	
	//This is a constructor

	public Batch(int batchCode, Date startDate, Date endDate, Trainee[] trainee)
	{
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
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