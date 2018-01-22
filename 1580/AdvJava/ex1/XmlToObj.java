/**
 * @author narayana Tangudu
 *
 */
package ex1;
import java.io.File;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  
   
public class XmlToObj {

	public static void main(String[] args) {  
		   
	     try {  
	   
	        File file = new File("src/ex1/application.xml");  
	        JAXBContext jaxbContext = JAXBContext.newInstance(application.class);  
	   
	    	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			application app = (application) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println("Application Information : ");
			for(Module m : app.getModule())
			{
				System.out.println(m.getName() + " : \n" + m.getMenuitem1() + " \n" + m.getMenuitem2());
			}
		} catch (JAXBException e) { e.printStackTrace(); }
		
	   
	      
	}  
}
