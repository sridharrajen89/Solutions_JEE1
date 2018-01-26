package com.htc.xmlEx4;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "train")
public class Train {
	private String trainNo;
	private String trainName;
	private String from;
	private String to;
	List<JourneyInfo> info;
	
	@XmlElement
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	
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
	public List<JourneyInfo> getInfo() {
		return info;
	}		
	public void setInfo(List<JourneyInfo> info) {
		this.info = info;
	}

	public Train() {
		super();
	}
	//Constructor
	public Train(String trainNo, String trainName, String from, String to, List<JourneyInfo> info) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.from = from;
		this.to = to;
		this.info = info;
	}
	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", from=" + from + ", to=" + to + ", info="
				+ info + "]";
	}
	
}
