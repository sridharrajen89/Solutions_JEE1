package com.Ex27;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMMain {

	public static void main(String[] args) throws TransformerException, SAXException, IOException {
	try {
		
		String filepath = "src\\com\\Ex27\\Courses.xml";
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);
		
		NodeList list = doc.getElementsByTagName("theory-classes");
		Node node = list.item(0);
		Element element = (Element) node;
		Element newnode = doc.createElement("subject");
		Element name1 = doc.createElement("name");
		name1.setTextContent("Hindi");
		Element time1 = doc.createElement("time");
		time1.appendChild(newnode);
		time1.setTextContent("1.00");
		newnode.appendChild(name1);
		newnode.appendChild(time1);
		element.appendChild(newnode);
		
		//Write the content into XML file
		
		DOMSource source = new DOMSource(doc);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		
		StreamResult result = new StreamResult(new File(filepath));
		transformer.transform(source, result);
		} catch(ParserConfigurationException e) { e.printStackTrace();}

	}

}
