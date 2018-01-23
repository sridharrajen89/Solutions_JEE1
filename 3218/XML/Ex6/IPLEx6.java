package com.xml.ex;

/**
 *  Write a program to read and list all the player names of a given team from the IPL XML using SAX. 
 */
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;

public class IPLEx6 extends DefaultHandler {
	
	public void startDocument() {
		System.out.println("Document Begins here");
	}
	
	public void startElement (String uri, String localName, String qName, Attributes attrs) {
		System.out.println("<" + qName + "> ");
	}
  
	public void characters (char ch[], int start, int len) {
		System.out.println(new String (ch, start, len));
	}
	
	public void endElement (String uri, String localName, String qName) {
		System.out.println("</" + qName + "> ");
	}	
	
	public void endDocument() {
		System.out.println("Document Ends here");
	}
	
	public static void main (String args []) throws Exception{
		SAXParser p = SAXParserFactory.newInstance().newSAXParser();
		p.parse("Players.xml", new IPLEx6());
		
		
		System.out.println("done");
	}
}