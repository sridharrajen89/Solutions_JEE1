package com.htc.exercise10;
import java.util.regex.*;

class validateInputs{

	public boolean isEmailValid(String emailID) {
	//Email Validation	
	//1) Minimum length shd be 10 , maximum lenght shd be 15 
	//2) shd end with eirther 'm' or 'n'
    //3) '@' ( at symbol ) shd come once
		return (Pattern.matches("[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+{7,12}[.][a-zA-Z][a-zA-Z]*[m-n]", emailID));
	}

	public boolean isPasswordValid(String password) {
		//password validation	
		//Pending TODO later
		return (Pattern.matches("[a-zA-Z0-9_-]+[!@#$%^&*()_+=]+", password));
	}

	public boolean isCreditCardNumValid(String creditCardNumber) {
		//Credit-card Number validation
		//(4 digit number)-(4 digit number)-(4 digit number)
		return (Pattern.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}", creditCardNumber));
	} 
}  

  