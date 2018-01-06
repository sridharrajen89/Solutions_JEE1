package com.htc.dec30;

@SuppressWarnings("serial")
public class DuplicateEmployeeIDException extends Exception
{
	private String errorMessage;
	
   /**
	 * @param errorMessage
	 */
	public DuplicateEmployeeIDException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

public String getErrorMessage() {
	return errorMessage;
}





}
