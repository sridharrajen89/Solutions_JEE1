package com.htc.xmlEx3;

import java.util.Scanner;

public class SAXParserXML {
	public static void main(String[] args) {
		try {
		//SAXParserFactory factory = SAXParserFactory.newInstance();
		//SAXParser saxParser = factory.newSAXParser();
		MyDefHandler handler = new MyDefHandler();
		Scanner scan = new java.util.Scanner(System.in);
		System.out.println("enter xml file");
		String xmlF = scan.nextLine();
		System.out.println("is it Schema based say 'true/false'");
		boolean isSchema = Boolean.parseBoolean(scan.nextLine());
		String xsdF = "";
		if(isSchema) {
			System.out.println("enter xsd file");
			xsdF = scan.nextLine(); 
		}  		
		handler.parseSchemaFile(xmlF,xsdF,handler);
		}catch (Exception e) {
		       e.printStackTrace();

	     }

	}
}
