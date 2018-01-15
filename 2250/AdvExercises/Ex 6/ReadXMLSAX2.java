package com.adv1.test;



import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLSAX2{

	public static void main(String[] args) {
		try {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		
		UserHandler handler = new UserHandler();
		saxParser.parse("src\\com\\adv1\\test\\Players.xml", handler);
		
		}catch (Exception e) {
		       e.printStackTrace();
	     }
	}

}
