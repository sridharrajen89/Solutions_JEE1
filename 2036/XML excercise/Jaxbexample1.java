package com.htc.advnJava;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.htc.advnJava.Application;
import com.htc.advnJava.Module;

public class Jaxbexample1 {
	public static void main(String[] args) {

	 try {

		File file = new File("Application.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Application.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Application app = (Application) jaxbUnmarshaller.unmarshal(file);
		
		for (Module mod:app.module) {
			System.out.println("name item:"+mod.getName()+"  menuitem1:"+mod.getMenuitem1()+"  menuitem2:"+mod.getMenuitem2());
		}
		 
		/* unmarshal 
					JAXBContext jaxPlayer=JAXBContext.newInstance(Application.class);
					Unmarshaller umPlay=jaxPlayer.createUnmarshaller();
					JAXBElement<Module> jaxTeam=(JAXBElement<Module>)umPlay.unmarshal(new File("Application.xml"));
					Module team=jaxTeam.getValue();
					System.out.println(team);
					
					/*List<Application.Module> players = Module.class;
					for(Application.Module player:players){
						
						}
					}*/
					

	  } catch (JAXBException e) {
		e.printStackTrace();
	  }

	}
}
