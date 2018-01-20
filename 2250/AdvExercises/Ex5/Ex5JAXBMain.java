package com.Ex5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Ex5JAXBMain {

	public static void main(String[] args) {
	
		
		File configFile = new File("src\\com\\Ex5\\Trains.xml");
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
		//Read XML
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Trains trains = (Trains) jaxbUnmarshaller.unmarshal(configFile);
		
		List<Station> st = new ArrayList<Station>();
		Station st1 = new Station("Chennai","a12","a12");
		st.add(st1);
		Info info = new Info();
		info.setStation(st);
		List<Info> i1 = new ArrayList<Info>();
		i1.add(info);
		List<Train> tr = new ArrayList<Train>();
		Train t = new Train("abc","asd","asd",(List<Info>) i1);
		tr.add(t);
		trains.setTrain(tr);
		
		//Unmarshalling 
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
		marshaller.marshal(trains, configFile);
			} catch (JAXBException e) { e.printStackTrace(); }
	}

}
