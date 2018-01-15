package com.adv1.test;



import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLSAX{

	public static void main(String[] args) {
		try {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		
		MyHandler handler = new MyHandler();
		saxParser.parse("src\\com\\adv1\\test\\test1.xml", handler);
		
		}catch (Exception e) {
		       e.printStackTrace();
	     }
	}

}
