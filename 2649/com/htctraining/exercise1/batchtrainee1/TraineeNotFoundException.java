package com.htctraining.exercise1.batchtrainee1;

public class TraineeNotFoundException extends Exception {

	/**
	 * 
	 */
	String message ="";
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public TraineeNotFoundException(String message) {
		this.message = message;/*
		System.out.println("TraineeNotFoundException has occured : "+message);*/
	}
	

}
