package com.htc.xmlEx1;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "application")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationEx1 {
		@XmlElement(name = "module")
		private List<ModuleEx1> module = null;
		public List<ModuleEx1> getModule() {
			return module;
		}
		
		public void setModule(List<ModuleEx1> module) {
			this.module = module;
		}		

}

