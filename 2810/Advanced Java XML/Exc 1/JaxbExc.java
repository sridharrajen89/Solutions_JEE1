	package com.htc.JEE;

	import java.io.File;
	import javax.xml.bind.JAXBContext;
	import javax.xml.bind.JAXBException;
	import javax.xml.bind.Unmarshaller;

	public class JaxbExc {
		public static void main(String[] args) {
			try {
				// unmarshal 
				JAXBContext jaxApp=JAXBContext.newInstance(Application.class);
				Unmarshaller umApp=jaxApp.createUnmarshaller();
				Application jaxmodule=(Application)umApp.unmarshal(new File("Applications.xml"));
				for(Module mod:jaxmodule.getModule()){
					System.out.println(mod.getName() + " : \n" + mod.getMenuitem1() + " \n" + mod.getMenuitem2());
					}
			} catch (JAXBException e) {
				e.printStackTrace();
			} 
		}
	}
