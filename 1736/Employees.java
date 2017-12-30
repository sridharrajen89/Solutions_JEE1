package com.htcinc.oops.day12;

import java.util.ArrayList;

public class Employees  {
	ArrayList<EmployeeTO> empList;

	public Employees(ArrayList<EmployeeTO> empList) {
		super();
		//this.empList = new ArrayList<EmployeeTO>()
		this.empList=empList;
	}

	public ArrayList<EmployeeTO> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<EmployeeTO> empList) {
		this.empList = empList;
	}

	public ArrayList<EmployeeTO> findEmployeesInADepartment(int deptNo) {
		ArrayList<EmployeeTO> empInDeptList=new ArrayList<EmployeeTO>();
		for (EmployeeTO emp : empList) {
			if (emp.getDeptNo() == deptNo)
				empInDeptList.add(emp);
		}		
		return empInDeptList;	
	}
	
	public void showEmployees(ArrayList<EmployeeTO> arrList) {
		for (EmployeeTO emp : arrList) 
			System.out.println(emp);
	}
	
	
}
