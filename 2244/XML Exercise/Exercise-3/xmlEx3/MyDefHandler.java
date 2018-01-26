package com.htc.xmlEx3;

import java.io.File;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefHandler extends DefaultHandler {
	boolean name = false;
	boolean otime = false;
	boolean ctime = false;
	boolean adult = false;
	boolean child = false;
	static final String JAXP_SCHEMA_LANGUAGE =  "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	static final String JAXP_SCHEMA_SOURCE =	"http://java.sun.com/xml/jaxp/properties/schemaSource";
	static final String W3C_XML_SCHEMA =		"http://www.w3.org/2001/XMLSchema";
	static final String FEATURE = "http://xml.org/sax/features/";

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
	{
		   System.out.println("Start Element :" + qName);
		    if (qName.equalsIgnoreCase("place")) {
			 String code = attributes.getValue("Code");
	         System.out.println("Code : " + code);
			}
			if (qName.equalsIgnoreCase("name")) {
				name = true;
			}
			if (qName.equalsIgnoreCase("opening-time")) {
				otime = true;
			}
			if (qName.equalsIgnoreCase("close-time")) {
				ctime = true;
			}
			if (qName.equalsIgnoreCase("adult")) {
				adult = true;
			}
			if (qName.equalsIgnoreCase("child")) {
				child = true;
			}
		}
		public void characters(char ch[], int start, int length) throws SAXException 
		{
				if (name) {
					System.out.println("Name : " + new String(ch, start, length));
					name = false;				
				}
				if (otime) {
					System.out.println("Opening Time: " + new String(ch, start, length));
					otime = false;
				}
				if (ctime) {
					System.out.println("Closing time : " + new String(ch, start, length));
					ctime = false;
				}
				if (adult) {
					System.out.println("adult Entry fee : " + new String(ch, start, length));
					adult = false;
				}
				if (child) {
					System.out.println("Child Entry fee : " + new String(ch, start, length));
					child = false;
				}
		}

		public void endElement(String uri, String localName,String qName) throws SAXException 
		{
					System.out.println("End Element :" + qName);
		}
		public boolean parseSchemaFile(String xmlFile,String xsdFile,MyDefHandler dh) throws Exception {
			boolean ret = false;  
			try {
				SAXParser parser = this.getParser(xsdFile);
				parser.parse(new File(xmlFile), dh);
				ret = true;   
			}
			catch(Exception e){
				ret = false;
				System.out.println(e);
			}
			return ret;
		}
		public  SAXParser  getParser(String xsdFile) {
			SAXParser parser = null;
			try {
				SAXParserFactory factory = this.getConfiguredFactory();
				factory.setFeature("http://apache.org/xml/features/validation/schema", true);
				parser = factory.newSAXParser(); 
				parser.setProperty(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
				parser.setProperty(JAXP_SCHEMA_SOURCE,xsdFile);  
			}catch(Exception e) {
				System.out.println(e);
			}
			return parser;
		} 

		public  SAXParser  getParser() {
			SAXParser parser = null;
			try { 
				parser = this.getConfiguredFactory().newSAXParser();   
			}catch(Exception e){
				System.out.println(e);
			}
			return parser;
		} 
		public SAXParserFactory getConfiguredFactory() {
			SAXParserFactory factory = SAXParserFactory.newInstance();  
			try{
				factory.setFeature(FEATURE+"namespaces", true);
				factory.setFeature(FEATURE+"namespace-prefixes", true);
				factory.setFeature(FEATURE+"validation", true);
				factory.setFeature(FEATURE+"external-general-entities", true);
				factory.setFeature(FEATURE+"external-parameter-entities", true);
				factory.setFeature(FEATURE+"lexical-handler/parameter-entities", true);
				factory.setFeature(FEATURE+"use-entity-resolver2", true);
				factory.setFeature(FEATURE+"resolve-dtd-uris", true);
			}catch(SAXNotSupportedException snse){
			}catch(ParserConfigurationException pe){
				pe.printStackTrace();
			}catch(SAXNotRecognizedException srge){
				srge.printStackTrace();
			}
			return factory;
		}
}
