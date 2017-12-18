package com.java.exercise;

public class Trainee {

	int traineeId;
	String traineename;
	int contactnumber;
	String email;
	String gender;
	int age;
	
	public Trainee(int traineeId, String traineename, int contactnumber, String email, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineename = traineename;
		this.contactnumber = contactnumber;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineename=" + traineename + ", contactnumber=" + contactnumber
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}
	

}

