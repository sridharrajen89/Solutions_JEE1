package htc.xml.sax;

import java.util.jar.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXPars extends DefaultHandler{

	@Override 
	public void startDocument () throws SAXException {
		System.out.println ("Start parse XML ..."); 
	} 

	String thisElement = ""; 
	public void startElement (String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
		thisElement = qName; 
		System.out.println(qName);
	} 

	@Override 
	public void characters (char [] ch, int start, int length) throws SAXException {
		System.out.println(new String (ch, start, length));
	} 
	
	@Override 
	public void endElement (String namespaceURI, String localName, String qName) throws SAXException {
		thisElement = ""; 
		System.out.println("End Element is " + qName);
	} 

	
	@Override 
	public void endDocument () {
		System.out.println ("Stop parse XML ..."); 
	} 
}
