package com.htc.JEE;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="module")
@XmlAccessorType(XmlAccessType.FIELD)
public class Module {
	@XmlAttribute
	private String name;
	@XmlElement
	private String menuitem1;
	@XmlElement
	private String menuitem2;
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMenuitem1() {
		return menuitem1;
	}
	public void setMenuitem1(String menuitem1) {
		this.menuitem1 = menuitem1;
	}
	public String getMenuitem2() {
		return menuitem2;
	}
	public void setMenuitem2(String menuitem2) {
		this.menuitem2 = menuitem2;
	}
	
	//toString
	@Override
	public String toString() {
		return "Module [name=" + name + ", menuitem1=" + menuitem1 + ", menuitem2=" + menuitem2 + "]";
	}
		
}
