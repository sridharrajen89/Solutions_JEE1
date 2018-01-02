package com.project14.sql;

import java.io.*;
import java.util.*;
import java.sql.*;

public class Employee {
	
		private int employeenumber;
		private String employeeName;
		private String employeeSalary;
		
		//Default constructor
		public Employee() {
			super();
			this.employeenumber = 0;
			this.employeeName = "";
			this.employeeSalary = "";
		
		}
		
		public Employee(int employeenumber, String employeeName, String employeeSalary) {
			super();
			this.employeenumber = employeenumber;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}


		public int getEmployeenumber() {
			return employeenumber;
		}


		public void setEmployeenumber(int employeenumber) {
			this.employeenumber = employeenumber;
		}


		public String getEmployeeName() {
			return employeeName;
		}


		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}


		public String getEmployeeSalary() {
			return employeeSalary;
		}


		public void setEmployeeSalary(String employeeSalary) {
			this.employeeSalary = employeeSalary;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
			result = prime * result + ((employeeSalary == null) ? 0 : employeeSalary.hashCode());
			result = prime * result + employeenumber;
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
			if (employeeName == null) {
				if (other.employeeName != null)
					return false;
			} else if (!employeeName.equals(other.employeeName))
				return false;
			if (employeeSalary == null) {
				if (other.employeeSalary != null)
					return false;
			} else if (!employeeSalary.equals(other.employeeSalary))
				return false;
			if (employeenumber != other.employeenumber)
				return false;
			return true;
		}
		
		
		@Override
		public String toString() {
			return "Employee [employeenumber=" + employeenumber + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + "]";
		}
		
		
}
