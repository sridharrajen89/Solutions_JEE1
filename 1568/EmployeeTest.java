package com.htcinc.weektwo;

import java.util.ArrayList;

 class Employee {
	
	  private int employeeId;
	  private String employeeName;
	  private double employeeSalary;
	  
	  public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	  // construrctors
	  // setters , getters 
	  // toString,equals,hashCode
	}

	// User defined exceptions

	class EmployeeNotFoundException extends Exception{
	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	private String errorMessage;
	  // construtor
	  // getter
	public String getErrorMessage() {
		return errorMessage;
	}
	public EmployeeNotFoundException() {
		super();
		this.errorMessage = errorMessage;
	}
	}

	class DuplicateEmployeeIDException extends Exception{
	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	final String ERRORMESSAGE="Duplicate Employee Id, Consider new Id";
	  // getter
	public String getERRORMESSAGE() {
		return ERRORMESSAGE;
	}
	}


	// interface for CRUD operation
	interface ICompanyServiceProvider{

	  public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;
	  public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException; 
	  public boolean  updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException;
	  public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException;

	}

	class Company implements ICompanyServiceProvider{
	  
	   public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyEmailId() {
		return companyEmailId;
	}
	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}
	public ArrayList<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(ArrayList<Employee> emplist) {
		this.emplist = emplist;
	}
	 public Company(int companyId, String companyname, String companyEmailId, ArrayList<Employee> emplist) {
		super();
		this.companyId = companyId;
		this.companyname = companyname;
		this.companyEmailId = companyEmailId;
		this.emplist = emplist;
	}
	private int companyId;
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyname=" + companyname + ", companyEmailId=" + companyEmailId
				+ ", emplist=" + emplist + "]";
	}
	private String companyname;
	   private String companyEmailId;
	   private ArrayList<Employee> emplist;// has-A relation ship 
	   // construtors
	   // setters , getters 
	   // hashCode,equals,toString 

	  @Override
	  public boolean createEmployee(Employee empobj) throws DuplicateEmployeeIDException{
	    
	    return emplist.add(empobj);

	  }
	  @Override
	  public Employee readEmployee(int pemployeeId) throws  EmployeeNotFoundException{
		  
		  for (Employee emp1 : emplist) {
			    if (emp1.getEmployeeId()==pemployeeId) {
			    	emplist.add(pemployeeId, emp1);
			    	//throw new EmployeeNotFoundException();
			    }
			    
			    
			}

	      return null; 
	      
	  }
	  @Override
	  public boolean updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException {
		  
		  for (Employee emp1 : emplist) {
			    if (emp1.getEmployeeId()==employeeId) {
			    	emp1.setEmployeeSalary(newSalary);
			    	//throw new EmployeeNotFoundException();  
			    }
			}
	return true;
	    }
	  @Override
	  public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException{
		  for (Employee emp1 : emplist) {
			    if (emp1.getEmployeeId()==employeeId) {
			    	emplist.remove(employeeId);
			    	//throw new EmployeeNotFoundException();  
			    }
			}
		  return true;
	}

	}
	//  main method 

	public class EmployeeTest{
		
		public static void main(String[] args) {
		   
	   try{
	        // create objects for Employee 
		   Employee e1 = new Employee(1,"a",200);
		   Employee e2 = new Employee(2,"b",300);
		   Employee e3 = new Employee(4,"c",400);
		   ArrayList<Employee> list = new ArrayList<Employee> ();
		   list.add(e1);
		   list.add(e2);
	        // create object for  Company 
		   Company c = new Company(100,"abc","test",list);
		   c.createEmployee(e3);
		   c.toString();
		   c.deleteEmployee(2);
		   c.toString();
		   c.updateEmployee(1, 600);
		   c.toString();
		   c.readEmployee(2);
		   c.toString();
	        // call the CRUD methods using comapny object   
	       }
	       catch(EmployeeNotFoundException ENF){
	    	   System.err.println("Employee not found Exception: " + ENF.getMessage());
	       }
	       catch(DuplicateEmployeeIDException DEID){
	    	   System.err.println("Duplicate employee Exception: " + DEID.getMessage());
	       }
	       catch(Exception ex){
	    	   //System.err.println("IndexOutOfBoundsException: " + ex.getMessage());
	    	   System.err.println(ex.getMessage());
	       }
	       finally{
	         // list.clear();
	       }
	}
	
	}


