package com.htc.xmlEx2;

/* the class that is by default used by the java engine is 
transformer class-->com.sun.org.apache.xalan.internal.xsltc.trax.TransformerImpl  
transformer factory-->  com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl
 */

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import java.io.File;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class XSLTransformer
{
	public static void main(String args[])throws Exception
	{
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File("src\\com\\htc\\xmlEx2\\Place.xsl")));
			StreamSource sourcepath = new StreamSource(new File("src\\com\\htc\\xmlEx2\\Place.xml"));
			StreamResult resultpath = new StreamResult("src\\\\com\\\\htc\\\\xmlEx2\\\\Place.html");
			transformer.transform(sourcepath, resultpath);
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}