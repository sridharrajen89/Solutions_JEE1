package ex3;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RAedXMLusingDoM {
	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = null;
		Document doc=null;
		try {
			builder=factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			doc=builder.parse("C:/Users/mail2/Documents/workspace-sts-3.9.0.RELEASE/HtcTraining/src/ex3/tour.xml");
			System.out.println("parsed");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		NodeList placeList=doc.getElementsByTagName("place");
		for (int i = 0; i <placeList.getLength(); i++) 
		{
			Node placeNode=placeList.item(i);
			if(placeNode.getNodeType()==Node.ELEMENT_NODE)
			{
				Element place=(Element)placeNode;
				String code = place.getAttribute("code");
				String tag = place.getTagName();
				System.out.println(code + "--" + tag);
				
				NodeList attaractionsList=place.getChildNodes();
				
				for (int j = 0; j < attaractionsList.getLength(); j++) 
				{
					Node attarctionNode=attaractionsList.item(j);
					if(attarctionNode.getNodeType() == Node.ELEMENT_NODE)
					{
						Element attractionChlid=(Element)attarctionNode;
						NodeList attractionDetails=attractionChlid.getChildNodes(); 
						for (int k=0;k<attractionDetails.getLength() ; k++)
						{	
							Node attaractionDetailsTags=attractionDetails.item(k);
							if(attaractionDetailsTags.getNodeType() == Node.ELEMENT_NODE)
							{	
								Element attaractionDetailsTagsElement=(Element)attaractionDetailsTags;	
								NodeList noOfTags = attaractionDetailsTagsElement.getChildNodes();
								for (int l=0;l<noOfTags.getLength() ; l++)
								{
									Node eachTag = noOfTags.item(l);
									if(eachTag.getNodeType() == Node.ELEMENT_NODE)
									{
										Element eachTagElement = (Element)eachTag;
										System.out.println(eachTagElement.getTagName() + " <---->" + eachTagElement.getTextContent());
									}
								}
							}
						}	
					}	
				}	
				
			}
		}	
					
		
	}

}
