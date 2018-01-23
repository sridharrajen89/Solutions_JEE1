package com.htc.JEE;

/**
 * Write a JAXB program to read Application XML into a Java Program. 
 * TrainEx4.xml
 * TrainEx4.xsd
 */
import java.io.File;
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

public class JaxbTrain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			// unmarshal 
			JAXBContext jaxbVehicle = JAXBContext.newInstance("com.htc.JEE");
			Unmarshaller umApp = jaxbVehicle.createUnmarshaller();
			JAXBElement<VehicleType> jaxbVehType = (JAXBElement<VehicleType>)umApp.unmarshal(new File("train.xml"));
			VehicleType veh = jaxbVehType.getValue();
			
			List<TrainType> trainType = veh.getTrain();
			for(TrainType train:trainType){
				System.out.println(train.getTrainName());
				System.out.println(train.getFrom());
				System.out.println(train.getTo());
				System.out.println();
			}
			
			ObjectFactory obj=new ObjectFactory();
			
			StationType station = obj.createStationType();
			station.setNo("S03");
			station.setName("Chennai");
			
			//Create date as GregorianCalendar  
			GregorianCalendar trainTimeAsGC=new GregorianCalendar(2018,01,14,06,30);
			//Create an instance of DataTypeFactory by calling newInstance method
			DatatypeFactory dataTypeFactory=DatatypeFactory.newInstance();
			//Call an instance method newXMLGregorianCalendar which takes GregorianCalendar object as parameter
			XMLGregorianCalendar xmlGCTtime = dataTypeFactory.newXMLGregorianCalendar(trainTimeAsGC);
			
			station.setArrivalTime(xmlGCTtime);
			
			trainTimeAsGC.set(2018, 01, 14, 07, 00, 00);
			xmlGCTtime = dataTypeFactory.newXMLGregorianCalendar(trainTimeAsGC);
			
			station.setDepartureTime(xmlGCTtime);
			
			JourneyType journey = obj.createJourneyType();
			journey.getStation().add(station);
			
			TrainType train = obj.createTrainType();
			train.setNo("15223");
			train.setTrainName("Kacheguda Express");
			train.setFrom("Chennai");
			train.setTo("Hyderbad");
			train.setJourneyInfo(journey);

			veh.getTrain().add(train);
			JAXBElement<VehicleType> jaxNewVehicle=obj.createTrains(veh);

			Marshaller marshal= jaxbVehicle.createMarshaller();
			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshal.marshal(jaxNewVehicle, new File("train.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		} 
	}
}