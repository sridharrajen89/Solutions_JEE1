package com.htc.JEE;

import java.util.jar.Attributes;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXIPL extends MyDefHandler {

	
	public static void main (String args []) throws Exception{
		SAXParser p = SAXParserFactory.newInstance().newSAXParser();
		p.parse("IPL.xml", new SAXIPL());
		System.out.println("Parsing Done");
	}

public void startDocument() {
	System.out.println("Starting Document ");
}

public void startElement (String uri, String localName, String qName, Attributes attrs) {

}

public void characters (char ch[], int start, int len) {
	System.out.println(new String (ch, start, len));
}	

public void endElement (String uri, String localName, String qName) {

}	

public void endDocument() {
	System.out.println("Ending Document");
}

}