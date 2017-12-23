package com.htc.practice.excecises;

import java.util.HashMap;

import com.htc.practice.excecises.Employee.CompanyMap;
import com.htc.practice.excecises.Employee.DuplicateEmployeeIDException;
import com.htc.practice.excecises.Employee.EmployeeNotFoundException;

public class CRUDOperationUsingHashMap1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		
		try {
			Employee employee;
			CompanyMap companymap = new CompanyMap(1111, "HTC", "abcd@htcinc.com", empMap);
			
			employee = new Employee(1234,"Indra",10);

			companymap.createEmployee(employee);
			
			employee = new Employee(2345,"Kabali",11);
	
			companymap.createEmployee(employee);
			
			employee = new Employee(1100,"Basha",111);
	
			companymap.createEmployee(employee);
			
			employee = new Employee(101,"Samara",222);
		
			companymap.createEmployee(employee);
			
			employee = new Employee(123,"Arjun",2212);

			companymap.createEmployee(employee);
			
			System.out.println(companymap.readEmployee(1234));
			System.out.println(companymap.readEmployee(2345));
			System.out.println(companymap.readEmployee(1100));
			System.out.println(companymap.readEmployee(101));
			System.out.println(companymap.readEmployee(123));
			
			
			companymap.updateEmployee(1234, 12);
			
			companymap.deleteEmployee(2345);
			
		} catch(NullPointerException NP) {
			NP.printStackTrace();
		} catch (EmployeeNotFoundException NF) {
			NF.printStackTrace();
		}catch(DuplicateEmployeeIDException DUP) {
			DUP.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			empMap.clear();
		}
		
		
		
		
		/*class myKey{
			public myKey(int empId, String Name, int Salary) {
			}
			
		}
		
		HashMap<myKey, Integer> empList = new HashMap<myKey, Integer>();
		empList.put(new myKey(001,"Indra",1111), null);
		
		System.out.println(empList);*/
		
		
		
	
		
		

	}

}