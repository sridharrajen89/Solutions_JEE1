package com.Ex26;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.Ex5.Info;
import com.Ex5.Station;
import com.Ex5.Train;
import com.Ex5.Trains;

public class Ex26Main {
public static void main(String[] args) {
	
		
		File configFile = new File("src\\com\\Ex26\\markets.xml");
		try {
		JAXBContext jaxbContext = JAXBContext.newInstance(Markets.class);
		//Read XML
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Markets markets = (Markets) jaxbUnmarshaller.unmarshal(configFile);
		
		List<Market> mt = markets.getMarket();
		List<Items> items = mt.get(0).getItems();
		List<Item> it = items.get(0).getItem();
		
		Double minc = it.get(0).getItemcost();
		Double maxc = it.get(0).getItemcost();
		String minitemid = it.get(0).getItemid();
		String minitemname = it.get(0).getItemname();
		String maxitemid = it.get(0).getItemid();
		String maxitemname = it.get(0).getItemname();
		for(Item it1 : it)
		{
			if(it1.getItemcost() < minc)
			{
				minc = it1.getItemcost();
				minitemid = it1.getItemid();
				minitemname = it1.getItemname();
			}
			
			if(it1.getItemcost() > maxc)
			{
				maxc = it1.getItemcost();
				maxitemid = it1.getItemid();
				maxitemname = it1.getItemname();

			}
		}
		
		System.out.println("Cheapest item at Burma Bazar : " + minitemid + " " + minitemname + " " + minc);
		System.out.println("Costliest item at Burma Bazar : " + maxitemid + " " + maxitemname + " " + maxc);
			} catch (JAXBException e) { e.printStackTrace(); }
	}


}
