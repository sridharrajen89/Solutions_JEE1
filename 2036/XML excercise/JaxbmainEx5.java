package com.htc.advnJava;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbmainEx5 {

	public static void main(String[] args) {
		
		File configFile = new File("Trains.xml");
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Trains trains = (Trains) jaxbUnmarshaller.unmarshal(configFile);
		
		List<Station> st = new ArrayList<Station>();
		Station st1 = new Station("HYD","S12","S13");
		st.add(st1);
		Journeyinfo info = new Journeyinfo();
		info.setStation(st);
		List<Journeyinfo> i1 = new ArrayList<Journeyinfo>();
		i1.add(info);
		List<Train> tr = new ArrayList<Train>();
		Train t = new Train("Cheran","CHN","TRC",(List<Journeyinfo>) i1);
		tr.add(t);
		trains.setTrain(tr);
		
		//Unmarshalling 
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
		marshaller.marshal(trains, configFile);
			} catch (JAXBException e) { e.printStackTrace(); }
	}
}


