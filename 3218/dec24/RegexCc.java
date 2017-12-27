package com.htc.dec24;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCc {

	public static void main(String[] args)
	{
	List<String> cards = new ArrayList<String>();
	 
	//Valid Credit Cards
	cards.add("6574-5874-2012-6321");  
	 
	//Invalid Credit Card
	cards.add("41A6-95Q0-8751-2011"); 
	 
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
	        System.out.println(matcher.group("discover"));
	    }
	}

	}
}
