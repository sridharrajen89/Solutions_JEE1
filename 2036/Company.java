package test.com;

import java.util.*;

class EmployeeNotFoundException extends Exception{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	
public EmployeeNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

public EmployeeNotFoundException() {
	// TODO Auto-generated constructor stub
}

public String getErrorMessage() {
	errorMessage="Employee not found in Company";
		return errorMessage;
	}
}

class DuplicateEmployeeIDException extends Exception{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getERRORMESSAGE() {
		final String errorMessage="Duplicate Employee Id, Consider new Id";
		return errorMessage;
	}		
}
// interface for CRUD operation
interface ICompanyServiceProvider{

public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;
public Employee readEmployee(int employeeId) throws EmployeeNotFoundException; 
public boolean  updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException;
public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException;
}

public class Company implements ICompanyServiceProvider{
	   private int companyId;
	   private String companyname;
	   private String companyEmailId;
	   private List<Employee> emplist;
	   
//overloaded constructor
	   
	public Company(int companyId, String companyname, String companyEmailId, List<Employee> emplist) {
		super();
		this.companyId = companyId;
		this.companyname = companyname;
		this.companyEmailId = companyEmailId;
		this.emplist = emplist;
	}
	
//getters and setters

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyname() {
		return companyname;
	}

	public String getCompanyEmailId() {
		return companyEmailId;
	}

	public List<Employee> getEmplist() {
		return emplist;	
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	public void setEmplist(ArrayList<Employee> emplist) {
		this.emplist = emplist;
	}
	
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyname=" + companyname + ", companyEmailId=" + companyEmailId
				+ ", emplist=" + emplist + "]";
	}

	@Override
	  public boolean createEmployee(Employee empobj) throws DuplicateEmployeeIDException{
	    
		int i=0;
		
	    int newempId=empobj.getEmployeeId();
	    	    	    
		for (Employee employees : emplist) {
			if (employees.getEmployeeId()==newempId) {
				i=1;
				}
			
		}
			if (i!=1) {
				emplist.add(empobj);
				return true;
			}
			else {
				throw new DuplicateEmployeeIDException();
			}
										
		}	
	    		    	
		
	 @Override
	  public Employee readEmployee(int pemployeeId) throws EmployeeNotFoundException{
		 
		 int flag = 0;
		 
		 for (Employee employees : emplist) {
				if (employees.getEmployeeId()==pemployeeId) {
					flag = 1;
					return employees;
							
				}
		 }
		 	if (flag!=1)
			{
					throw new EmployeeNotFoundException(companyname);
					
				}
			return null;
		 
		 } 	   
	 		 	 
	 @Override
	  public boolean updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException {
		 
		 int flag = 0;
		 
		 for (Employee employees : emplist) {
				if (employees.getEmployeeId()==employeeId) {
					employees.setEmployeeSalary(newSalary);
					flag = 1;
					break;
				}
		 }
		 if (flag!=1) {
			 	throw new EmployeeNotFoundException(companyname);
		 }
		 else {
		 return true;			 			 
		 	 }
	 }
	 @Override
	  public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException{
		 
		 int flag = 0;
		 
		 for (Employee employees : emplist) {
				if (employees.getEmployeeId()==employeeId) {
					emplist.remove(employees);
					flag = 1;
					break;
				}
		 
		 }
		 if (flag!=1) {
			 	throw new EmployeeNotFoundException();
		 }
		 else {
			 	return true;			 			 
		 }
		 
	 }
		 
	 }
	 
