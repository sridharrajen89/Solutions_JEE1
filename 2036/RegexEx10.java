package test.com;
import java.util.regex.Pattern;

public class RegexEx10 {

	public static void main(String[] args) {
	
//emailid validation	
		boolean emailval;
				
		emailval=Pattern.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,4}\\b", "ssn.2h-t%@edu-org.in");
		
		if (emailval) 
			System.out.println("Email id is valid");
		else
			System.out.println("Email id is invalid");
		
//password validation
		
		boolean passval;
		
		/*  (?=.*\d)		#   must contains one digit from 0-9
		    (?=.*[a-z])		#   must contains one lowercase characters
		    (?=.*[A-Z])		#   must contains one uppercase characters
		    (?=.*[@#$%])	#   must contains one special symbols in the list "@#$%"  
            {6,20}		 	#   length should be least 6 characters and maximum of 20  */
			
		passval=Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})","Pass123$");
		
		if (passval)
			System.out.println("Password is valid");
		else
			System.out.println("Invalid Password");
		
//Credit card number validation
		
		boolean ccval;
		
		ccval = Pattern.matches("([0-9 ]{5})([0-9 ]{5})([0-9 ]{5})([0-9]){4}","1246 5112 1212 1213");
		
		if (ccval)
			System.out.println("Credit card is valid");
		else
			System.out.println("Invalid credit card");
				
			
	}

}
