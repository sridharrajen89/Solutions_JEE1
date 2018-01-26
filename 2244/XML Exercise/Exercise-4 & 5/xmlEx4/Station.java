package com.htc.xmlEx4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "station")
public class Station {
	private String stationNo;
	private String name;
	private String arrivalTime;
	private String departureTime;
	//Constructor
	public Station(String stationNo, String name, String arrivalTime, String departureTime) {
		super();
		this.stationNo = stationNo;
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	@XmlElement
	public String getStationNo() {
		return stationNo;
	}
	public void setStationNo(String stationNo) {
		this.stationNo = stationNo;
	}
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
	@Override
	public String toString() {
		return "Station [stationNo=" + stationNo + ", name=" + name + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + "]";
	}
	
	public Station() {
		super();
	}
}
