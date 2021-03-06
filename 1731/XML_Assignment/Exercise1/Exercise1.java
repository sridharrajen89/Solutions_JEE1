package htc.xml.jaxb;

/**
 * Write a JAXB program to read Application XML into a Java Program. 
 * Application.xml
 * Application.xsd
 */
import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Exercise1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			// unmarshal 
			JAXBContext jaxbApp = JAXBContext.newInstance("htc.xml.jaxb");
			Unmarshaller umApp = jaxbApp.createUnmarshaller();
			JAXBElement<AppType> jaxbAppType = (JAXBElement<AppType>)umApp.unmarshal(new File("Exercise1.xml"));
			AppType app = jaxbAppType.getValue();
			
			List<ModType> module = app.getModule();
			for(ModType mod:module){
				System.out.println(mod.getName());
				System.out.println(mod.getMenuitem1());
				System.out.println(mod.getMenuitem2());
				System.out.println();
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} 
	}
}
