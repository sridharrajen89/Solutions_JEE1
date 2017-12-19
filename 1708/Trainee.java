package com.htc.CoreJavaExercise;

public class Trainee extends Object {
private int traineeID;
private String traineeName;
private int traineeContactnum;
private String traineeEmailID;
private String traineeGender;
private int traineeAge;

//default constructor;
public Trainee() {
	traineeID = 0;
	traineeName = "";
	traineeContactnum = 0;
	traineeEmailID = "";
	traineeGender = "";
	traineeAge = 0;
   }

//Overload Constructor 
public Trainee (int traineeID, String traineeName,
		int traineeContactnum, String traineeEmailID, String traineeGender,int traineeAge) {
	this.traineeID = traineeID;
	this.traineeName = traineeName;
	this.traineeContactnum = traineeContactnum;
	this.traineeEmailID = traineeEmailID;
	this.traineeGender = traineeGender;
	this.traineeAge = traineeAge;
}
//setter for traineeId
	public void setTraineeId(int traineeId){
      this.traineeID = traineeID;	
	}
	
	//setter for traineename
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	//setter for traineeContactnum
		public void setTraineeContactnum(int traineeContactnum){
	      this.traineeContactnum = traineeContactnum;	
		}
		
		//setter for traineeEmailID
		public void setTraineeEmailID(String traineeEmailID) {
			this.traineeEmailID = traineeEmailID;
		}
		//setter for traineeGender
		public void setTraineeGender(String traineeGender) {
			this.traineeGender = traineeGender;		
		}
		//setter for traineeAge
		public void setTraineeAge(int traineeAge){
	      this.traineeAge = traineeAge;	
		}
		//getter for TraineeID
		public int getTraineeId() {
			return traineeID;
		}
		
		//getter for TraineeName
		public String getTraineeName() {
			return traineeName;
		}
		//getter for TraineeContactNum
		public int getTraineeContactnum() {
			return traineeContactnum;
		}
				
		//getter for TraineeEmailID
		public String getTraineeEmailID() {
			return traineeEmailID;
		}
		//getter for TraineeGender
		public String getTraineeGender() {
					return traineeGender;
		}
		//getter for TraineeAge
		public int getTraineeAge() {
			return traineeAge;
		}
		
}
