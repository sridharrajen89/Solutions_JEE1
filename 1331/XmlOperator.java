package ex1;

import java.io.File;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class XmlOperator {
	public static void main(String[] args) {
		
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance("assignment3");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Unmarshaller unmarshaller = null;
		try {
			unmarshaller = context.createUnmarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JAXBElement<ModulesType> root = null;
		try {
			root = (JAXBElement<ModulesType>) 
					unmarshaller.unmarshal(new File("src/assignment3/application.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModulesType rootele=root.getValue();
			

		List<ModuleType> studentList=rootele.getModule();
		
		for (ModuleType student : studentList) {
			System.out.println("Module id    " + student.getName());
			System.out.println("Module item1 " + student.getMenuitem1());
			System.out.println("Module item2 " + student.getMenuitem2());
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}
		
		
		
	}
}