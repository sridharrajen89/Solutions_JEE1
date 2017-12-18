package com.htc.week1;

public class Trainee {
	
	int traineeId;
	String traineeName;
	int contactNum;
	String email;
	String gender;
	int age;
	

public Trainee() {
	traineeId=0;
	traineeName="NULL";
	contactNum=0;
	email="NULL";
	gender="NULL";
	age=0;
			
	}
	//This is a constructor

	public Trainee(int traineeId, String traineeName, int contactNum, String email, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNum = contactNum;
		this.email = email;
		this.gender = gender;
		this.age = age;
		
	}

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

	public int getContactNum() {
		return contactNum;
	}

	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
	