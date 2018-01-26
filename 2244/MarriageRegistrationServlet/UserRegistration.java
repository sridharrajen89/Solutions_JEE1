package com.htc.servletExercise;

public class UserRegistration {
	String name;
	String dob;
	String gender;
	String picureloc;
	String profession;
	String emailID;
	String password;
	//Default Constructor
	public UserRegistration() {
		super();
	}

	//Constructor
	public UserRegistration(String name, String dob, String gender, String picureloc, String profession, String emailID,
			String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.picureloc = picureloc;
		this.profession = profession;
		this.emailID = emailID;
		this.password = password;
	}
//Setters & Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPicureloc() {
		return picureloc;
	}

	public void setPicureloc(String picureloc) {
		this.picureloc = picureloc;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//toString 
	@Override
	public String toString() {
		return "UserRegistration [name=" + name + ", dob=" + dob + ", gender=" + gender + ", picureloc=" + picureloc
				+ ", profession=" + profession + ", emailID=" + emailID + ", password=" + password + "]";
	}
}
