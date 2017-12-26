package com.htc.exe1;
import java.util.regex.*;

public class RegularExpresssion {
	private String emailID;
	private String password;
	private Integer creditCardNo;
	
	//Default Constructor
	public RegularExpresssion() {
		emailID = "";
		password = "";
		creditCardNo = 0;
	}
	
	//Constructor
	public RegularExpresssion(String emailID, String password, Integer creditCardNo) {
		super();
		this.emailID = emailID;
		this.password = password;
		this.creditCardNo = creditCardNo;
	}
	
	//Validation methods
	
	public boolean emailValidation(String emailID) {
		return Pattern.matches("[A-Za-z0-9_.]+@[A-Za-z0-9]+\\.[A-Za-z]{2,6}", emailID);
	}
	public boolean passwordValidation(String password) {
		return Pattern.matches("[A-Za-z0-9_.@#$%^&*()-+]{5,8}", password);
	}
	public boolean creditCardValidation(Integer creditCard) {
		return Pattern.matches("[0-9]{10}",String.valueOf(creditCard));
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

	public Integer getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(Integer creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	@Override
	public String toString() {
		return "RegularExpresssion [emailID=" + emailID + ", password=" + password + ", creditCardNo=" + creditCardNo
				+ "]";
	}
	
	
}
