package com.Ex26;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="items")
public class Items {
	
	List<Item> item;

	@XmlElement(name ="item")
	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Items(List<Item> item) {
		super();
		this.item = item;
	}

	public Items() {
		super();
	}

	@Override
	public String toString() {
		return "Items [item=" + item + "]";
	}
	

}
