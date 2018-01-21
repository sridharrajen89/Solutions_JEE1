package htc.test.xslt;

/* the class that is by default used by the java engine is 
transformer class-->com.sun.org.apache.xalan.internal.xsltc.trax.TransformerImpl  
transformer factory-->  com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl
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

public class Exercise2
{

public static void main(String args[])throws Exception
{
DocumentBuilderFactory factory = 
 DocumentBuilderFactory.newInstance();

DocumentBuilder builder = 
     factory.newDocumentBuilder();

//Document document = builder.parse(args[0]); ** pass command line arguments Input xml
Document document = builder.parse("C:\\Dev\\XML\\src\\htc\\test\\xslt\\Exercise2.xml");

DOMSource source = 
     new DOMSource(document);
TransformerFactory tFactory = 
        TransformerFactory.newInstance();
//String xslFile = args[1]; ** pass command line arguments Input style sheet
String xslFile = "C:\\Dev\\XML\\src\\htc\\test\\xslt\\Exercise2.xsl";

Transformer transformer =tFactory.newTransformer(new StreamSource(xslFile));
   
//File newOne = new File(args[2]);** pass command line arguments Output HTML file
File newOne = new File("C:\\Dev\\xml\\Exercise2.html");

StreamResult result = new StreamResult(newOne);
transformer.transform(source,result);
}

}
