package com.htc.practice.excecises;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.htc.practice.excecises.Employee.CompanyMap;
import com.htc.practice.excecises.Employee.DuplicateEmployeeIDException;
import com.htc.practice.excecises.Employee.EmployeeNotFoundException;

class Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int employeeId;
	  private String employeeName;
	  private double employeeSalary;
	  
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		return result;
	}
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
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
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
		
		// TODO Auto-generated constructor stub
	}
	
	class EmployeeNotFoundException extends Exception{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String errMsg;

		public EmployeeNotFoundException(String errMsg) {
			super();
			this.errMsg = errMsg;
		}

		public String getErrMsg() {
			return errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}
		
		
	}
	
	class DuplicateEmployeeIDException extends Exception{
		private static final long serialVersionUID = 1L;
		private String errMsg1;

		public DuplicateEmployeeIDException(String errMsg1) {
			super();
			this.errMsg1 = errMsg1;
		}
		public String getErrMsg1() {
			return errMsg1;
		}
	}
	
	// interface for CRUD operation
		interface ICompanyServiceProvider{
		  public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;  
		public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException; 
		  public boolean  updateEmployee(int employeeId,double newSalary) throws  EmployeeNotFoundException;
		  public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException;
		  
		}
	
	public class CompanyMap implements ICompanyServiceProvider{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int companyId;
		private String companyName;
		private String companyEmailId;
		private HashMap<Integer, Employee> empList;
		 
		
		

		public int getCompanyId() {
			return companyId;
		}

		public void setCompanyId(int companyId) {
			this.companyId = companyId;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getCompanyEmailId() {
			return companyEmailId;
		}

		public void setCompanyEmailId(String companyEmailId) {
			this.companyEmailId = companyEmailId;
		}

		public HashMap<Integer, Employee> getEmpList() {
			return empList;
		}

		public void setEmpList(HashMap<Integer, Employee> empList) {
			this.empList = empList;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + companyId;
			return result;
		}

		public CompanyMap(int companyId, String companyName, String companyEmailId, HashMap<Integer, Employee> empList) {
			super();
			this.companyId = companyId;
			this.companyName = companyName;
			this.companyEmailId = companyEmailId;
			this.empList = empList;
		}

		@Override
		public String toString() {
			return "CompanyMap [companyId=" + companyId + ", companyName=" + companyName + ", companyEmailId="
					+ companyEmailId + ", empList=" + empList + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CompanyMap other = (CompanyMap) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (companyId != other.companyId)
				return false;
			return true;
		}
		private Employee getOuterType() {
			return Employee.this;
		} 

		@Override
		public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException {
			// TODO Auto-generated method stub
			for (Entry<Integer, Employee> entry: empList.entrySet()) {
				if(entry.getKey() == obj.getEmployeeId()) {
					throw new  DuplicateEmployeeIDException("duplicate");
				}
			}		
			empList.put(obj.getEmployeeId(), obj);
			return true;
		}

		@Override
		public Employee readEmployee(int employeeId) throws EmployeeNotFoundException {
			// TODO Auto-generated method stub
			for (Entry<Integer, Employee> entry: empList.entrySet()) {
				if(entry.getKey() == employeeId) {
					return (Employee) entry;
					
				}
			}
			throw new EmployeeNotFoundException("Not found");
		}
		
		

		@Override
		public boolean updateEmployee(int employeeId, double newSalary) throws EmployeeNotFoundException {
			// TODO Auto-generated method stub
			for (Entry<Integer, Employee> entry: empList.entrySet()) {
				if(entry.getKey() == employeeId) {
					entry.getValue().setEmployeeSalary(newSalary);
			return true;
		}
	}
			
			throw new EmployeeNotFoundException("Not found");
}
			

		@Override
		public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException {
			boolean flag = false;
			// TODO Auto-generated method stub
			for (Entry<Integer, Employee> entry: empList.entrySet()) {
				if(entry.getKey() == employeeId) {
					empList.remove(employeeId);
					flag = true;
					break;
				}
			}
			if (flag) {
				return flag;
			}else
				throw new EmployeeNotFoundException("Employee not found ");
			
		}
		
	}
	
}


