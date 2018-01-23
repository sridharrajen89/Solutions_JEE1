package com.xml.ex;

/*  Ex 2 - Write XSL and XSLT Transformer class 
 * to transform the Places XML into an HTML page. 
 * Transformer class takes placeId as parameter and 
 * display the complete information in a table. 
 * PlacesEx.xml
 * PlacesEx.xsl
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;
import java.io.File;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class XSLTransformerEx2
{

public static void main(String args[])throws Exception
{
DocumentBuilderFactory factory = 
 DocumentBuilderFactory.newInstance();

DocumentBuilder builder = 
     factory.newDocumentBuilder();

Document document = builder.parse(args[0]);
System.out.println("Document to Transform: " + args[0]);

System.out.println("Place ID: " + args[1]);

DOMSource source = 
     new DOMSource(document.getElementById(args[1]));

TransformerFactory tFactory = 
        TransformerFactory.newInstance();
String xslFile = args[2];
System.out.println("XSL file used to tranform: " + xslFile);

Transformer transformer = 
        tFactory.newTransformer(new StreamSource(xslFile));
   
File newOne = new File("c:\\java\\Places.html");

StreamResult result = new StreamResult(newOne);
transformer.transform(source,result);
}

}