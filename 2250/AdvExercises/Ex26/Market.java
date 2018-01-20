package com.Ex26;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="market")
public class Market {
	
	private String area;
	private String marketname;
	private List<Items> items;
	
	@XmlElement
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@XmlElement
	public String getMarketname() {
		return marketname;
	}
	public void setMarketname(String marketname) {
		this.marketname = marketname;
	}
	
	@XmlElement
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	public Market(String area, String marketname, List<Items> items) {
		super();
		this.area = area;
		this.marketname = marketname;
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "Market [area=" + area + ", marketname=" + marketname + ", items=" + items + "]";
	}
	public Market() {
		super();
	}

}
