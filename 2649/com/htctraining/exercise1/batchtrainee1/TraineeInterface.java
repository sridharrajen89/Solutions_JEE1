package com.htctraining.exercise1.batchtrainee1;

public interface TraineeInterface {
	public  Trainee getTrainee(int traineeId) throws TraineeNotFoundException;
	
	public  Trainee[] getTrainees(String gender) ;

}
