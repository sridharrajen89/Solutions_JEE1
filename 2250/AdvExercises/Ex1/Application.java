package com.adv1.test;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "application")
@XmlAccessorType(XmlAccessType.FIELD)
public class Application {
		
		@XmlElement(name = "module")
		private List<Module> module = null;

		public List<Module> getModule() {
			return module;
		}

		public void setModule(List<Module> module) {
			this.module = module;
		}
		
}
