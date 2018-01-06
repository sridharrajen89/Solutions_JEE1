package com.htc.dec29;

public class Pet {
	
	private String pname;
	private String pcost;

	/**
	 * 
	 */
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pname
	 * @param pcost
	 */
	public Pet(String pname, String pcost) {
		this.pname = pname;
		this.pcost = pcost;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcost() {
		return pcost;
	}

	public void setPcost(String pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "Pet [pname=" + pname + ", pcost=" + pcost + "]";
	}

}
