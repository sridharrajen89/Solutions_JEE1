package com.htc.javaweek2;
import java.util.*;

class Company implements ICompanyServiceProvider 
{
	   private int companyId;
	   private String companyname;
	   private String companyEmailId;
	   private List<Employee> emplist;// has-A relation ship 
	   //Constructor	   
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

	public List<Employee> getEmplist() {
		return emplist;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + companyId;
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
		Company other = (Company) obj;
		if (companyId != other.companyId)
			return false;
		return true;
	}
	@Override
	public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException {
		boolean created = false;
		for (Employee employee : emplist) {
			if(employee.getEmployeeId()==obj.getEmployeeId()) {
				throw new DuplicateEmployeeIDException();
			}else {
				created=true;
			}
		}
		if(created) {
			emplist.add(obj);
		}
		return created;
	}
	@Override
	public Employee readEmployee(int employeeId) throws EmployeeNotFoundException {
		Employee emp1 = null;
		for (Employee employee : emplist) {
			if(employee.getEmployeeId()==employeeId) {
				emp1 = employee;
				break;
			}
		}
		if(emp1 == null) {
			throw new EmployeeNotFoundException("Employee not found for given ID ");
		}
		return emp1;
	}
	@Override
	public boolean updateEmployee(int employeeId, double newSalary) throws EmployeeNotFoundException {
		boolean salaryUpdate = false;
		for (Employee employee : emplist) {
			if(employee.getEmployeeId()==employeeId) {
				employee.setEmployeeSalary(newSalary);
				salaryUpdate = true;
				break;
			}
		}
		return salaryUpdate;
	}
	@Override
	public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException {
		boolean deleted = false;
		Employee emp = null;
		for (Employee employee : emplist) {
			if(employee.getEmployeeId()==employeeId) {
				emp = employee;
				break;
			}
		}
		if(emp == null) {
			throw new EmployeeNotFoundException("Employee not found for given ID ");
		} else {
			emplist.remove(emp);
			deleted = true;
		}
		return deleted;
	}
	 

}
