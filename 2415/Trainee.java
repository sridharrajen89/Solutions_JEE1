package com.htc.oops;
import java.io.Serializable;

public class Trainee extends Object implements Serializable {
	
	private int traineeId;
	private String traineeName; 
	private double contactNo;
	private String email; 
	private String gender;
	private int age; 

	public Trainee() {
		// TODO Auto-generated constructor stub
		traineeId = 0;
		traineeName = ""; 
		contactNo= 0;
		email  = "";  
		gender  = ""; 
		age  = 0; 
	}
	
	public Trainee(int traineeId, String traineeName, double contactNo, String email,String gender, int age) {
		// TODO Auto-generated constructor stub
		this.traineeId = traineeId;
		this.traineeName = traineeName;  
		this.contactNo= contactNo;
		this.email  = email;  
		this.gender  = gender; 
		this.age  = age; 
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
	public double getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(double contactNo){
		this.contactNo = contactNo;
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
	
	@Override	
	public String toString() {
		return "Trainee [traineeId....=" + traineeId + ", traineeName =" + traineeName + ", contactNo =" + contactNo + ",email....=" + email + ", gender = " + gender + ", age =" + age +"]";
	}
	
	@Override
	public int hashCode() {
		final int prime= 31;
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
