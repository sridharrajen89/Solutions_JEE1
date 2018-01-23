package com.htc.ureg;

public class UserRegistration 
{
	String name;
	String dob;
	String gender;
	String picsloc;
	String profession;
	String email;
	String password;
	/**
	 * 
	 */
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param dob
	 * @param gender
	 * @param picsloc
	 * @param profession
	 * @param email
	 * @param password
	 */
	public UserRegistration(String name, String dob, String gender, String picsloc, String profession, String email,
			String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.picsloc = picsloc;
		this.profession = profession;
		this.email = email;
		this.password = password;
	}
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
	public String getPicsloc() {
		return picsloc;
	}
	public void setPicsloc(String picsloc) {
		this.picsloc = picsloc;
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
		return "UserRegistration [name=" + name + ", dob=" + dob + ", gender=" + gender + ", picsloc=" + picsloc
				+ ", profession=" + profession + ", email=" + email + ", password=" + password + "]";
	}

}
