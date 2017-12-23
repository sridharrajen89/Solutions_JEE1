package com.test;
import java.io.*;
import java.util.*;
/**
 * @author Radhika
 *
 */
	
	class Employee implements Serializable {
		  /**
		 * 
		 */
		  private static final long serialVersionUID = 1L;
		  private int employeeId;
		  private String employeeName;
		  private double employeeSalary;
		  
		  public Employee(int employeeId, String employeeName, double employeeSalary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		  }
		  
		  public Employee(Employee emp) {
			super();
			this.employeeId = emp.getEmployeeId();
			this.employeeName = emp.getEmployeeName();
			this.employeeSalary = emp.getEmployeeSalary();
		  }
		  /**
		   * 
		  */
		  public Employee() {
			super();
			this.employeeId = 0;
			this.employeeName = "";
			this.employeeSalary = 0;
		  }
		  
		/**
		 * @return the employeeId
		 */
		public int getEmployeeId() {
			return employeeId;
		}
		/**
		 * @param employeeId the employeeId to set
		 */
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		/**
		 * @return the employeeName
		 */
		public String getEmployeeName() {
			return employeeName;
		}
		/**
		 * @param employeeName the employeeName to set
		 */
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		/**
		 * @return the employeeSalary
		 */
		public double getEmployeeSalary() {
			return employeeSalary;
		}
		/**
		 * @param employeeSalary the employeeSalary to set
		 */
		public void setEmployeeSalary(double employeeSalary) {
			this.employeeSalary = employeeSalary;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + employeeId;
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (employeeId != other.employeeId)
				return false;
			return true;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + "]";
		}
		/**
		 * @param employeeId
		 * @param employeeName
		 * @param employeeSalary
		 */

	}

	// User defined exceptions

	class EmployeeNotFoundException extends Exception{
	  /**
		 * 
		 */
	    private String errorMessage;
	    
		/**
		 * @param errorMessage
		 */
		public EmployeeNotFoundException(String errorMessage) {
			super();
			this.errorMessage = errorMessage;
		}

		/**
		 * @return the errorMessage
		 */
		public String getErrorMessage() {
			return errorMessage;
		}
	  
	}

	class DuplicateEmployeeIDException extends Exception{
	  /**
		 * 
		 */
	    final String ERRORMESSAGE="Duplicate Employee Id, Consider new Id";
		/**
		 * @return the eRRORMESSAGE
		 */
		public String getERRORMESSAGE() {
			return ERRORMESSAGE;
		}
	    
	}

	// interface for CRUD operation
	interface ICompanyServiceProvider{
	  public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;
	  public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException; 
	  public boolean  updateEmployee(int employeeId,double newSalary) throws  EmployeeNotFoundException;
	  public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException;
	}
	
	class Company implements Serializable, ICompanyServiceProvider{
		   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int companyId;
		   private String companyName;
		   private String companyEmailId;
		   private HashMap<Integer,Employee> empMap = new HashMap<Integer,Employee>();// has-A relation ship 
		
		/**
		 * 
		 */
		public Company(){
			super();
			this.companyId = 0;
			this.companyName = "";
			this.companyEmailId = "";
			this.empMap = null;
		}
		/**
		 * @param companyId
		 * @param companyName
		 * @param companyEmailId
		 * @param empMap
		 */
		public Company(int companyId, String companyName, String companyEmailId, HashMap<Integer,Employee> empMap) {
			super();
			this.companyId = companyId;
			this.companyName = companyName;
			this.companyEmailId = companyEmailId;
			this.empMap = empMap;
		}
		/**
		 * @return the companyId
		 */
		public int getCompanyId() {
			return companyId;
		}
		/**
		 * @param companyId the companyId to set
		 */
		public void setCompanyId(int companyId) {
			this.companyId = companyId;
		}
		/**
		 * @return the companyName
		 */
		public String getCompanyName() {
			return companyName;
		}
		/**
		 * @param companyName the companyName to set
		 */
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		/**
		 * @return the companyEmailId
		 */
		public String getCompanyEmailId() {
			return companyEmailId;
		}
		/**
		 * @param companyEmailId the companyEmailId to set
		 */
		public void setCompanyEmailId(String companyEmailId) {
			this.companyEmailId = companyEmailId;
		}
		/**
		 * @return the empMap
		 */
		public HashMap<Integer,Employee> getempMap() {
			return empMap;
		}
		/**
		 * @param empMap the empMap to set
		 */
		public void setempMap(HashMap<Integer,Employee> empMap) {
			this.empMap = empMap;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + companyId;
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Company other = (Company) obj;
			if (companyId != other.companyId)
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyEmailId="
					+ companyEmailId + ", empMap=" + empMap + "]";
		}
		
		  @Override
		  public boolean createEmployee(Employee empObj) throws DuplicateEmployeeIDException{
			  if (empMap.get(empObj.getEmployeeId()) != null)
			     throw  new DuplicateEmployeeIDException();
			  empMap.put(empObj.getEmployeeId(),empObj);
			  return true;
		  }
		  @Override
		  public Employee readEmployee(int pEmployeeId) throws  EmployeeNotFoundException{
			  if (empMap.get(pEmployeeId) != null)
				  return empMap.get(pEmployeeId);
			  else 
			     throw  new EmployeeNotFoundException("Employee is not found ");
      
		  }
		  @Override
		  public boolean updateEmployee(int pEmployeeId,double newSalary) throws EmployeeNotFoundException {
			  if (empMap.get(pEmployeeId) != null) {
				  empMap.get(pEmployeeId).setEmployeeSalary(newSalary);
				  return true;
			  }
			  throw  new EmployeeNotFoundException("Employee is not found ");

		  }
		  @Override
		  public boolean deleteEmployee(int pEmployeeId) throws  EmployeeNotFoundException{
			  if (empMap.get(pEmployeeId) != null) {
				  empMap.remove(pEmployeeId);
				  return true;
			  }
		      throw  new EmployeeNotFoundException("Employee is not found ");
		 
		  }
		
		
	}
	
	public class TestMap {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test Map");
		
		Employee e1;
		HashMap<Integer,Employee> empMap = new HashMap<Integer,Employee>();
	    try {
		   e1 = new Employee(001,"Anamika",1111);
	       empMap.put(001,e1);
	       e1 = new Employee(002,"Balu",2222);   
	       empMap.put(002,e1);
	       e1 = new Employee(003,"Catherine",3333);
	       empMap.put(003,e1);
	       e1 = new Employee(004,"David",4444);
	       empMap.put(004,e1);
	       e1 = new Employee(005,"Elizabeth",5555);

	       Company c1 = new Company (001,"HTC","test@htcinc.com",empMap);
	       if(c1.createEmployee(e1))
	    	   System.out.println("Create Successful");;
	       System.out.println(c1.readEmployee(005));
	       if(c1.updateEmployee(002, 9999))
	    	   System.out.println("Update Successful");
	       System.out.println(c1.readEmployee(002));
	       if (c1.deleteEmployee(001));
	       		System.out.println("Delete Successful");
	       System.out.println(c1.readEmployee(001));
	    }
	    catch(EmployeeNotFoundException ENF){
	    	System.out.println("In EmployeeNotFoundException");
	    	ENF.printStackTrace();
	       }
	    catch(DuplicateEmployeeIDException ENF){
	    	System.out.println("In DuplicateEmployeeIDException");
	    	ENF.printStackTrace();
	       }
	    catch(Exception ex){
	    	System.out.println("In Exception");
	    	ex.printStackTrace();
	       }
	    finally {
	    	System.out.println("In Finally");
	    	empMap.clear();
	    }
	}


}