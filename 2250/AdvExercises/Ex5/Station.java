package com.Ex5;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "station")
public class Station {
	
	private String name;
	private String arrivalTime;
	private String departureTime;
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	@XmlElement
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	//Constructor
	public Station(String name, String arrivalTime, String departureTime) {
		super();
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	
	//toString
	@Override
	public String toString() {
		return "Station [name=" + name + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}
	public Station() {
		super();
	}
	
	
	

}
