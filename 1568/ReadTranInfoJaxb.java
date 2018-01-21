package com.htcinc.adjavaex;

import java.io.File;
import java.math.BigInteger;
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

import com.htcinc.jaxbtrainresult.*;

public class ReadTrainInfoJaxb {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			// unmarshal 
			JAXBContext jaxbVehicle = JAXBContext.newInstance("com.htcinc.jaxbtrainresult");
			Unmarshaller umApp = jaxbVehicle.createUnmarshaller();
			JAXBElement<VehicleType> jaxbVehType = (JAXBElement<VehicleType>)umApp.unmarshal(new File("trains.xml"));
			VehicleType veh = jaxbVehType.getValue();
			
			List<TrainType> trainType = veh.getTrain();
			for(TrainType train:trainType){
							}
			
			ObjectFactory obj=new ObjectFactory();
			
			//Create date as GregorianCalendar  
			GregorianCalendar trainTimeAsGC=new GregorianCalendar(2018,01,20,10,30);
			//Create an instance of DataTypeFactory by calling newInstance method
			DatatypeFactory dataTypeFactory=DatatypeFactory.newInstance();
			//Call an instance method newXMLGregorianCalendar which takes GregorianCalendar object as parameter
			XMLGregorianCalendar xmlGCTtime = dataTypeFactory.newXMLGregorianCalendar(trainTimeAsGC);
			
			StationType station = obj.createStationType();
			station.setNo("TPT01");
			station.setName("Kadapa");
			station.setArrivalTime(xmlGCTtime);
			trainTimeAsGC.set(2018, 01, 20, 07, 10, 00);
			xmlGCTtime = dataTypeFactory.newXMLGregorianCalendar(trainTimeAsGC);
			station.setDepartureTime(xmlGCTtime);
			
			JourneyType journey = obj.createJourneyType();
			journey.getStation().add(station);
			TrainType train = obj.createTrainType();
			train.setNo("TR11098");
			train.setTrainName("Rayalaseema Express");
			train.setFrom("Tirupati");
			train.setTo("Chennai");
			train.setJourneyInfo(journey);

			veh.getTrain().add(train);
			JAXBElement<VehicleType> jaxNewVehicle=obj.createTrains(veh);

			Marshaller marshal= jaxbVehicle.createMarshaller();
			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshal.marshal(jaxNewVehicle, new File("C:\\Users\\Sree\\Documents\\HTC Java\\trains.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		} 
	}
}
