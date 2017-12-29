package test.com;
import java.util.*;

public class Companymaptest {

	public static void main(String[] args) {
		
		HashMap<Integer,Employee> empmap = new HashMap<Integer,Employee>();
		
		Employee newemp1 = new Employee(1111,"Shankar S",90000);
		
		Companymap cm=new Companymap(123,"HTC","abc@htcinc.com",empmap);
		
		try
		{
		if (cm.createEmployee(newemp1)) {
			System.out.println("Employee is created");
		}
		System.out.println("Read employee..."+cm.readEmployee(1111));
		if (cm.updateEmployee(1111,10000)) {
			System.out.println("Employee Salary is updated..."+cm.readEmployee(1111));
						
		}
		if (cm.deleteEmployee(1111)) {
			System.out.println("Employee is deleted..."+cm.readEmployee(1111));
		}
		
		}
		
		catch (DuplicateEmployeeIDException dee){
			dee.printStackTrace();
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			empmap.clear();
		}
	}
	
}
