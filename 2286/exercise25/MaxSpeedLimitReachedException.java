package com.java.training.exercise25.bike;

public class MaxSpeedLimitReachedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ERROR_MSG;		

	public String getERROR_MSG() {
		return ERROR_MSG;
	}

	public void setERROR_MSG(String eRROR_MSG) {
		ERROR_MSG = eRROR_MSG;
	}

	public MaxSpeedLimitReachedException( String errorMSG) {
		super();
		this.ERROR_MSG = errorMSG;
	} 

}
