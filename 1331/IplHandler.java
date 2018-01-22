package ex6;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class IplHandler extends DefaultHandler {
	
	   boolean isteamname = false;
	   boolean isfranchisename = false;
	   boolean isplayername = false;
	   boolean isplayerage = false;
	   boolean isplayertype = false;
	   boolean isplayerbest = false;
	   
	   @Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		   if (qName.equalsIgnoreCase("team")) {
		         String id = attributes.getValue("id");
		         System.out.println("Team Id : " + id);
		      } else if (qName.equalsIgnoreCase("team-name")) {
		    	  isteamname = true;
		      } else if (qName.equalsIgnoreCase("franchise-name")) {
		    	  isfranchisename = true;
		      } else if (qName.equalsIgnoreCase("player-name")) {
		    	  isplayername = true;
		      } else if (qName.equalsIgnoreCase("player-age")) {
		    	  isplayerage = true;
		      } else if (qName.equalsIgnoreCase("player-type")) {
		    	  isplayertype = true;
			  } else if (qName.equalsIgnoreCase("career-best")) {
				  isplayerbest = true;
			  }
	}
	   
	   
	 @Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		 if (qName.equalsIgnoreCase("team")) {
	         System.out.println("End Element :" + qName);
	      }
	}
	 
	 @Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		 if (isteamname) {
	         System.out.println("Team Name: " + new String(ch, start, length));
	         isteamname = false;
	      } else if (isfranchisename) {
	         System.out.println("Last Name: " + new String(ch, start, length));
	         isfranchisename = false;
	      } else if (isplayername) {
	         System.out.println("Nick Name: " + new String(ch, start, length));
	         isplayername = false;
	      } else if (isplayerage) {
	         System.out.println("Marks: " + new String(ch, start, length));
	         isplayerage = false;
	      } else if (isplayertype) {
		         System.out.println("Marks: " + new String(ch, start, length));
		         isplayertype = false;
		  } else if (isplayerbest) {
		         System.out.println("Marks: " + new String(ch, start, length));
		         isplayerbest = false;
		  }
	}
}
