package com.htc.javaweek1;

public class Trainee {
	private int traineeId;
	private String traineeName;
	private int traineeContactNo;
	private String traineeEmail;
	private String traineeGender;
	private String traineeDOB;
	
	// default construtor 
		public Trainee(){
			System.out.println("Default constructor is fired");
			traineeId=0;
			traineeName=" ";
			traineeContactNo=0;
			traineeEmail="";
			traineeGender="";
			traineeDOB="";
		}
		// overloaded construtor 
		public Trainee(int traineeId, String traineeName, int traineeContactNo, String traineeEmail, String traineeGender,
			String traineeDOB) {
		super();
		System.out.println("Overloaded constructor is fired");
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeContactNo = traineeContactNo;
		this.traineeEmail = traineeEmail;
		this.traineeGender = traineeGender;
		this.traineeDOB = traineeDOB;
	}
		public void getTrainee(int traineeId) {
			System.out.println("TraineeId Detail from getTrainee Method@ Trainee Class --"+traineeId);	
		}		
		public Trainee[] getTrainees(String gender) {
			System.out.println("TraineeGender Detail from getTrainees Method@ Trainee Class--"+ gender);
			return null;
		}
		//setters and getters 
		public int getTraineeId() {
			return traineeId;
		}
		public void setTraineeId(int traineeId) {
			this.traineeId = traineeId;
		}
		public String getTraineeName() {
			return traineeName;
		}
		public void setTraineeName(String traineeName) {
			this.traineeName = traineeName;
		}
		public int getTraineeContactNo() {
			return traineeContactNo;
		}
		public void setTraineeContactNo(int traineeContactNo) {
			this.traineeContactNo = traineeContactNo;
		}
		public String getTraineeEmail() {
			return traineeEmail;
		}
		public void setTraineeEmail(String traineeEmail) {
			this.traineeEmail = traineeEmail;
		}
		public String getTraineeGender() {
			return traineeGender;
		}
		public void setTraineeGender(String traineeGender) {
			this.traineeGender = traineeGender;
		}
		public String getTraineeDOB() {
			return traineeDOB;
		}
		public void setTraineeDOB(String traineeDOB) {
			this.traineeDOB = traineeDOB;
		}
		@Override
		public String toString() {
			return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeContactNo="
					+ traineeContactNo + ", traineeEmail=" + traineeEmail + ", traineeGender=" + traineeGender
					+ ", traineeDOB=" + traineeDOB + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + traineeId;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Trainee other = (Trainee) obj;
			if (traineeId != other.traineeId)
				return false;
			return true;
		}
		
				
}
