package com.htc.advnJava;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

public class XSLTransformerEx2 {
	
	public static void main(String args[])throws Exception
	 {
	  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	  
	  DocumentBuilder builder = factory.newDocumentBuilder();
	  
	  Document document = builder.parse(args[0]);

	  DOMSource source = new DOMSource(document);
	  TransformerFactory tFactory = TransformerFactory.newInstance();
	  String xslFile = args[1];

	  Transformer transformer = tFactory.newTransformer(new StreamSource(xslFile));
	  	     
	  File newOne = new File(args[2]);

	  StreamResult result = new StreamResult(newOne);
	  transformer.transform(source,result);
	 }

}
