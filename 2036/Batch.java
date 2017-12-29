package test.com;

import java.util.*;

public class Batch {
	private int batchCode;
	private String startDate;
	private String endDate;
	Trainee trainees[];
	
//default constructor
	public Batch() {
		batchCode = 0;
		startDate = null;
		endDate = null;
		trainees = null;
			
	}
	
//overloaded constructor		
	public Batch(int batchCode, String startDate, String endDate, test.com.Trainee[] trainee) {
	super();
	this.batchCode = batchCode;
	this.startDate = startDate;
	this.endDate = endDate;
	trainees = trainee;
}

//overloaded method to find trainee
	public Trainee getTrainee(int traineeID) {
		
		Trainee srtrainee=new Trainee();
		for (int i=0;i<trainees.length;i++) {
			if (trainees[i].traineeId==traineeID)
				srtrainee=trainees[i];
		}
			return srtrainee;

		}
		
//overloaded method to find trainees by gender
	public Trainee getTrainee(String retgender) {
		
		Trainee gentrainee=new Trainee();
		for (int j=0;j<trainees.length;j++) {
			if (trainees[j].gender==retgender)
				
				gentrainee=trainees[j];		
		}
		return gentrainee;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Trainee[] trainees= new Trainee[3];
		
		trainees[0] = new Trainee(2036,"SSN1",9999,"ssn@yahoo.com","M",25);
		trainees[1] = new Trainee(2037,"SSN2",9998,"sns@yahoo.com","F",30);
		trainees[2] = new Trainee(2038,"SSN3",9997,"nss@yahoo.com","M",35);
		
		Trainee newtraining;
				
		Batch newbatch = new Batch(1234,"12","16",trainees);
		
		newtraining=newbatch.getTrainee(2036);
		System.out.println ("Trainee search using TraineeId:"+newtraining);
		
		Trainee newtraineebygen;
		
		
		newtraineebygen=newbatch.getTrainee("F");
		System.out.println("Trainee search by Gender:"+newtraineebygen);
					
		
		}
		
		

	}
