package htc.xml.jaxb;

import java.util.List;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;



public class Exercise5_Trains {
	public static void main(String[] args) {

		try {
			JAXBContext jaxTrain=JAXBContext.newInstance("htc.xml.jaxb");
 			Unmarshaller umTrain=jaxTrain.createUnmarshaller();
 			JAXBElement<TransportationType> jaxTransport=(JAXBElement<TransportationType>)umTrain.unmarshal(new File("Exercise4_Trains.xml"));
 			TransportationType trn=jaxTransport.getValue();
 			
 			ObjectFactory obj=new ObjectFactory();

			//Create date as GregorianCalendar  
			//Create an instance of DataTypeFactory by calling newInstance method
			DatatypeFactory dataTypeFactory=DatatypeFactory.newInstance();

			//Call an instance method newXMLGregorianCalendar which takes GregorianCalendar object as parameter
			int hours_arr =11;
			int minutes_arr=00;
			int seconds_arr=00;
			int timeZone_arr=00;

			int hours_dep =11;
			int minutes_dep=00;
			int seconds_dep=00;
			int timeZone_dep=00;

			XMLGregorianCalendar arrivalTime=dataTypeFactory.newXMLGregorianCalendarTime(hours_arr , minutes_arr, seconds_arr, timeZone_arr);
			XMLGregorianCalendar departureTime=dataTypeFactory.newXMLGregorianCalendarTime(hours_dep , minutes_dep, seconds_dep, timeZone_dep);


			StationType stnType=obj.createStationType();
			stnType.setName("Mysuru");
			stnType.setArrivalTime(arrivalTime);
			stnType.setDepartureTime(departureTime);
			stnType.setNo("002");
			
			JourneyType journey = obj.createJourneyType();
			journey.getStation().add(stnType);

			TrainType trainType=obj.createTrainType();
			trainType.setTrainName("Bengaluru shatabdi");
			trainType.setFrom("Bengaluru");
			trainType.setTo("Srinagar");
			trainType.setNo("Tr0001");
			trainType.setJourneyInfo(journey);
			
			trn.getTrain().add(trainType);
			JAXBElement<TransportationType> jaxNewTrain=obj.createTrains(trn);
 			
 			Marshaller marshal=jaxTrain.createMarshaller();
 			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

 			marshal.marshal(jaxNewTrain, new File("NewTrain.xml"));
 			System.out.println("Done");
 			
 		} catch (JAXBException e) {
 			e.printStackTrace();
 		} catch (DatatypeConfigurationException e) {
 			e.printStackTrace();
 		} 
 	}
 }	