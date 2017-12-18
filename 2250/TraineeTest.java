package com.java.exercise;

public class TraineeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee[] trainees = new Trainee[3];
		trainees[0] = new Trainee(100,"Lisa",309123456,"abc@gmail.com","F",45);
		trainees[1] = new Trainee(200,"Mary",309123456,"abc@gmail.com","F",35);
		trainees[2] = new Trainee(300,"Tom",309123456,"abc@gmail.com","M",55);
		
		Trainee tr;
		Batch batch = new Batch("B10",10,12,trainees);
		
		// call to get Trainee details with TraineeId
		
		tr = batch.getTrainee(300);
		System.out.println("Details with TraineeId : " + tr);
		
		// call to get Trainee details with gender
		
		Trainee[] trg = batch.getTrainee("F");
		for(int i=0;i<trg.length;i++)
		{
			if(trg[i]!=null)
			System.out.println("Details with same gender : " + trg[i]);
		}
	}

}
