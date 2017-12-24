package com.htc.training;

import java.util.HashMap;

public class Excercise13a {

	public static void main(String[] args) {
		HashMap<Integer,Employee> h = null;
		try
		{
			Employee e1 = new Employee(101,"Suresh",10000);
			Employee e2 = new Employee(102,"Ramesh",50000);
			Employee e3 = new Employee(101,"Ganesh",20000);
			
			h = new HashMap<Integer,Employee>();
			
			CompanyMs c = new CompanyMs(201,"ABC","abc@gmail.com",h);
			boolean b1 = c.createEmployee(e1);
			if(b1)
			System.out.println("Employee1 is created is: " +e1.getEmployeeId());
			boolean b2 = c.createEmployee(e2);
			if(b2)
			System.out.println("Employee2 is created is: " +e2.getEmployeeId() );
			/*boolean b5 = c.createEmployee(e3);
			if(b5)
			System.out.println("Employee2 is created is: " +e3.getEmployeeId() );*/
			Employee e4 = c.readEmployee(e1.getEmployeeId());
			System.out.println("Employee returned is:" + e4.toString());
			boolean b3 = c.updateEmployee(e1.getEmployeeId(), 230000);
			if(b3)
				System.out.println("New salary for employee:  " +e1.getEmployeeId()+" "+e1.getEmployeeSalary());
			System.out.println("List of employees created are :" );
			for(Employee e5:h.values())
			{
				System.out.println(e5.getEmployeeId());
			}
			boolean b4 = c.deleteEmployee(e2.getEmployeeId());
			if(b4)
				System.out.println("Employeed is deleted successully");
			for(Employee e5:h.values())
			{
				System.out.println(e5.getEmployeeId());
			}
		}
		catch(EmployeeNotFoundException ENF)
		{
			ENF.printStackTrace();
		}
		catch(DuplicateEmployeeIDException DEID)
		{
			DEID.printStackTrace();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			h.clear();
		}
	}

}
