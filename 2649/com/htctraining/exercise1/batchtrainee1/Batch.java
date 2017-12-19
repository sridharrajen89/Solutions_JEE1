package com.htctraining.exercise1.batchtrainee1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Batch extends Trainee implements TraineeInterface{

	 String batchCode = "";
	 Date startdate= new Date();
	 Date enddate = new Date();
	 int traineeCount=0;
	 Trainee[] trainees ;
	 //Assuming a batch with 5 students always - giving array size as 50
	
	

	public static void main(String[] args) {
		// Default method to execute program
		Scanner eid = new Scanner(System.in);

		System.out.println("Batch Create/Enquiry System");
		Batch myBatch = new Batch();
		myBatch.setBatchCode("XA21345");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

		try {
			myBatch.setStartdate(formatter.parse("01-JAN-17"));
			myBatch.setEnddate(formatter.parse("10-MAY-17"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter Total Trainee in new Batch(min-5)");
		myBatch.setTraineeCount(Integer.parseInt(eid.nextLine()));
		System.out.println("Auto poulating 5 students");
		myBatch.addTrainee(1001,"Santosh",123456789,"san123@gmail.com","Male",21);	
		myBatch.addTrainee(1002,"Suresh",123456789,"sur123@gmail.com","Male",22);
		myBatch.addTrainee(1003,"Ramesh",123456789,"ram123@gmail.com","Male",28);
		myBatch.addTrainee(1004,"Rani",123456789,"rani3@gmail.com","Female",28);
		myBatch.addTrainee(1005,"Laxmi",123456789,"lax234@gmail.com","Female",30);
		
		//Search for Trainee
		System.out.println("Enter Trainee Number you want to search");
		int id = Integer.parseInt(eid.nextLine());
		try {		
		System.out.println(myBatch.toString() +"\n"+ myBatch.getTrainee(id));
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString() );
		}
		//Search for Trainee's from same gender
		System.out.println("Enter Trainee Gender you want to search");
		Trainee[] temp = myBatch.getTrainees(eid.nextLine());
		System.out.println("temp length"+ temp.length);
		for (int j=0;j<temp.length;j++)
		{
			//System.out.println(j);
			System.out.println(temp[j].toString());
		}
		
		eid.close();
	}


	private void addTrainee(int traineeId, String traineeName, long contactNo, String email, String gender, int age) {
		// 
		trainees[this.traineeCount] = new Trainee(traineeId,  traineeName,  contactNo,  email,  gender,  age);
		this.traineeCount++;
	}


	private void setTraineeCount(int i) {
		trainees =  new Trainee[i];
		for (int m=0;m<i;m++) {
			trainees[m] = new Trainee();
		}
	}


	public String getBatchCode() {
		return batchCode;
	}


	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}


	@Override
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
		// Get Trainee details by searching withTraineeid
		for (int i =0 ; i<trainees.length; i++)
		{
//			System.out.println("Searching "+ trainees[i].getTraineeId());
			if (traineeId == trainees[i].getTraineeId()) {
				System.out.println("Match found");
				return trainees[i];
			}
		}
		throw new TraineeNotFoundException("Trainee not found " );
		
	}


	@Override
	public Trainee[] getTrainees(String gender) {
		// Get all Trainees with same gender
		
		int count = 0;
		for (int i =0 ; i<trainees.length; i++)
		{
			
			if (trainees[i].getGender() != null)
			if (gender.equalsIgnoreCase(trainees[i].getGender()))
			count++;
		}
		Trainee[] temp = new Trainee[count];
		count=0;
		for (int i =0 ; i<trainees.length; i++)
		{
//			System.out.println("Searching "+ trainees[i].getTraineeId());
			if (trainees[i].getGender() != null)
			if (gender.equalsIgnoreCase( trainees[i].getGender())) {
				temp[count] = trainees[i];
				count++;
			}
		}
		//System.out.println(count);
		return temp;
	}

}
