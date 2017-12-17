package com.htc.excercise1;

public class MainProgram1 {

	public static void main(String[] args) {
		// Defining the Batch object
		Batch batch1 = new Batch();
	
		//Assigning the input values
		batch1.setBatchCode(101);
		batch1.setStartDate("01/01/2016");
		batch1.setEndDate("12/31/2016");
		for(int i=0; i<1; i++)
		{
		 	batch1.trainee[i].setTraineeId(1000+i);
			batch1.trainee[i].setTraineeName("Test"+i);
			batch1.trainee[i].setContactNo("994801234"+i);
			batch1.trainee[i].setEmail("Test"+i+"@htcinc.com");
			batch1.trainee[i].setAge(25);
			
			if((i%2) == 0)
				//For even number gender is Male 
				batch1.trainee[i].setGender("M");
			else
				//For odd number gender is Female
				batch1.trainee[i].setGender("F");
		}
		
		//Printing the output
		System.out.println("Batch details");
		System.out.println("Batch code --->"+batch1.getBatchCode());
		System.out.println("Batch start date --->"+batch1.getStartDate());
		System.out.println("Batch End date --->"+batch1.getEndDate());
		
		System.out.println("trainee[i] details");
		for(int i=0; i<1; i++) 
		{
			System.out.println("trainee[i] ID --->"+batch1.trainee[i].getTraineeId());
			System.out.println("trainee[i] Name --->"+batch1.trainee[i].getTraineeName());
			System.out.println("Contact number --->"+batch1.trainee[i].getContactNo());
			System.out.println("Email --->"+batch1.trainee[i].getEmail());
			System.out.println("Age --->"+batch1.trainee[i].getAge());
			System.out.println("Gender --->"+batch1.trainee[i].getGender());
		}
	}

}
