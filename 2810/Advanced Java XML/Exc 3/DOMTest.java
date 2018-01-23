package com.htc.JEE;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.htc.DOM.DocTest;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMTest  {

	static final String JAXP_SCHEMA_LANGUAGE =
		        "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	public Document createDocument(String xmlFile){
		Document doc = null;
		try {
			DocumentBuilderFactory   dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(true);
			dbf.setNamespaceAware(true);
			try {
				dbf.setAttribute(JAXP_SCHEMA_LANGUAGE,XMLConstants.W3C_XML_SCHEMA_NS_URI);
			}
			catch(IllegalArgumentException iae) {}
				   
			DocumentBuilder db = dbf.newDocumentBuilder();
			MyDefHandler dh = new MyDefHandler();
			db.setErrorHandler(dh);
			doc = db.parse(new File(xmlFile));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	public static void main(String[] args)throws Exception {
		DocTest mainObj=new DocTest();
		Document doc=mainObj.createDocument("tour.xml");
		Element root=doc.getDocumentElement();
		NodeList tourList=root.getElementsByTagName("place");
		for(int i=0;i<tourList.getLength();i++){
			Node tour=tourList.item(i);
			if(tour.getNodeType()==Node.ELEMENT_NODE){
				Element tourEle=(Element)tour;
				NodeList placeNamesList=tourEle.getElementsByTagName("name");
				Node firtName=null;
				for(int j=0;j<placeNamesList.getLength();j++){
					firtName=placeNamesList.item(j);
					System.out.println(firtName.getFirstChild().getNodeValue());
				}

			}
		}

	}
}