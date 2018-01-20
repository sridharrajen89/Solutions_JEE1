package com.Ex26;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="item")
public class Item {
	private String itemid;
	private String itemname;
	private Double itemcost;
	
	@XmlElement(name = "item-id")
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	
	@XmlElement(name = "item-name")
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	@XmlElement(name = "item-cost")
	public Double getItemcost() {
		return itemcost;
	}
	public void setItemcost(Double itemcost) {
		this.itemcost = itemcost;
	}
	public Item(String itemid, String itemname, Double itemcost) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemcost = itemcost;
	}
	public Item() {
		super();
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", itemcost=" + itemcost + "]";
	}
	
}
