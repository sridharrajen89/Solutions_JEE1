package com.Ex27;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler
	extends DefaultHandler {
			
		   boolean subject = false;
		   boolean name = false;
		   boolean time = false;
		   

		   @Override
		   public void startElement(
		      String uri, String localName, String qName, Attributes attributes)
		      throws SAXException {
		      
		      if (qName.equalsIgnoreCase("subject")) {
		         subject = true;
		        
		      } else if (qName.equalsIgnoreCase("name")) {
		        name = true;
		      } else if (qName.equalsIgnoreCase("time")) {
		    	  time= true;
		      } 
		   }

		   @Override
		   public void endElement(String uri, 
		      String localName, String qName) throws SAXException {
		      
		      if (qName.equalsIgnoreCase("subject")) {
		         System.out.println("End Element :" + qName);
		      }
		   }

		   @Override
		   public void characters(char ch[], int start, int length) throws SAXException {
			
		      if (name) {
		         System.out.println("name : " + new String(ch, start, length));
		         name = false;
		      } else if(time){
			         System.out.println("time : " + new String(ch, start, length));
			         time = false;
			      }
			
		   }

}
