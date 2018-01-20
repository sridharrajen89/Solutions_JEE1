package com.Ex27;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXMain{

	public static void main(String[] args) {
		try {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		
		UserHandler handler = new UserHandler();
		saxParser.parse("src\\com\\Ex27\\Courses.xml", handler);
		
		}catch (Exception e) {
		       e.printStackTrace();
	     }
	}
}

