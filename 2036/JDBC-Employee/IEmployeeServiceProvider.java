package test.com;

import java.sql.SQLException;

public interface IEmployeeServiceProvider {
	
	 public boolean insertRecord(Empcrud emp) throws DuplicateEmployeeException, SQLException;
     public Empcrud readRecord(int employeenumber) throws EmployeeNotFndException, SQLException;
     public boolean updateRecord(int employeenumber, double employeesalary) throws EmployeeNotFndException, SQLException;
     public boolean deleteRecord(int employeenumber) throws EmployeeNotFndException, SQLException;

}

class DuplicateEmployeeException extends Exception{
	
	private String errorMessage;
 	
 	public DuplicateEmployeeException(String errorMessage) {
 		this.errorMessage = errorMessage;
 	}
 	
 	public String getErrorMessage( ) {
 		return errorMessage;
 	}
	
}

class EmployeeNotFndException extends Exception{
	
	private String errorMessage;
 	
 	public EmployeeNotFndException(String errorMessage) {
 		this.errorMessage = errorMessage;
 	}
 	
 	public String getErrorMessage( ) {
 		return errorMessage;
 	}
	
}