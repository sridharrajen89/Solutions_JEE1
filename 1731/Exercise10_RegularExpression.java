package htc.assignments;

import java.util.regex.Pattern;

/*Validate Regular expressions for 
email id, password and Credit Card number
*/

public class Exercise10_RegularExpression {

	public static void main(String[] args) {
	
	//email	
	System.out.println("verify regular expression for eamil validation");
	System.out.println(Pattern.matches("[0-9a-zA-Z@_+.]{11,25}", "test_a.a123aa@gmail.com"));//true (2nd char is s)  

	//password
	System.out.println("verify regular expression for eamil validation");
	System.out.println(Pattern.matches("[0-9a-zA-Z@_+.#&$*]{8,20}", "a*aa#1$23_@test_123"));//true (2nd char is s)  

	//Credit card
	System.out.println("verify regular expression for eamil validation");
	System.out.println(Pattern.matches("[0-9-]{19}", "2345-4567-1256-1898"));//true (2nd char is s)  

	}

}
