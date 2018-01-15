/**
 * 
 */
package com.htcinc.dom;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import com.htcinc.jaxbappresult.AppType;
import com.htcinc.jaxbappresult.ModuleType;

/**
 * @author Sree
 *
 */
public class XmlAppOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws DatatypeConfigurationException {
		// TODO Auto-generated method stub
		
		try {

			// unmarshal 
			JAXBContext jaxPlayer=JAXBContext.newInstance("com.htcinc.jaxbappresult");
			Unmarshaller umPlay=jaxPlayer.createUnmarshaller();
		    JAXBElement<AppType> jaxTeam=(JAXBElement<AppType>)umPlay.unmarshal(new File("application.xml"));
		    AppType team=jaxTeam.getValue();

		   List<ModuleType> mod=team.getModule();
		   System.out.println("Done");
			} catch (JAXBException e) {
					e.printStackTrace();
				} 
	}
}


