package htc.test.user;

public class DuplicateUserException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String ERRORMESSAGE="Duplicate Employee Id, Consider new Id";

	public String getERRORMESSAGE() {
		return ERRORMESSAGE;
	}

}
