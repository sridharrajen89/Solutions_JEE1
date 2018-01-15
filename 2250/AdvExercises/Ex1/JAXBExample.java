package com.adv1.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

	public static void main(String[] args) {
	try {
		
		File file = new File("src\\com\\adv1\\test\\Application.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Application.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Application app = (Application) jaxbUnmarshaller.unmarshal(file);
		
		System.out.println("Application Information : ");
		for(Module m : app.getModule())
		{
			System.out.println(m.getName() + " : \n" + m.getMenuitem1() + " \n" + m.getMenuitem2());
		}
	} catch (JAXBException e) { e.printStackTrace(); }
	}

}
