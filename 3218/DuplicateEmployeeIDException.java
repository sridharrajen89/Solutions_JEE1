package com.htc.training;

public class DuplicateEmployeeIDException extends Exception
{
   final private String ERRORMESSAGE = "Duplicate Employee Id, Consider new Id";

public String getERRORMESSAGE() {
	return ERRORMESSAGE;
}

}
