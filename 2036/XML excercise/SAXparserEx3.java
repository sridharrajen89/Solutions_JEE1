package com.htc.advnJava;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class SAXparserEx3 {
	public static void main(String[] args) {
	
	 try {
         File inputFile = new File("Tour.xml");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         MysaxHandler userhandler = new MysaxHandler();
         saxParser.parse(inputFile, userhandler);   
      } catch (Exception e) {
         e.printStackTrace();
      }

}
	
}
