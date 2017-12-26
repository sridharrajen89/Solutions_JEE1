package com.htc.week2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			ArrayList<String> cards = new ArrayList<String>();
			 
			//Valid Credit Cards
			cards.add("4545-5678-2234-5789");  //Masked to avoid any inconvenience unknowingly
			 
			//Invalid Credit Card
			cards.add("1234-1234-1234-1234"); //Masked to avoid any inconvenience unknowingly
			 
			String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" +
			        "(?<mastercard>5[1-5][0-9]{14})|" +
			        "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" +
			        "(?<amex>3[47][0-9]{13})|" +
			        "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" +
			        "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";
			 
			Pattern pattern = Pattern.compile(regex);
			 
			for (String card : cards)
			{
			    //Strip all hyphens
			    card = card.replaceAll("-", "");
			 
			    //Match the card
			    Matcher matcher = pattern.matcher(card);
			 
			    System.out.println(matcher.matches());
			 
			    if(matcher.matches()) {
			        //If card is valid then verify which group it belong
			        System.out.println(matcher.group("mastercard"));

			    }
			}
		}
	}
}
	



