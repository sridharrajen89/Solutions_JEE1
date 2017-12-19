package com.htc.corejava.trainingexcerise.week1;

public class BatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee[] thetrainees = new Trainee[3];
		thetrainees[0]= new Trainee (1, "Kiran Gudipudi1", 3096617797l, "KirankumarGudipudi1@gmail.com", "Male", 31);	
		thetrainees[1] = new Trainee (2, "Lakshmi Gudipudi2", 3096617799l, "LakshmiGudipudi2@gmail.com", "Female", 30);
		thetrainees[2] = new Trainee (3, "Kiran Gudipudi3", 3096607999l, "KirankumarGudipudi3@gmail.com", "Male", 30);
		
		Trainee[] gendertrainees;
		int traineeId = 1;
		String traineeGen = "Male";

		Batch batch = new Batch (101, "1/1/2017", "12/31/2017", thetrainees);
		
		System.out.println("Created Batch: "+batch.toString());
		try{
			Trainee idtrainee = batch.getTrainee(traineeId);
			System.out.println("Found Trainee with id: "+traineeId+" :"+idtrainee.toString());
		}
		catch(TraineeNotFoundException TNFEx){
			TNFEx.printStackTrace();
		}
		gendertrainees = batch.getTrainees(traineeGen);
		if (gendertrainees != null) {
			for(int i = 0; i < gendertrainees.length; i++) {
				System.out.println("\nFound Trainee "+traineeGen +" "+i+" :"+gendertrainees[i]);
			}
		}
		else
			System.out.println("\nNo Trainees found with gender "+"traineeGen");
	}
}