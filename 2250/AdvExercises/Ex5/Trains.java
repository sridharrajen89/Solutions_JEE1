package com.Ex5;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trains")
public class Trains {
	
	List<Train> train;
	
	@XmlElement(name = "train")
	public List<Train> getTrain() {
		return train;
	}

	public void setTrain(List<Train> train) {
		this.train = train;
	}

	//Constructor
	public Trains(List<Train> train) {
		super();
		this.train = train;
	}

	@Override
	public String toString() {
		return "Trains [train=" + train + "]";
	}

	public Trains() {
		super();
	}
	
	

}
