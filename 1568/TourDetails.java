package com.htcinc.adjavaex;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;



public class TourDetails {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		// TODO Auto-generated method stub

		DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(args[0]);
		DOMSource source = new DOMSource(document.getElementById(args[1]));

		TransformerFactory tFactory = TransformerFactory.newInstance();
		String xslFile = args[2];
		Transformer transformer = tFactory.newTransformer(new StreamSource(xslFile));
		File newOne = new File("C:\\Users\\Sree\\Documents\\HTC Java\\Placeshima.html");
		StreamResult result = new StreamResult(newOne);
		transformer.transform(source,result);
				}

				}