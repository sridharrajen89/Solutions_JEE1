package com.htcinc.oops.day12;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeTO implements Externalizable {
	
	private int employeeId;
	private String employeeName;
	private String password;
	private double salary;
	private int deptNo;
	
	public EmployeeTO(int employeeId, String employeeName, String password, double salary, int deptNo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.salary = salary;
		this.deptNo = deptNo;
	}
	
	public EmployeeTO(EmployeeTO emp) {
		super();
		this.employeeId = emp.getEmployeeId();
		this.employeeName = emp.getEmployeeName();
		this.password = emp.getPassword();
		this.salary = emp.getSalary();
		this.deptNo = emp.getDeptNo();
	}
	public EmployeeTO(Object emp) {
		super();
		this.employeeId = ((EmployeeTO)(emp)).getEmployeeId();
		this.employeeName = ((EmployeeTO)(emp)).getEmployeeName();
		this.password = ((EmployeeTO)(emp)).getPassword();
		this.salary = ((EmployeeTO)(emp)).getSalary();
		this.deptNo = ((EmployeeTO)(emp)).getDeptNo();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", password=" + password
				+ ", salary=" + salary + ", deptNo=" + deptNo + "]";
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
		EmployeeTO other = (EmployeeTO) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(this.employeeId);
		out.writeObject(this.employeeName);
		StringBuffer temp=new StringBuffer(this.password);
		out.writeObject(temp.reverse().toString());
		out.writeObject(this.salary);
		out.writeObject(this.deptNo);
		
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
		this.employeeId=in.readInt();
		this.employeeName=(String)in.readObject();
		StringBuffer temp=new StringBuffer((String)in.readObject());
		this.password=temp.reverse().toString();
		this.salary=in.readDouble();
		this.deptNo=in.readInt();
		
		
	}
	
	
	

}
