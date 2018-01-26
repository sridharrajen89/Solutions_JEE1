package com.htc.xmlEx1;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {
	public static void main(String[] args) {
	try {
		File file = new File("src\\com\\htc\\xmlEx1\\Application.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(ApplicationEx1.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ApplicationEx1 application = (ApplicationEx1) jaxbUnmarshaller.unmarshal(file);		

		System.out.println("Content of Application XML.. ");
		for(ModuleEx1 m : application.getModule())
		{
			System.out.println("Module Name: "+m.getName() + "\n" +"menuitem1: "+ m.getMenuitem1() + "\n" +"menuitem2: "+ m.getMenuitem2());
		}
	} catch (JAXBException e) { e.printStackTrace(); }

	}

}
