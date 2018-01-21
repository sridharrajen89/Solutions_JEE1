package htc.xml.dom;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import java.io.File;
import java.util.Scanner;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Exercise3  {

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

	public boolean saveDoc(Document doc, String filePath) {
		boolean ret = false;
		try {
			DOMImplementation impl = doc.getImplementation();		
			DOMImplementationLS implLS =(DOMImplementationLS) impl.getFeature("LS","3.0");
			MyDocErrHandler docErr =new MyDocErrHandler();
			LSSerializer writer =implLS.createLSSerializer(); 
			writer.getDomConfig().setParameter("error-handler",docErr);
			//writer.getDomConfig().setParameter("discard-default-content", true);
			writer.getDomConfig().setParameter("format-pretty-print",true);
			ret = writer.writeToURI(doc,filePath);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ret;
	}	
	public void processChilds(Node currentChild){
		System.err.println(currentChild.getNodeName());	
		if(currentChild.hasChildNodes()){
			NodeList grandChild=currentChild.getChildNodes();
			for(int i=0;i<grandChild.getLength();i++){
				processChilds(grandChild.item(i));
			}
		}else{
			if(currentChild.getNodeType()==Node.TEXT_NODE){
				String value=currentChild.getNodeValue().trim();
				if(value.length()>0)System.out.println(value);
			}
		}
	}
	public static void main(String[] args)throws Exception {
		Exercise3 mainObj=new Exercise3();
		Document doc=mainObj.createDocument("Exercise3.xml");
		Element root=doc.getDocumentElement();
		String ns=doc.getNamespaceURI();

		NodeList placesList=root.getElementsByTagName("place");
		for(int i=0;i<placesList.getLength();i++){
			Node place=placesList.item(i);
			if(place.getNodeType()==Node.ELEMENT_NODE){
				Element placeEle=(Element)place;
				NodeList nameList=placeEle.getElementsByTagName("name");
				Node name=null;
				for(int j=0;j<nameList.getLength();j++){
					name=nameList.item(j);
					System.out.println(name.getFirstChild().getNodeValue());
				}

			}
		}
	}
}
