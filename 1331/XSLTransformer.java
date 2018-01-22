package ex2;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;
import java.io.File;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class XSLTransformer
{

 public static void main(String args[])throws Exception
 {
  DocumentBuilderFactory factory = 
   DocumentBuilderFactory.newInstance();
  
  DocumentBuilder builder = 
       factory.newDocumentBuilder();
  
  Document document = builder.parse("C:/Users/mail2/Documents/workspace-sts-3.9.0.RELEASE/HtcTraining/src/com/htc/applytemplate/places.xml");

  DOMSource source =  new DOMSource(document.getElementById("T100"));
  TransformerFactory tFactory = 
          TransformerFactory.newInstance();
  String xslFile = "C:/Users/mail2/Documents/workspace-sts-3.9.0.RELEASE/HtcTraining/src/com/htc/applytemplate/placescon4.xsl";

  Transformer transformer = 
          tFactory.newTransformer(new StreamSource(xslFile));
     
  File newOne = new File("C:/Users/mail2/Documents/workspace-sts-3.9.0.RELEASE/HtcTraining/src/com/htc/applytemplate/out.html");

  StreamResult result = new StreamResult(newOne);
  transformer.transform(source,result);
  
  System.out.println("Done");
 }

}