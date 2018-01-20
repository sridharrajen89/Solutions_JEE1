package com.Ex5;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "journey-info")
public class Info {
	
	List<Station> station = new ArrayList<Station>();

	@XmlElement
	public List<Station> getStation() {
		return station;
	}

	public void setStation(List<Station> station) {
		this.station = station;
	}

	@Override
	public String toString() {
		return "Info [station=" + station + "]";
	}

	public Info() {
		super();
	}
	
	

}
