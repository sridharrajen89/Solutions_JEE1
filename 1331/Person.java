package com.register.classes;

import java.sql.Date;

public class Person {

	private int personId;
	private String personName;
	private Date dob;
	private String gender;
	private String profession;
	private String email;
	private String password;
	
	public Person(int personId, String personName, Date dob, String gender, String profession, String email,
			String password) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.dob = dob;
		this.gender = gender;
		this.profession = profession;
		this.email = email;
		this.password = password;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", dob=" + dob + ", gender=" + gender
				+ ", profession=" + profession + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
