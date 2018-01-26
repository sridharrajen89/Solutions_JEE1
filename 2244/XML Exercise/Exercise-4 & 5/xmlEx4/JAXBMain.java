package com.htc.xmlEx4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBMain {
	public static void main(String[] args) {
		File configFile = new File("C:\\sts-3.9.0\\.metadata\\Practice\\Java Project\\src\\com\\htc\\xmlEx4\\trains.xml");
		try {
				JAXBContext jaxbContext = JAXBContext.newInstance(TrainType.class);
				//Read XML
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				TrainType trains = (TrainType) jaxbUnmarshaller.unmarshal(configFile);
				List<Station> st = new ArrayList<Station>();				
				Station st1 = new Station("1","Chennai","01/21","01/22");
				st.add(st1);
				JourneyInfo info = new JourneyInfo();
				//info.setStation(st);
				List<JourneyInfo> i1 = new ArrayList<JourneyInfo>();
				info.setStation(st);
				i1.add(info);
				List<Train> tr = new ArrayList<Train>();
				Train t = new Train("TR12760","Chennai Express","Chennai","Ooty",(List<JourneyInfo>) i1);
				tr.add(t);
				trains.setTrain(tr);					
				//Unmarshalling 
				Marshaller marshaller = jaxbContext.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
				marshaller.marshal(trains, configFile);
			} catch (JAXBException e) 
				{ 
					e.printStackTrace(); 
				}

	}



}
