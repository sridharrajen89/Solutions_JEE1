package com.htc.xmlEx4;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trains")
public class TrainType {
	List<Train> train;
	@XmlElement(name = "train")
	public List<Train> getTrain() {
		return train;
	}
	public void setTrain(List<Train> train) {
		this.train = train;
	}
	//Constructor
	public TrainType(List<Train> train) {
		super();
		this.train = train;
	}
	@Override
	public String toString() {
		return "Trains [train=" + train + "]";
	}
	public TrainType() {
		super();

	}

}
