/**
 * 
 */
package co.htc.CoreJavaExercise2;
import java.util.*;
import java.util.regex.Pattern;
/**
 * @author MeenuGarg
 *
 */
public class ValidateExpression {
	public static void main(String[] args) {
//		Email Id validation 
//  	'@' ( at symbol ) shd come once
		System.out.println(Pattern.matches("[a-z|A-Z|0-9]{4,20}\\@[a-z|A-Z|0-9]+\\.[a-z|A-Z|0-9]+[m|n]", "dhfkfl@htc.com"));
		System.out.println(Pattern.matches("[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*\r\n" + 
				"      @[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$", "@fkfl@htc.com"));
		

//		Password validation 
//		Minimum length should be 8
//		shd have a number and a special character
		System.out.println(Pattern.matches("[a-z|A-Z|0-9@!*]{8,}", "Test123@&345"));
		
//		credit card number 
//
//		(4 digit number)-(4 digit number)-(4 digit number)	
		System.out.println(Pattern.matches("[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}", "1534-9978-8012-3496"));  
		System.out.println(Pattern.matches("[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}", "1324-5678-9012-"));
		}

	}
