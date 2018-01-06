package com.htc.dec29;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Employee implements Externalizable
{
	  String employeeID;
	  String employeeName;
	  String password;
	  double salary;
	  String deptNO;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param employeeID
	 * @param employeeName
	 * @param password
	 * @param salary
	 * @param deptNO
	 */
	public Employee(String employeeID, String employeeName, String password, double salary, String deptNO) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.password = password;
		this.salary = salary;
		this.deptNO = deptNO;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", password=" + password
				+ ", salary=" + salary + ", deptNO=" + deptNO + "]";
	}
	
	@Override
	public void writeExternal(ObjectOutput out)
	{
		try {
		out.writeObject(password.replace("2", "5"));
		out.writeObject(employeeID);
		out.writeObject(employeeName);
		out.writeDouble(salary);
		out.writeObject(deptNO);
		
		
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException 
	{
		try
		{
			password=(String)in.readObject();
			employeeID=(String) in.readObject();
			employeeName=(String) in.readObject();
			salary=in.readDouble();
			deptNO=(String) in.readObject();
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		ArrayList<Employee> elist = new ArrayList<Employee>();
		ArrayList<Employee> DepList = new ArrayList<Employee>();
		ArrayList<Employee> DesList;
		int count=0;
		Employee e1 = new Employee("E01","Suresh","123456",45000,"D01");
		Employee e2 = new Employee("E02","Kamesh","127826",35000,"D02");
		Employee e3 = new Employee("E03","Jayesh","122843",35000,"D01");
		Employee e4 = new Employee("E04","Ramesh","122855",25000,"D01");
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		
		for(Employee e:elist)
		{
			if(e.deptNO.equals("D01"))
			{
				DepList.add(e);
				count++;
			}
		}
	System.out.println("Total no of employees under Department D01 are :"+count+" and employees details are: "+DepList);
	
    ObjectOutputStream obOut = 
            new ObjectOutputStream(new FileOutputStream("emp.txt"));
         obOut.writeObject(DepList);// serialize 
         obOut.close();
         
    ObjectInputStream obInp = 
    		new ObjectInputStream(new FileInputStream("emp.txt"));
    	DesList=(ArrayList<Employee>) obInp.readObject();//deserialize
    	System.out.println(DesList);
    	obInp.close();
	}
}
