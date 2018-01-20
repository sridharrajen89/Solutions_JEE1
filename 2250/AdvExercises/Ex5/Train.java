package com.Ex5;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "train")
public class Train {
	
	private String trainName;
	private String from;
	private String to;
	List<Info> info;
	
	@XmlElement
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	

	@XmlElement
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	

	@XmlElement
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	

	@XmlElement
	public List<Info> getInfo() {
		return info;
	}
	public void setInfo(List<Info> info) {
		this.info = info;
	}
	
	//toString
	@Override
	public String toString() {
		return "Train [trainName=" + trainName + ", from=" + from + ", to=" + to + ", info=" + info + "]";
	}
	
	//Constructor
	public Train(String trainName, String from, String to, List<Info> info) {
		super();
		this.trainName = trainName;
		this.from = from;
		this.to = to;
		this.info = info;
	}
	public Train() {
		super();
	}
	
	
}
