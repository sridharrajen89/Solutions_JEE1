
package com.htcinc.oops.day12;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		EmployeeTO emp1=new EmployeeTO(1,"John Smith","123456",200.01,101);
		EmployeeTO emp2=new EmployeeTO(2,"Amanda Noir","Noir101",199.91,101);
		EmployeeTO emp3=new EmployeeTO(3,"Mukesh Amba","Amba103",221.14,103);
		EmployeeTO emp4=new EmployeeTO(4,"Rahul Gopi","Rahul211",211.12,101);
		EmployeeTO emp5=new EmployeeTO(5,"Narendra Lal","Lal103",216.01,103);
		EmployeeTO emp6=new EmployeeTO(6,"Poondi Topiwala","Topi101",196.03,101);
		EmployeeTO emp7=new EmployeeTO(7,"Augustine Campbell","Camp1001",210.01,101);
		EmployeeTO emp8=new EmployeeTO(8,"Benjamin Notu","Notu007",190.01,103);
		EmployeeTO emp9=new EmployeeTO(9,"Rahat Fateull","Fate0505",205.05,101);
		EmployeeTO emp10=new EmployeeTO(10,"Ravi Posterwala","Ravi101",219.91,101);
		
		ArrayList<EmployeeTO> empList=new ArrayList<EmployeeTO>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		empList.add(emp9);
		empList.add(emp10);
		
		Employees emp=new Employees(empList);
		
		
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Nagender\\Desktop\\HTC Java\\Dec 29, 2017\\Employees-101.ser"));
		
		ArrayList<EmployeeTO> empDept101= emp.findEmployeesInADepartment(101);
		
		//Serializing all the employees that are in department 101.
		for (EmployeeTO empto : empDept101) {
			System.out.println(empto);
			oos.writeObject(empto);	
		}
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Nagender\\Desktop\\HTC Java\\Dec 29, 2017\\Employees-101.ser"));
		ArrayList<EmployeeTO> empDept101read = new ArrayList<EmployeeTO>();
		
		// Issue : How to read multiple records from the serialized file
		while (true) {
	
			try {
					//System.out.println("Inside loop :");
					//EmployeeTO emptoread=(EmployeeTO) ois.readObject();
					//System.out.println("Inside loop :" + emptoread);
					//empDept101read.add(emptoread);
				//empDept101read.add((EmployeeTO) ois.readObject());

				System.out.println(ois.readInt());
				System.out.println((String) ois.readObject());
				System.out.println((String) ois.readObject());
				System.out.println(ois.readDouble());
				System.out.println(ois.readInt());
				
				
			} catch (EOFException eofe) {
				eofe.printStackTrace();
			}
			
			for (EmployeeTO empto : empDept101read) {
				System.out.println(empto);	
			}
		//emp.showEmployees(empDept101read);
		
		}

	}

}
