package com.htc.exercicesTest;

import com.htc.exercices.Trainee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.htc.exercices.Batch;

public class BatchTest {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Trainee sem24[] = new Trainee[5];		
		sem24[0] = new Trainee(1011,"Karthick T",12324,"Tiger@gmail.com","MALE",24);		
		sem24[1] = new Trainee(1012,"Karthick S",12324,"SK@gmail.com","MALE",24);
		sem24[2] = new Trainee(1013,"Rahul",12324,"ANTO@gmail.com","MALE",24);
		sem24[3] = new Trainee(1014,"Brillie",12324,"Brillie@gmail.com","MALE",24);
		sem24[4] = new Trainee(1015,"Shyamala",12324,"Shyam@gmail.com","FEMALE",25);
		
		/*for(int i=0;i<sem24.length;i++)
		System.out.println(sem24[i]);*/
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Batch newBatch = new Batch("sem24",df.parse("12-13-2006"),df.parse("01-06-2008"),sem24);
		System.out.println("Get the Trainee");
		System.out.println(newBatch.getTrainee(1011));
		
		System.out.println("Get the Trainees Male List");
		sem24 = newBatch.getTrainees("Male");
		for(int i=0;i<sem24.length;i++)
			if(sem24[i] != null)
				System.out.println(sem24[i]);
		System.out.println("Get the Trainees Female List");
		sem24 = newBatch.getTrainees("female");
		for(int i=0;i<sem24.length;i++)
			if(sem24[i] != null)
				System.out.println(sem24[i]);
	}

}
