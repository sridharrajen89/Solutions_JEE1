package com.htc.exe2;

import java.util.HashMap;

public class CompanyMain {
	
	public static void main(String[] args) {
		try
		{
			HashMap<Integer, Employee> empMap = new HashMap<>();
			HTCGlobalServices comp = new HTCGlobalServices(001,"HTCChennai",empMap);
//			Employee empobj = new Employee(1001,"Pradeep","pradee@gmail.com");
			comp.createEmp(new Employee(1001,"Pradeep","pradeep@gmail.com"));
			comp.createEmp(new Employee(1002,"Appu","Appu@gmail.com"));
			comp.createEmp(new Employee(1003,"Pujith","pujith@gmail.com"));
			System.out.println(comp.readEmp(1001));
			comp.updateEmp(1003, "Poojith");
			System.out.println(comp);
			comp.deleteEmp(1002);
			System.out.println(comp);
			comp.readEmp(1002);
		}
		catch(InvalidEmployeeException IEE){
			IEE.printStackTrace();
		}
		catch(Exception E) {
			E.printStackTrace();
		}
			
		
	}

}
