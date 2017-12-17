/**
 * 
 */
package com.test;
import java.io.*;

/**
 * @author Radhika
 * purpose: Create an Entity class 'Trainee', with traineeId, traineeName, contactNo, 
 * email,   gender, age as fields.    
 */
public class Trainee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int traineeId;
	private String traineeName;
	private String contactNo;
	private String email;
	private char gender;
	private int age;
	
	/**
	 * Default Constructor
	 */
	public Trainee() {
		super();
		this.traineeId = 0;
		this.traineeName = " ";
		this.contactNo = " ";
		this.email = " ";
		this.gender = ' ';
		this.age = 0;
	}
	
	
	/**
	 * Overloaded Constructor
	 * @param traineeId
	 * @param traineeName
	 * @param contactNo
	 * @param email
	 * @param gender
	 * @param age
	 */
	public Trainee(int traineeId, String traineeName, String contactNo, String email, char gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + traineeId;
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
		if (traineeId != other.traineeId)
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
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
	/**
	 * @return the traineeName
	 */
	public String getTraineeName() {
		return traineeName;
	}
	/**
	 * @param traineeName the traineeName to set
	 */
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
