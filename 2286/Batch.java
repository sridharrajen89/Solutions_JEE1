package com.java.training;

import java.util.Date;


public class Batch {



	Trainee trainee = new Trainee();

	private int batchCode = 1;
	private Date startdate = new Date();
	private Date enddate = new Date();


	public Trainee getTrainee(int traineeId) throws Exception {
		trainee.setTraineeID(traineeId);
		trainee.setTraineeName("abc");
		trainee.setContactNo("3098265549");
		trainee.setTraineeName("abc");
		trainee.setAge(20);
		trainee.setEmail("a@htc.com");
		trainee.setGender("f");
		return trainee;

	}

	public Trainee[] getTrainees(String gender) {
		Trainee[] trainee1 = new Trainee[2];

		trainee1[0].setTraineeID(1);
		trainee1[0].setTraineeName("abc");
		trainee1[0].setGender("f");
		trainee1[1].setTraineeID(1);
		trainee1[1].setTraineeName("abc");
		trainee1[1].setGender("f");

		return trainee1;
	}

	public static void main(String[] args) throws Exception {

		Batch b = new Batch();
		b.displayTrainee();
	}

	public  void displayTrainee() throws Exception
	{
		System.out.println("Trainees");
		Trainee trainee1 = getTrainee(10);
		System.out.println(trainee1.getAge());
		System.out.println(batchCode);
		System.out.println(startdate);
		System.out.println(enddate);

	}

	public  void displayTraineeGender() throws Exception
	{
		System.out.println("Trainee Gender");
		Trainee trainee1 = getTrainee(10);
		System.out.println(trainee1.getGender());

	}


}
