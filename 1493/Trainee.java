package com.htc.test;

import java.io.Serializable;

//import java.util.*;
public class Trainee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//default constructor
	Trainee(){
		
	}
	//over loaded constructor
	Trainee(int id,String gender){
		this.traineeId=id;
		this.gender=gender;
	}
	
	private String traineeName;
	private int traineeId;
	private int contactNo;
	private String email;
	private String gender;
	private String age;
//getters and setters
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trainee [traineeName=" + traineeName + ", contactNo=" + contactNo + ", email=" + email + ", gender="
				+ gender + ", age=" + age + "]";
	}
	/**
	 * @return the traineeId
	 */
	public int getTraineeId() {
		return traineeId;
	}
	/**
	 * @param traineeId the traineeId to set
	 */
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	
	
	
}
