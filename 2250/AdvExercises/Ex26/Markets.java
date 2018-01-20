package com.Ex26;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="markets")
public class Markets {
	
	List<Market> market;

	@XmlElement
	public List<Market> getMarket() {
		return market;
	}

	public void setMarket(List<Market> market) {
		this.market = market;
	}

	public Markets(List<Market> market) {
		super();
		this.market = market;
	}

	@Override
	public String toString() {
		return "Markets [market=" + market + "]";
	}

	public Markets() {
		super();
	}

}
